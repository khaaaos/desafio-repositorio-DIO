package edu.Richard.variaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;

        short numeroCurto2 = (short) numeroNormal;

        final int ANO_INICIO = 2023;

        System.out.println(ANO_INICIO);
    }
}
