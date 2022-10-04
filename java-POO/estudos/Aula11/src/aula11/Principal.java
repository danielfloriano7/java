
package aula11;

public class Principal {

    public static void main(String[] args) {
//        Pessoa p1 = new Pessoa();
//        System.out.println(p1.toString());

        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("S.I");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        Professor prof1 = new Professor();
        prof1.setNome("Roberto");
        prof1.setIdade(30);
        prof1.setSexo("M");
        prof1.setEspec("Java POO");
        prof1.setSalario(3000);
        prof1.receberAumento(330.50f);
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Daniel");
        t1.setIdade(20);
        t1.setMatricula(2427);
        t1.setSexo("M");
        t1.setRegistroProfissional("FrontEnd");
        t1.praticar();
    }
    
}
