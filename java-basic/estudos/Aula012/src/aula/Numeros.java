
package aula;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0;
        String resp;
        Scanner t = new Scanner(System.in);
       
        do {            
            System.out.print("Digite um numero: ");
            n = t.nextInt();
            s += n;
            System.out.print("Quer continuar? [S/N]");
            resp = t.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valores é " + s);
    }
    
}
