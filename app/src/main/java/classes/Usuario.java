package classes;

import java.time.LocalDate;

public class Usuario {
    protected String cpf;
    protected String nome;
    protected LocalDate dataNascimento;

    public Usuario() {
    };

    public Usuario(String cpf, String nome /*LocalDate dataNascimento*/) {
        this.cpf = cpf;
        this.nome = nome;
        /*this.dataNascimento = dataNascimento;*/
    };

    public void setCPF(String cpf) {
        this.cpf = cpf;
    };

    public void setNome(String nome) {
        this.nome = nome;
    };

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    };

    public String getCPF() {
        return this.cpf;
    };

    public String getNome() {
        return this.nome;
    };

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    };
};