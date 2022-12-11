package facul;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Principal {
 
   
    public static void procura() {
        int procurar = 1;
        
                procurar = Integer.parseInt(JOptionPane.showInputDialog(null, "Oque voce quer fazer?\n"
                + "Mostrar a lista completa[1]\n"
                + "Procurar pelo generos[2]\n"
                + "Lista de jogos que zerei[3]\n"
                + "Lista de jogos que não zerei[4]"));
        
        switch (procurar) {
            case 1 -> {
                
            }
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            case 4 -> System.out.println("4");
            default -> {
                JOptionPane.showMessageDialog(null, "ERROR, numero incorreto!!!!!");
                procura();
            }
                
                

}    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Map<Integer, Games> biblioteca = new HashMap<>();
        
        biblioteca.put(1, new Games("Minecraft","Simulador",true));
        biblioteca.put(2, new Games("CoD", "Acão", false));
        biblioteca.put(3, new Games("Immortals", "Acão e Aventura", true));
        biblioteca.put(4, new Games("RocketLeague", "Esportes", false));
        biblioteca.put(5, new Games("Forza5", "Corrida", true));
        biblioteca.put(6, new Games("Diablo 3", "RPG", false));
        
       
        procura();
        
        
        
        JOptionPane.showMessageDialog(null, biblioteca);
       
        
        
    }
    
}
