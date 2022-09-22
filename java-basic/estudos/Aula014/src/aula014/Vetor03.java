
package aula014;

import java.util.Arrays;

public class Vetor03 {

    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {3.5, 2.75, 9, -4.5};
        
        Arrays.sort(v);
        
        for (double n : v) {
            System.out.print(n + " ");
        }
    }
    
}
