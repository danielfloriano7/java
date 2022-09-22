package aula011;

public class Contador01 {

    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        
        while (cc<10) {    
            cc++;
            if(cc == 5 || cc == 7){
                continue;
            }
            if(cc == 9) {
                break;
            }
            System.out.println("Cambalhota " + cc);
           
        }
        
        
    }
    
}
