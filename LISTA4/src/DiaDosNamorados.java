/**
 *
 * @author Orllando Jr
 */
public class DiaDosNamorados extends CartaoWeb{

    public DiaDosNamorados(String destinatario) {
    this.destinatario = destinatario;
    }
    
    @Override
    public String retornarMensagem(String remetente) {
        return destinatario + "\nFeliz Dia dos Namorados!\nMeu amor! rs <3\nAss "+remetente;  
    }

    
}
