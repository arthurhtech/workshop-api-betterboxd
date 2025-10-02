# Betterboxd API - Workshop SEMITI

![Status do Projeto](https://img.shields.io/badge/status-concluído-brightgreen)

> Projeto de uma API REST para gerenciamento de filmes, desenvolvido como parte do workshop "Primeira API com Spring Boot" na feira de tecnologia SEMITI.

Este projeto foi criado para aplicar de forma prática os conceitos de desenvolvimento back-end com Java e Spring Boot.

## 🚀 Funcionalidades (Endpoints da API)

### Categorias
- **GET /categorias**: Lista todas as categorias cadastradas.
- **POST /categorias**: Cria uma nova categoria.

### Filmes
- **POST /filmes**: Cria um novo filme.


## 🛠️ Tecnologias Utilizadas

As seguintes ferramentas e tecnologias foram utilizadas na construção do projeto:

* **Java**: Versão 21.
* **Spring Boot**: Framework principal para a construção da API.
* **Maven**: Gerenciador de dependências e build do projeto.
* **Lombok**: Biblioteca para reduzir código boilerplate.
* **H2**: Banco de Dados em Memória, versátil para testes.

## Pré-requisitos:
* JDK 17 ou superior
* Rede/porta livre (padrão: `localhost:8080`)
* Git


## 🏛️ Arquitetura do Projeto

O projeto segue uma arquitetura em camadas, dividindo as responsabilidades para garantir um código mais organizado, testável e de fácil manutenção:

* **Entities**: Camada de objetos que representam as tabelas do banco de dados.
* **Repository**: Camada de acesso a dados, responsável pela comunicação com o banco de dados.
* **Service**: Camada de regras de negócio da aplicação.
* **DTO (Data Transfer Object)**: Objetos para transferência de dados entre as camadas, evitando a exposição das entidades.
* **Controller**: Camada de apresentação, responsável por expor os endpoints da API e lidar com as requisições HTTP.

## ✨ Agradecimentos e Créditos

Este projeto é um resultado direto do aprendizado adquirido no workshop **"Primeira API com Spring Boot"**, ministrado por **Atos Alves** e **Robson Batista** durante o evento **SEMITI** 

Agradeço imensamente aos instrutores pelo conteúdo de alta qualidade e pela didática.

O projeto original que serviu como base para o workshop pode ser encontrado aqui:
* [**robsoncaliban/workshop-betterboxd**](https://github.com/robsoncaliban/workshop-betterboxd)

## 📄 Licença

Este projeto está sob a licença MIT.