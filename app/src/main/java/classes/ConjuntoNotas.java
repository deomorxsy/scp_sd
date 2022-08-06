package classes;

public class ConjuntoNotas {
    private Estudante estudante;
    private Disciplina disciplina;
    private float nota01;
    private float nota02;
    private float media;

    public ConjuntoNotas() {
    };

    public ConjuntoNotas(Estudante estudante, Disciplina disciplina, float nota01, float nota02) {
        this.estudante = estudante;
        this.disciplina = disciplina;
        this.nota01 = nota01;
        this.nota02 = nota02;
    };

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    };

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    };

    public void setMedia() {
        this.media = (this.nota01 + this.nota02) / 2;
    };

    public Estudante getEstudante() {
        return this.estudante;
    };

    public Disciplina getDisciplina() {
        return this.disciplina;
    };

    public float getNota01() {
        return this.nota01;
    };

    public float getNota02() {
        return this.nota02;
    };

    public float getMedia() {
        setMedia();
        return this.media;
    };
};
