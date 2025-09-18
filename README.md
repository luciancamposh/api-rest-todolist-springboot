# API REST para Lista de Tarefas com Spring Boot

![Java](https://img.shields.io/badge/Java-17-blue?style=for-the-badge&logo=java)
![Spring](https://img.shields.io/badge/Spring_Boot-3.3-green?style=for-the-badge&logo=spring)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?style=for-the-badge&logo=mysql)


API RESTful para um sistema de Lista de Tarefas (To-Do List), desenvolvida como um projeto de portfólio para demonstrar habilidades em desenvolvimento backend com Java e o ecossistema Spring. Este projeto foi criado como parte de um processo de apresentação.

## Features

- [x] Criação de novas tarefas.
- [x] Listagem de todas as tarefas cadastradas.
- [ ] Atualização de tarefas existentes (Próximo passo!).
- [ ] Exclusão de tarefas (Próximo passo!).

##  Tecnologias Utilizadas


- **Linguagem:** Java 17
- **Framework:** Spring Boot 3
- **Módulos Spring:**
    - Spring Web: Para a criação de endpoints REST.
    - Spring Data JPA: Para a persistência de dados e comunicação com o banco.
- **Banco de Dados:** MySQL 8
- **Gerenciador de Dependências:** Maven
- **Utilitários:** Lombok

##  Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina:
- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [MySQL Server](https://dev.mysql.com/downloads/mysql/)
- [Git](https://git-scm.com/)
- [Postman](https://www.postman.com/downloads/) (ou similar, para testar a API)

## 🚀 Como Executar o Projeto


Siga os passos abaixo para executar o projeto localmente:

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/luciancamposh/api-rest-todolist-springboot.git](https://github.com/luciancamposh/api-rest-todolist-springboot.git)
    cd api-rest-todolist-springboot
    ```
    [//]: # (Lembre-se de verificar se a URL do seu clone está correta!)

2.  **Configure o Banco de Dados:**
    - Conecte-se ao seu MySQL e crie o banco de dados para o projeto:
      ```sql
      CREATE DATABASE todolist_db;
      ```
    - Na pasta do projeto, encontre o arquivo `src/main/resources/application.properties.example`.
    - Crie uma cópia deste arquivo e renomeie-a para `application.properties`.
    - Abra o `application.properties` e substitua os valores `seu_usuario_mysql` e `sua_senha_mysql` pelas suas credenciais de acesso ao MySQL.

3.  **Execute a Aplicação:**
    - A forma mais simples é abrir o projeto em sua IDE (como o IntelliJ ou Eclipse) e executar a classe principal `TodolistApplication.java`.
    - Alternativamente, pelo terminal, você pode usar o Maven Wrapper:
      ```bash
      # No Linux/macOS
      ./mvnw spring-boot:run

      # No Windows
      mvnw.cmd spring-boot:run
      ```
    O servidor iniciará na porta `8080`.

##  Endpoints da API

A URL base da API é `http://localhost:8080`

[//]: # (Documentar seus endpoints mostra que você sabe como uma API deve ser usada.)
### Tarefas (`/tarefas`)

#### Criar uma Tarefa
Cria uma nova tarefa no banco de dados.

- **Método:** `POST`
- **URL:** `/tarefas/`
- **Body (corpo da requisição):**
  ```json
  {
      "descricao": "Estudar para a prova de Algoritmos II",
      "prioridade": "Alta",
      "finalizado": false
  }
  ```
- **Resposta de Sucesso (201 Created):**
  ```json
  {
      "id": 1,
      "descricao": "Estudar para a prova de Algoritmos II",
      "prioridade": "Alta",
      "finalizado": false,
      "dataDeCriacao": "2025-09-18T14:30:00.123456"
  }
  ```

#### Listar Todas as Tarefas
Retorna uma lista com todas as tarefas cadastradas.

- **Método:** `GET`
- **URL:** `/tarefas/`
- **Resposta de Sucesso (200 OK):**
  ```json
  [
      {
          "id": 1,
          "descricao": "Estudar para a prova de Algoritmos II",
          "prioridade": "Alta",
          "finalizado": false,
          "dataDeCriacao": "2025-09-18T14:30:00.123456"
      }
  ]
  ```

## ✒️ Autor

Desenvolvido por **[Lucian Campos Herculano]**.

- **LinkedIn:** `https://www.linkedin.com/in/lucian-c-h`
- **GitHub:** `https://github.com/luciancamposh`
