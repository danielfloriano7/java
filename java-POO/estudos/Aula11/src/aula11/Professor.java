
package aula11;

public class Professor extends Pessoa{
    private String espec;
    private float salario;
    
    public void receberAumento(float aum){
        this.salario = this.salario+aum;
        System.out.println("Teve um aumento. Esta recebendo R$" + this.salario);
    }

    public String getEspec() {
        return espec;
    }

    public void setEspec(String espec) {
        this.espec = espec;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
