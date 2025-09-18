# Projeto de Demonstração: Conexão Java com MySQL (POO)

Este é um projeto Java que demonstra como estruturar uma aplicação com conexão a um banco de dados MySQL utilizando princípios de **Programação Orientada a Objetos (POO)**. O código é organizado seguindo o padrão **Data Access Object (DAO)** para separar as responsabilidades.

Este projeto foi aprimorado para ser um exemplo robusto de arquitetura de software para estudantes, ideal para apresentação à EJ da UFU.

##  Arquitetura do Projeto

O projeto está dividido em três camadas principais:

* **Model (`model/Aluno.java`)**: Representa a entidade de dados. É uma classe POJO que encapsula os atributos de um aluno.
* **DAO (`dao/AlunoDAO.java`)**: Camada de acesso a dados. Contém toda a lógica SQL para buscar e manipular os dados dos alunos no banco, abstraindo essa complexidade do resto da aplicação.
* **Application (`Main.java`)**: A camada de "apresentação" ou o ponto de entrada. Orquestra as operações, utilizando o DAO para interagir com o banco e o Model para transportar os dados.

##  Tecnologias Utilizadas

* **Java 11**
* **MySQL 8**
* **Maven** para gerenciamento de dependências.

## ⚙️ Configuração e Execução

(As seções de pré-requisitos, configuração e execução permanecem as mesmas da versão anterior)

...

##  O que este projeto demonstra

* **Programação Orientada a Objetos (POO)**:
    * **Encapsulamento**: Os dados do aluno estão protegidos na classe `Aluno`.
    * **Abstração**: A classe `AlunoDAO` esconde toda a complexidade do acesso ao banco de dados.
    * **Separação de Responsabilidades**: Cada classe tem um propósito único e bem definido.
* **Padrão de Projeto DAO (Data Access Object)**: Uma abordagem padrão de mercado para organizar a persistência de dados.
* **Uso de `PreparedStatement`**: Forma segura e eficiente de executar consultas SQL, prevenindo ataques de SQL Injection.
* **Mapeamento Objeto-Relacional (ORM) manual**: Transformação dos dados de uma tabela relacional (`ResultSet`) em uma lista de objetos Java (`List<Aluno>`).