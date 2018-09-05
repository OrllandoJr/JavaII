/**
 *
 * @author Orllando Jr
 */
public class Linha extends Telefone{
    boolean prePago;
    String operadora;

    public Linha(boolean prePago, String operadora, String marca, String cor, boolean comFio, float tamanhoFio) {
        super(cor, comFio, tamanhoFio);
        this.prePago = prePago;
        this.operadora = operadora;
    }

    public boolean getPrePago() {
        return prePago;
    }

    public void setPrePago(boolean prePago) {
        this.prePago = prePago;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    
    
}
