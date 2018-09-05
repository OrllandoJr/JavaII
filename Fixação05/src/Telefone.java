/**
 *
 * @author Orllando Jr
 */
public class Telefone {
    String cor;
    boolean comFio;
    float tamanhoFio;

    public Telefone(String cor, boolean comFio, float tamanhoFio) {
        this.cor = cor;
        this.comFio = comFio;
        this.tamanhoFio = tamanhoFio;
    }

  

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
       
    public boolean getComFio() {
        return comFio;
    }

    public void setComFio(boolean comFio) {
        this.comFio = comFio;
    }

    public float getTamanhoFio() {
        return tamanhoFio;
    }

    public void setTamanhoFio(float tamanhoFio) {
        this.tamanhoFio = tamanhoFio;
    }
    
    
}
