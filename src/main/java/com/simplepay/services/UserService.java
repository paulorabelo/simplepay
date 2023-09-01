package com.simplepay.services;

import com.simplepay.domain.user.User;
import com.simplepay.domain.user.UserType;
import com.simplepay.dtos.UserDTO;
import com.simplepay.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public void validateTransaction(User sender, BigDecimal amount) throws Exception {
        if(sender.getUserType() == UserType.MERCHANT){
            throw new Exception("Usuário tipo LOJISTA não autorizado a realizar transações");
        }

        if(sender.getBalance().compareTo(amount) < 0){
            throw new Exception("Saldo Insuficiente");
        }
    }

    public User findUserById(Long id) throws Exception {
        return this.repository.findUserById(id).orElseThrow(() -> new Exception("Usuário não encontrado"));
    }

    public User createUser(UserDTO data){
        User newUser = new User(data);
        this.saveUser(newUser);
        return newUser;
    }

    public List<User> getAllUsers(){
        return this.repository.findAll();
    }
    public void saveUser(User user){
        this.repository.save(user);
    }


}
