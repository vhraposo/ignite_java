package pessoa;

public class Professor extends Pessoa{

    private double salario;

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Sobrescreveu o método imprimirDadosDaPessoa (Polimorfismo)
    String imprimirDadosDaPessoa(){
        System.out.println(super.imprimirDadosDaPessoa());
        return "Você é professor";
    }
    
}
