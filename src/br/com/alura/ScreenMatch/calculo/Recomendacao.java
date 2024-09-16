package br.com.alura.ScreenMatch.calculo;

public class Recomendacao {

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Esse titulo está entre os mais visados do momento");
        }else{
            System.out.println("Esse titulo não está com nada");
        }

    }
}
