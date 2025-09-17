package ufu.ej.democompacto;

public class Aluno {
    private int id;
    private String nome;
    private String curso;
    private int periodo;

    // Getters e Setters...
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
    public int getPeriodo() { return periodo; }
    public void setPeriodo(int periodo) { this.periodo = periodo; }

    @Override
    public String toString() {
        return String.format(
                "Aluno [ID: %d, Nome: %s, Curso: %s, Período: %d]",
                id, nome, curso, periodo
        );
    }
}