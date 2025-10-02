# Betterboxd API - Workshop SEMITI

![Status do Projeto](https://img.shields.io/badge/status-concluído-brightgreen)

> Projeto de uma API REST para gerenciamento de usuários, desenvolvido como parte do workshop "Primeira API com Spring Boot" na feira de tecnologia SEMITI.

Este projeto foi criado para aplicar de forma prática os conceitos de desenvolvimento back-end com Java e Spring Boot.

## 🚀 Funcionalidades (Endpoints da API)

A API oferece as seguintes funcionalidades para o recurso de usuários:

* **`GET /usuarios`**: Lista todos os usuários cadastrados.
* **`GET /usuarios/{id}`**: Busca um usuário específico pelo seu ID.
* **`POST /usuarios`**: Cria um novo usuário.
* **`PUT /usuarios/{id}`**: Atualiza os dados de um usuário existente.
* **`DELETE /usuarios/{id}`**: Deleta um usuário.

### 🛠️ Tecnologias utilizadas
- Java 17+
- Spring Boot (Spring Web, Spring Data JPA)
- Maven (com ./mvnw disponível)
- H2 (in-memory)
- Lombok

### Requisitos
- Java 17+
- Maven
- Rede/porta livre (padrão: **`localhost:8080`**)


## 🏛️ Arquitetura do Projeto

O projeto segue uma arquitetura em camadas, dividindo as responsabilidades para garantir um código mais organizado, testável e de fácil manutenção:

* **Entities**: Camada de objetos que representam as tabelas do banco de dados.
* **Repository**: Camada de acesso a dados, responsável pela comunicação com o banco de dados.
* **Service**: Camada de regras de negócio da aplicação.
* **DTO (Data Transfer Object)**: Objetos para transferência de dados entre as camadas.
* **Controller**: Camada responsável por expor os endpoints da API e lidar com as requisições HTTP.

## ✨ Agradecimentos e Créditos

Este projeto é um resultado direto do aprendizado adquirido no workshop **"Primeira API com Spring Boot"**, ministrado por **Atos Alves** e **Robson Batista** durante o evento **SEMITI** 

Agradeço imensamente aos instrutores pelo conteúdo de alta qualidade e pela didática.

O projeto original que serviu como base para o workshop pode ser encontrado aqui:
* [**robsoncaliban/workshop-betterboxd**](https://github.com/robsoncaliban/workshop-betterboxd)

## 📄 Licença

Este projeto está sob a licença MIT.