package edu.Richard.anatomia;

public class MinhaClasse {

    public static void main(String [] args){
        System.out.println("Hello World!");
        String priNome = "Richard";
        String segNome = "Willer";
        System.out.print("Resultado do Método: " + nomeCompleto(priNome, segNome));
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
