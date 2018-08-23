package cockerteste;

/**
 *
 * @author Orlando
 */
public class Cocker extends Cachorro {
    
    private boolean tosa;

    public Cocker(boolean tosa,String nome, String raça, String tipo, String cor) {
        super(nome, raça, tipo, cor);
        this.tosa = tosa;
    }


    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }
    
    public boolean precisaTosa() {
        return tosa;
    }
    
}
