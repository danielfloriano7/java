
package aula014;

import java.util.Arrays;

public class Vetor04 {

    public static void main(String[] args) {
        // TODO code application logic here
        int vet[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for (int v : vet) {
            System.out.print(v + " ");
        }
        
        int p = Arrays.binarySearch(vet, 35);
        
        System.out.println("\nEncontrei o valor na posição " + p);
    }
    
}
