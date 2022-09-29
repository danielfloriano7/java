/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facul;

import javax.swing.JOptionPane;

public class Games {
    private String nomeJogos;
    private String genero;
    private Boolean zerado;
    
    
    public Games(String nome, String g, Boolean z) {
        this.nomeJogos = nome;
        this.genero = g;
        this.zerado = z;
    }
    
    @Override
    public String toString() {
        return "Jogo: " + this.nomeJogos + " Genero: " + this.genero + " Zerou: " + this.zerado + "\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void incluirJogos() {
        nomeJogos = JOptionPane.showInputDialog(null, "Digite o nome do Jogo:");
        genero = JOptionPane.showInputDialog(null, "Digite o gênero do Jogo:");
    }
    
    public void mostrarJogos() {
        JOptionPane.showMessageDialog(null, "Nome do Jogo: " + nomeJogos + "\nGênero: " + genero);
    }
    
    public void listarJogos(String z) {
        z = JOptionPane.showInputDialog(null, "Voçê zerou?");
        
        if(z.equals("Sim") || z.equals("sim")) {
            zerado = true;
            JOptionPane.showMessageDialog(null, "Jogo Zerado");
            
        }else if(z.equals("Não") || z.equals("não")) {
            zerado = false;
            JOptionPane.showMessageDialog(null, "Jogo não Zerado");
        }
        
    }

    public void removerJogos() {
        
        
    }
}
