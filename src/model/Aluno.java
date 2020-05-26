/*
 * Classe que imprementa objetos do tipo Aluno.
 */
package model;

public class Aluno {
    
    // declaração de variáveis de instância
    private String ra;
    private String nome;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String telefone;
    
    public Aluno(){
    }

    public Aluno(String ra, String nome, String endereco, String bairro,
            String cidade, String uf, String telefone) {
        this.ra = ra;
        this.nome = nome;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.telefone = telefone;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "\nDados do Aluno\n"
                + "\nRA: " + ra
                + "\nNome: " + nome
                + "\nEndereço: " + endereco 
                + "\nBairro: " + bairro
                + "\nCidade: " + cidade
                + "\nEstado: " + uf 
                + "\nTelefone: " + telefone;
    }
    
}
