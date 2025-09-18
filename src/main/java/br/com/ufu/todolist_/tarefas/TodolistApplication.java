package br.com.ufu.todolist_.tarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication: Esta é a anotação mais importante.
 * Ela combina três outras anotações:
 * 1. @Configuration: Marca a classe como uma fonte de configurações para a aplicação.
 * 2. @EnableAutoConfiguration: Pede ao Spring Boot para tentar configurar
 * automaticamente a aplicação com base nas dependências que ele encontra (ex: configurar
 * o Tomcat porque encontrou o Spring Web).
 * 3. @ComponentScan: Diz ao Spring para procurar por outros componentes (como
 * @RestController, @Repository, etc.) no mesmo pacote e em seus sub-pacotes.
 */
@SpringBootApplication
class TodolistApplication {

    /**
     * O método main é o ponto de entrada da aplicação, como em qualquer
     * programa Java.
     * A linha SpringApplication.run(...) é o que de fato inicia a aplicação.
     */
    public static void main(String[] args) {
        SpringApplication.run(TodolistApplication.class, args);
    }

}
