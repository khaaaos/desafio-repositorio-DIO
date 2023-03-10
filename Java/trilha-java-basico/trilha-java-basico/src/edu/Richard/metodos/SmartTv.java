package edu.Richard.metodos;

public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }
    public void canal_mais(){
        canal++;
    }
    public void canal_menos(){
        canal--;
    }
    public void definir_canal(int num){
        canal = num;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
}
