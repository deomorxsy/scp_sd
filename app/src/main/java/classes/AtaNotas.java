package classes;

public class AtaNotas {
    private Professor professor;
    private ConjuntoNotas[] notas;

    public AtaNotas() {
    };

    public AtaNotas(Professor professor, Disciplina disciplina, ConjuntoNotas[] notas) {
        this.professor = professor;
        this.notas = notas;
    };

    public void setProfessor(Professor professor) {
        this.professor = professor;
    };

    public void setConjuntoNotass(ConjuntoNotas[] notas) {
        this.notas = notas;
    };

    public Professor getProfessor() {
        return this.professor;
    };

    public ConjuntoNotas[] getConjuntoNotass() {
        return this.notas;
    };
};
