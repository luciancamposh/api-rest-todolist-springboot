package ufu.ej.democompacto;

import java.util.List;


public class main {

    public static void main(String[] args) {
        AlunoDAO alunoDAO = new AlunoDAO();
        int periodoParaBuscar = 3;

        System.out.printf("Buscando alunos do %dº período...%n", periodoParaBuscar);

        List<Aluno> alunosEncontrados = alunoDAO.findByPeriodo(periodoParaBuscar);

        if (alunosEncontrados.isEmpty()) {
            System.out.println("Nenhum aluno encontrado para este período.");
        } else {
            System.out.println("\n--- Alunos Encontrados ---");
            for (Aluno aluno : alunosEncontrados) {
                System.out.println(aluno);
            }
        }
        System.out.println("\nBusca finalizada.");
    }
}