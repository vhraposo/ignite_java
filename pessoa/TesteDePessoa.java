package pessoa;

public class TesteDePessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setCpf("3213213123");
        pessoa1.setIdade(30);
        pessoa1.setNome("Victor");

        //System.out.println(pessoa1.imprimirDadosDaPessoa());

        Professor professor = new Professor();
        professor.setCpf("3213213123");
        professor.setIdade(32);
        professor.setNome("Monica");
        professor.setSalario(8000);

        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno();
        aluno.setCpf("3213213123");
        aluno.setIdade(32);
        aluno.setNome("Gabriel");
        aluno.setMatricula("123123");

        System.out.println(aluno.imprimirDadosDaPessoa());    
    }
}
