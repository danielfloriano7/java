
package aula10;

public class Aluno extends Pessoa{
    private int matri;
    private String curso;
    
    public void cancelarMatri() {
        System.out.println("Matricula sera cancelada");
    }

    public int getMatri() {
        return matri;
    }

    public void setMatri(int matri) {
        this.matri = matri;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
