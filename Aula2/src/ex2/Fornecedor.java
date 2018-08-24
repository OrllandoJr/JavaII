package ex2;

/**
 *
 * @author Orllando Jr
 */
public class Fornecedor extends Pessoa {
    
    double creditoMaximo, valorEmDivida;

    public Fornecedor(double creditoMaximo, double valorEmDivida, String nome, String sexo, int idade, double altura) {
        super(nome, sexo, idade, altura);
        this.creditoMaximo = creditoMaximo;
        this.valorEmDivida = valorEmDivida;
    }

    public double getCreditoMaximo() {
        return creditoMaximo;
    }

    public void setCreditoMaximo(double creditoMaximo) {
        this.creditoMaximo = creditoMaximo;
    }

    public double getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(double valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }
    
    public double obterSaldo(){
        return (creditoMaximo-valorEmDivida); 
    }
    
}

