package ex2;

/**
 *
 * @author Orllando Jr
 */
public class Empregado extends Pessoa{
    
    private double salario;

    public Empregado( String nome, String sexo, int idade, double altura, double salario) {
        super(nome, sexo, idade, altura);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

   public double obterLucros() {
       return this.salario;
        
    }
    
    
    
    
    
    
}
