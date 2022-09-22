package aula009;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Calendar cal = new GregorianCalendar();
        
        int ano = cal.get(Calendar.YEAR);
        
        System.out.print("Em que ano você nasceu? ");
        int nasc = teclado.nextInt();
        int i = ano - nasc;
        
        System.out.println("Sua idade é: " + i);
        
        if (i >=18) {
            System.out.println("Maior de Idade"); 
        }
        else {
            System.out.println("Menor de Idade");
        }
        
        
    }
    
}
