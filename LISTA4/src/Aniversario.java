/**
 *
 * @author Orllando Jr
 */
public class Aniversario extends CartaoWeb{

     public Aniversario(String destinatario){
        this.destinatario = destinatario;
    }
    
    @Override
    public String retornarMensagem(String remetente) {
        return destinatario + "\nFeliz Aniversário!\n Muitos anos de vida.\nAss "+remetente;
    }
    
}
