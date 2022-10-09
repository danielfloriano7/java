package biblioteca;

public class Games {
	private String nomeJogos;
	private String genero;
	private Boolean zerado = false;
	
	public Games(String nome, String g, int z) {
        this.nomeJogos = nome;
        this.genero = g;
        if(z == 0) {
        	this.zerado = true;
        }
    }

    public String getNomeJogos() {
        return nomeJogos;
    }

    public String getGenero() {
        return genero;
    }

    public Boolean getZerado() {
        return zerado;
    }
	
        
        
	@Override
    public String toString() {
        return "Nome: " + this.nomeJogos+ "\nG�nero: " + this.genero + "\nZerado: " +this.zerado + "\n\n";
	}
	
}
