package ex2;

/**
 *
 * @author Orllando Jr
 */
public class Administrador extends Empregado {
    
    private double ajudasDeCusto;

    public Administrador(double ajudasDeCusto, String nome, String sexo, int idade, double altura, double salario) {
        super(nome, sexo, idade, altura, salario);
        this.ajudasDeCusto = ajudasDeCusto;
    }
    
    Empregado e = new Empregado(null, null, 0, 0, 0);
    
    public double getAjudasDeCusto() {
        return (e.getSalario() + e.obterLucros());
    }

 
    
}
