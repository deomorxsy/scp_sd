package classes;

import java.util.ArrayList;
import java.time.LocalDate;

public class Estudante extends Usuario {
    private String matricula;
    ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Estudante() {
    };

    public Estudante(String cpf, String nome, LocalDate dataNascimento, String matricula) {
        super(cpf, nome, dataNascimento);
        this.matricula = matricula;
    };

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    };

    public void setDisciplinas(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    };

    public String getMatricula() {
        return this.matricula;
    };

    public ArrayList<Disciplina> getDisciplinas() {
        return this.disciplinas;
    };
}
