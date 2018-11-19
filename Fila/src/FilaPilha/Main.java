package FilaPilha;

/*
 * @author Orlando Jr
 */
import javax.swing.JOptionPane;

public class Main {

    
    public static void main(String[] args) {

        ArrayQueue fila = new ArrayQueue();

        int op2, op1, op3;

        do {
            op1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a opção desejada:\n[1] Fila\n[2] Pilha\n[3] Sair"));
            switch (op1) {
                case 1:
                    do {
                        op2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a opção desejada:\n[1] Entrar na Fila\n[2] Chamar o Próximo\n[3] Atender\n[4] Tamanho da fila\n[5] Voltar"));

                        switch (op2) {
                            case 1:
                                String senha = JOptionPane.showInputDialog(null, "Tipo de atendimento:\n[1] Idosos/Gestantes/PCD\n[2] Aluno\n[3] Professor/Visitante");
                                if ("1".equals(senha)) {
                                    fila.entrarNaFila("P1-" + fila.size());
                                }
                                if ("2".equals(senha)) {
                                    fila.entrarNaFila("P2-" + fila.size());
                                }
                                if ("3".equals(senha)) {
                                    fila.entrarNaFila("P3-" + fila.size());
                                }

                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Proximo " + fila.proximo());
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, fila.atender() + " atendido com sucesso!");
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "A fila possui " + fila.size() + " pessoas");
                                break;
                            case 5:
                                break;
                        }
                    } while (op2 != 5);

                case 2:
                    do {
                        op3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a opção desejada:\n[1] Inscrever processo\n[2] Renovar processo\n[3] Trancar processo\n[4] Voltar"));

                        switch (op3) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                break;
                        }

                    } while (op3 != 4);

                case 3:
                    break;
            }

        } while (op1 != 3);

    }
}
