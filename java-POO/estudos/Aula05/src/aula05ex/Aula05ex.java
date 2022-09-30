
package aula05ex;

public class Aula05ex {

    public static void main(String[] args) {
        // TODO code application logic here
        ContaBanco p1 = new ContaBanco();
        
        p1.setNumConta(1212);
        p1.setDono("Daniel");
        p1.abrirConta("CC");
       
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Greuza");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(500);
        
        p1.sacar(150);
        p2.sacar(100);
        
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
    
}
