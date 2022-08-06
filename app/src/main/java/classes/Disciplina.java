package classes;

public class Disciplina {
    private String nome;
    private int cargaHoraria;

    public Disciplina() {
    };

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    };

    public void setNome(String nome) {
        this.nome = nome;
    };

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    };

    public String getNome() {
        return this.nome;
    };

    public int getCargaHoraria() {
        return this.cargaHoraria;
    };
}
