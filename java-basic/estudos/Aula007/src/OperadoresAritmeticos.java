
import java.util.Scanner;

public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite 1º numero: ");
        
        
        float n1 = teclado.nextFloat();
        float n2 = 5;
        
        float m = (n1 + n2)/2;
        
        System.out.println("A media é igual a: " + m);
        
        int numero = 5;
        int valor = 5 + ++numero;
        
        System.out.println(valor);
        
        int x = 4;
        
        x+= 2; //x = x + 2;
        
        System.out.println(x);
        
        int num1 = 100;
        
        double res1 = Math.sqrt(num1);
        double res2 = Math.cbrt(num1);
        
        System.out.println("Raiz Quadrada: " + res1);
        System.out.println("Raiz Cúbica: " + res2);
        
        
        float v = 8.3f;
        
        float ar1 = (int) Math.floor(v);
        float ar2 = (int) Math.ceil(v);
        float ar3 = (int) Math.round(v);

        
        System.out.printf("Resultado: floor %.0f, ceil %.0f, round %.0f \n", ar1, ar2, ar3);
        
        
        double ale = Math.random();
        double resAle = Math.round(ale);
        
        int nAle = (int) (0 + ale * (30));
        
        System.out.println("Aleatorio: " + resAle + "\nde 0 a 30: " + nAle);
        
        int teste = 4;
        
        System.out.println("Teste: " + teste++);
        System.out.println("Teste: " + teste);
        
    }
    
}
