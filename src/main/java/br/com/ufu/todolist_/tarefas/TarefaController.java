package br.com.ufu.todolist_.tarefas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @RestController: Anotação que combina @Controller e @ResponseBody.
 * Define que esta classe é um controlador REST e seus métodos retornarão
 * dados (como JSON) diretamente no corpo da resposta HTTP.
 *
 * @RequestMapping("/tarefas"): Mapeia todas as requisições que começam
 * com a URL "/tarefas" para os métodos dentro desta classe.
 */
@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    /**
     * @Autowired: Mecanismo de Injeção de Dependência do Spring.
     * Em vez de nós mesmos criarmos uma instância do repositório (ex: new ITarefaRepository()),
     * nós pedimos para o Spring "injetar" uma instância gerenciada por ele aqui.
     * Isso desacopla nosso código e facilita os testes.
     */
    @Autowired
    private ITarefaRepository tarefaRepository;

    /**
     * Este método será acionado por uma requisição HTTP POST para "/tarefas/".
     * @PostMapping: Mapeia requisições do tipo POST.
     * @RequestBody: Indica que os dados da tarefa virão no corpo (body) da requisição,
     * em formato JSON, e o Spring deve convertê-los para um objeto Tarefa.
     *
     * ResponseEntity permite controlar o status HTTP da resposta (ex: 201 CREATED).
     */
    @PostMapping("/")
    public ResponseEntity criarTarefa(@RequestBody Tarefa tarefaModel) {
        tarefaModel.setDataDeCriacao(LocalDateTime.now());
        var tarefaCriada = this.tarefaRepository.save(tarefaModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(tarefaCriada);
    }

    /**
     * Este método será acionado por uma requisição HTTP GET para "/tarefas/".
     * @GetMapping: Mapeia requisições do tipo GET.
     */
    @GetMapping("/")
    public List<Tarefa> listarTarefas() {
        return this.tarefaRepository.findAll();
    }
}