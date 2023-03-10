package edu.Richard.operadores;

public class Operadores {
    public static void main(String[] args) {
        /*String nomeCompleto = "Linguagem" + " " + "Java";
        System.out.println(nomeCompleto);

        System.out.println(1 + 1 + 1 + "1");
        System.out.println(1 + "1" + 1 + 1);
        System.out.println(1 + "1" + 1 + "1");
        System.out.println("1" + 1 + 1 + 1);
        System.out.println("1" + (1 + 1 + 1));*/

        int a, b;
        a = 6;
        b = 6;

        String resultado = a == b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

        String nomeUm = "RICHARD";
        String nomeDois = new String("RICHARD");

        System.out.println(nomeUm == nomeDois);

        System.out.println(nomeUm.equals(nomeDois));

        System.out.println(nomeUm == nomeDois || a == b);

        System.out.println(nomeUm == nomeDois && a == b);
    }
}
