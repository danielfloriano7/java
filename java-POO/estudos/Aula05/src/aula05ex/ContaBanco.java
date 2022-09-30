package aula05ex;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos Especial
    public ContaBanco(){
        saldo = 0;
        status = false;
    }
    
    //Métodos Personalizados
    public void estadoAtual(){
        System.out.println(
                "--------------------------"+
                "\nConta: " + this.getNumConta() +
                "\nTipo: " + this.getTipo() +
                "\nDono: " + this.getDono() +
                "\nSaldo: " + this.getSaldo() +
                "\nStatus: " + this.isStatus()
        );
    }
    
    public void abrirConta(String t) {
        setTipo(t);
        setStatus(true);
        if(t == "CC"){
            setSaldo(50);
        } else if(t == "CP") {
            setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if(saldo > 0){
            System.out.println("Conta com dinheiro");
        } else if (saldo < 0) {
            System.out.println("Conta em débito");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if(this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar");
        }
    }

    public void sacar(float v) {
        if(this.isStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }

    public void pagarMensal() {
        float v = 0;
        
        if(this.getTipo() == "CC"){
            v = 12;
        } else if(this.getTipo() == "CP") {
            v = 20;
        }
        if(this.isStatus()){
            if(this.getSaldo() >= v){
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel pagar");
        }
    }

    //Metodos Especial
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
  

}
