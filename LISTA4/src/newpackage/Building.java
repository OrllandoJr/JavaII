package newpackage;

/**
 *
 * @author Orllando Jr
 */
public abstract class Building implements CarbonFootprint {
    protected int numeroDePessoas;
    protected boolean usoDeEnergiaRenovavel;
    protected int numeroDeLampadas;
    protected boolean usoDeArCodicionado;

    public int getNumeroDePessoas() {
        return numeroDePessoas;
    }

    public void setNumeroDePessoas(int numeroDePessoas) {
        this.numeroDePessoas = numeroDePessoas;
    }

    public boolean getUsoDeEnergiaRenovavel() {
        return usoDeEnergiaRenovavel;
    }

    public void setUsoDeEnergiaRenovavel(boolean usoDeEnergiaRenovavel) {
        this.usoDeEnergiaRenovavel = usoDeEnergiaRenovavel;
    }

    public int getNumeroDeLampadas() {
        return numeroDeLampadas;
    }

    public void setNumeroDeLampadas(int numeroDeLampadas) {
        this.numeroDeLampadas = numeroDeLampadas;
    }

    public boolean getUsoDeArCodicionado() {
        return usoDeArCodicionado;
    }

    public void setUsoDeArCodicionado(boolean usoDeArCodicionado) {
        this.usoDeArCodicionado = usoDeArCodicionado;
    }

    

    
}