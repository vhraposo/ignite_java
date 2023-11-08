package excecoes;

import pessoa.Pessoa;

public class Excecoes {
    // Checked Exceptions: 

    // Unchecked Exceptions

    public static void main(String[] args) {
        // try{
        //     validarNumero();
        // }catch (Exception e){
        //     System.out.println("Ocorreu um erro: " + e.getMessage());
        //     e.printStackTrace();
        // }
        Pessoa p = null;
        p.getCpf();
    }

    public static void validarNumero()throws Exception{
        int numero = 10;
        if(numero < 100){
            throw new RuntimeException("O número não pode ser menor que 100");
        }
    }
}
