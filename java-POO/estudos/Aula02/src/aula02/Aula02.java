
package aula02;

public class Aula02 {

    public static class Alunos {
        public static String nome;
        
        public static void status() {
            System.out.println(nome);;
    }
    }
    
    public static void main(String[] args) {
        
        Alunos.nome = "Daniel";
        Alunos.status();
        
        Caneta c1 = new Caneta();
        
        
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = true;
        c1.carga = 100;
        //c1.destampar();
        c1.status();
        c1.rabiscar();
    }
    
}
