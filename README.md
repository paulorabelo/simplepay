# simplepay
Backend de pagamentos em Java e SpringBoot

Cenário:
Dois tipos de usuários (usuário / lojista), com carteira que realizam transferência entre si.
- Documento (CPF / CNPJ) único no sistema
- Usuário faz transferência para Usuário e lojista
- Lojista apenas recebe transferência
- Validação de saldo antes da transferência
- Para finalizar transferência é consultado serviço autorizador externo.
- Operação de transferência é uma transação (podendo ser revertida em qualquer caso de inconsistência)
- Envio de notificação para usuário ou lojista (serviço de terceiro - em implantação)
- Serviço tipo RESTFul

## Tecnologias empregadas

- Java
- Spring
  - Spring Web (WEB)
    - webapp
    - RESTFul
    - MVC
    - Apache Tomcat
  - Spring Boot DevTools (Developer Tools)
    - Fast application restarts
    - LiverReload
  - Spring Data JPA (SQL)
    - Persistir dados em SQL DBs usando Spring Data e Hibernate.
  - H2 Database (SQL)
    - Banco de dados em memória que suporta API JDBC e acesso R2DBC.
  - Lombok (Developer Tools)
    - Biblioteca de anotação Java que ajuda a reduzir o código.
  - Spring Security (em desenvolvimento)
  - JWT Library (em desenvolvimento)
- Cloud (em desenvolvimento)
  - AWS
  - GCP
  - Oracle
  - Azure
- Docker (em desenvolvimento)
  - Servidor SQL (MySQL / PostGres / MariaDB)