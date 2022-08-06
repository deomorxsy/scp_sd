package classes;

import java.time.LocalDate;

public class Professor extends Usuario {
    private String registro;
    private Disciplina disciplina;

    public Professor() {
    };

    public Professor(String cpf, String nome, LocalDate dataNascimento, String registro, Disciplina disciplina) {
        super(cpf, nome, dataNascimento);
        this.registro = registro;
        this.disciplina = disciplina;
    };

    public void setRegistro(String registro) {
        this.registro = registro;
    };

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    };

    public String getRegistro() {
        return this.registro;
    };

    public Disciplina getDisciplina() {
        return this.disciplina;
    };
}
