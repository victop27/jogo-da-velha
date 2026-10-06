/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.jogodavelha;

import java.util.Scanner;

/**
 *
 * @author victor57780717
 */
public class JogoDaVelha {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
                
        Tabuleiro tabuleiro = new Tabuleiro("1 - Cada jogador deve escolher um simbolo;"
                + " 2 - O jogador 1 inicia a partida;");
        
        
        Jogador jogador1 = new Jogador(1, "Victor", 'X');
        Jogador jogador2 = new Jogador(2, "João", 'O');

        do{
            tabuleiro.mostrarTabuleiro();
            
            if(tabuleiro.getJogadorDaVez() == 1){
                System.out.println("Jogador 1, escolha onde jogar: ");
                String local = entrada.nextLine();
                
                tabuleiro.marcarJogada(jogador1.getSimbolo(), local);
                tabuleiro.setJogadorDaVez(2);
                tabuleiro.mostrarTabuleiro();
            }
            else{
               System.out.println("Jogador 2, escolha onde jogar: "); 
               String local = entrada.nextLine();
            }
            
            
        }while(tabuleiro.isHouveGanhadorUltimaRodada() == false);
    }
}
