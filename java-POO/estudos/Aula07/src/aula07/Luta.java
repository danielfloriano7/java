package aula07;

public class Luta {

    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if(l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
                System.out.println("Marcado");
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
            System.out.println("Não da pra marcar");
        }
    }

    public void lutar() {
        if(aprovada){
            Double vencedor = Math.random() * 3;
            
            desafiado.apresentar();
            desafiante.apresentar();
            
            switch (vencedor.intValue()) {
                case 0:
                    System.out.println("Empate!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
            }
            
        } else{
            System.out.println("Luta não pode acontecer");
        }
    }
    
    //Métodos Especiais
    public Lutador getDesafido() {
        return desafiado;
    }

    public void setDesafido(Lutador desafido) {
        this.desafiado = desafido;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
