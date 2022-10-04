package aula12;

public class Principal {

    public static void main(String[] args) {
        
    // Animal n = new Animal();
        
        Mamifero m = new Mamifero();
            Canguru c = new Canguru();
            Cachorro k = new Cachorro();
            
        Reptil r = new Reptil();
            Cobra j = new Cobra();
            Tartaruga t = new Tartaruga();
            
        Peixe p = new Peixe();
            Goldfish g = new Goldfish();
            
        Ave a = new Ave();
            Arara e = new Arara();
        
        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        
        System.out.println("---------------");
        
        a.setPeso(30.2f);
        a.setCorPena("Cinza");
        a.alimentar();
        a.locomover();
        a.emitirSom();
        
        System.out.println("----------------");
        
        c.locomover(); // Canguru
        c.emitirSom();
        
        k.locomover(); // Cachorro
        k.emitirSom();
    }
}
