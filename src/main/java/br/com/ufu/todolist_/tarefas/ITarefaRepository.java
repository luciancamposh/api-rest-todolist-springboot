package br.com.ufu.todolist_.tarefas;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITarefaRepository extends JpaRepository<Tarefa, Long> {

}