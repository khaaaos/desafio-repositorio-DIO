package edu.Richard.metodos;
/**
 * Trilha Java Básico - DIO
 *
 * @author Richard Willer
 * @version 1.0
 * @since 2023
 */
public class Metodo {
    public static void main(String[] args) {
        /** Operações básicas de uma TV:
         * Executa funções como ligar e desligar
         * Aumentar e diminuir volume
         * Trocar de canal um por um, ou definir um canal específico
         */

        SmartTv smartTv = new SmartTv();

        System.out.println("Estado da TV: " + smartTv.ligado);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("\nEstado da TV: " + smartTv.ligado);
        smartTv.canal_mais();
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.canal_menos();
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.definir_canal(15);
        System.out.println("\nCanal Atual: " + smartTv.canal);
        smartTv.aumentarVolume();
        System.out.println("\nVolume Atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume Atual: " + smartTv.volume);
    }
}
