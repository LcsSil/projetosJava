package com.mycompany.primeiroprograma;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        exibirMensagemBoasVindas();
        exibirDataHoraAtual();
    }

    public static void exibirMensagemBoasVindas() {
        System.out.println("Olá, Mundo!");
        System.out.println("Esse é o meu primeiro programa em Java 🚀");
    }

    public static void exibirDataHoraAtual() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Executado em: " + agora.format(formato));
    }
}
