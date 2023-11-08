package pessoa;

public class Pessoa {
    // nome, idade, cpf
    // tipo nomeDaVariavel

    //atributo
    private String nome;
    private int idade;
    private String cpf;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //metodo:
    String imprimirDadosDaPessoa(){
        return "O nome da pessoa é " + nome + " a idade é " + idade + " e o cpf é " + cpf;
    }

}
