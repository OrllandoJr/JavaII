/**
 *
 * @author Orllando Jr
 */
public class Ligacao extends Funcoes{
    boolean gravar, espera;

    public Ligacao(boolean gravar, boolean espera, boolean identificador, boolean recado, boolean prePago, String operadora, String marca, String cor, boolean comFio, float tamanhoFio) {
        super(identificador, recado, prePago, operadora, marca, cor, comFio, tamanhoFio);
        this.gravar = gravar;
        this.espera = espera;
    }

    public boolean getGravar() {
        return gravar;
    }

    public void setGravar(boolean gravar) {
        this.gravar = gravar;
    }

    public boolean getEspera() {
        return espera;
    }

    public void setEspera(boolean espera) {
        this.espera = espera;
    }

    
}
