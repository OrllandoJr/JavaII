/**
 *
 * @author Orllando Jr
 */
public class Funcoes extends Linha{
    boolean identificador,recado;

    public Funcoes(boolean identificador, boolean recado, boolean prePago, String operadora, String marca, String cor, boolean comFio, float tamanhoFio) {
        super(prePago, operadora, marca, cor, comFio, tamanhoFio);
        this.identificador = identificador;
        this.recado = recado;
    }


    public boolean getIdentificador() {
        return identificador;
    }

    public void setIdentificador(boolean identificador) {
        this.identificador = identificador;
    }

    public boolean getRecado() {
        return recado;
    }

    public void setRecado(boolean recado) {
        this.recado = recado;
    }

    
    
}
