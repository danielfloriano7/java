
package exerciciorepita;

import javax.swing.JOptionPane;

public class ExercicioRepita {

    public static void main(String[] args) {
        int n, s = 0;
        int tV = 0, tPar = 0, tImpar = 0, acima100 = 0, media;
        
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um numero:<br > <em>(valor 0 interrompe)</em></html>"));
           
            
            if(n !=0){ 
            s += n; 
            tV++;
            }
            if (n % 2 == 0) tPar++;
            if (n % 2 != 0) tImpar++;
            if (n > 100) acima100++; 
            
        } while (n != 0);
        
        media = s / tV;
        JOptionPane.showMessageDialog(null, "Resultado: \n --------------------  "
                + "\nTotal de Valores: " + tV + "\nTotal de Pares: " + (tPar-1) + "\nTotal de Impares: " + tImpar 
                + "\nAcima de 100: " + acima100 + "\nMedia dos valores: " + media);
    }
    
}
