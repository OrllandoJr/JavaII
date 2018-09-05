/**
 *
 * @author Orllando Jr
 */
public abstract class CartaoWeb {
    protected String destinatario;
    
    public abstract String retornarMensagem(String remetente);

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
 
    
}
