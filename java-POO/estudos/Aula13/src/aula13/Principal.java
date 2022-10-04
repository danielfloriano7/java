package aula13;

public class Principal {

    public static void main(String[] args) {
        
        Cachorro x = new Cachorro();
        
        x.emitirSom();
        
        x.reagir("Olá");
        x.reagir("Vai apanhar");
        
        x.reagir(true);
        x.reagir(false);
        
        x.reagir(4, 9.5f);
        x.reagir(10, 10.2f);
        
        x.reagir(10, 0);
        x.reagir(19, 0);
    }
    
}
