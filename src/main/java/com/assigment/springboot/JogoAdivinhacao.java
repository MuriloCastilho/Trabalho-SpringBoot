package com.assigment.springboot;

import java.util.Random;

import java.util.Random;

public class JogoAdivinhacao {

    private int numeroSecreto;
    private boolean jogoEncerrado;
    private int tentativas;

    public JogoAdivinhacao() {
        this.numeroSecreto = new Random().nextInt(5) + 1;
        this.jogoEncerrado = false;
        this.tentativas = 0;
    }

    public String adivinhar(int tentativa) {
        tentativas++;

        if (tentativa == numeroSecreto) {
            jogoEncerrado = true;
            return "Parabéns! Você adivinhou o número em " + tentativas + " tentativas.";
        } else if (tentativa < numeroSecreto) {
            return "Tente um número maior.";
        } else {
            return "Tente um número menor.";
        }
    }
    
    public void resetar() {
        this.numeroSecreto = new Random().nextInt(100) + 1;
        this.jogoEncerrado = false;
        this.tentativas = 0;
    }

    public boolean isJogoEncerrado() {
        return jogoEncerrado;
    }
}