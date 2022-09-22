package estudos;

/**
 *
 * @author danie
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Daniel";
        String nome2 = "Daniel";
        String nome3 = new String("Daniel");
        String res;
        
        res = (nome1.equals(nome3)) ? "igual" : "diferente";
        
        System.out.println( res);
        
    }
    
}
