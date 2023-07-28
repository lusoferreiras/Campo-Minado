package com.udemy.cm;

import com.udemy.cm.models.Tabuleiro;
import com.udemy.cm.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6,6,6);

        new TabuleiroConsole(tabuleiro);
    }
}
