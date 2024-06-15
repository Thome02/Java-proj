import java.util.Random;
import javax.swing.JOptionPane;

public class Caraoucoroa {
    public static void main(String[] args) {
        Random ale = new Random(1);
        int numeroDaEscolha = ale.nextInt() + 1;
        String tipo = JOptionPane.showInputDialog(null, "escolha entre: Cara ou Coroa", JOptionPane.QUESTION_MESSAGE);
        String numeroEscolhido = JOptionPane.showInputDialog(null, "Escolha um numero inteiro entre 1 e 2",JOptionPane.QUESTION_MESSAGE);
        int nc = Integer.parseInt(numeroEscolhido);
        if (tipo.equals("cara")){
            
        if (nc == numeroDaEscolha) {
                JOptionPane.showMessageDialog(null, "Vc escolheu cara e o resultado deu cara, parabens");
        }
        else {
            JOptionPane.showMessageDialog(null, "vc escolheu cara porem o resultado deu coroa, boa sorte na proxima");
            }
        }
        else if (tipo.equals("coroa")) {
        if (nc == numeroDaEscolha) {
           JOptionPane.showMessageDialog(null, "Vc escolheu coroa e o resultado deu coroa, parabens");
        }
        else{
            JOptionPane.showMessageDialog(null, "vc escolheu coroa porem o resultado deu cara, boa sorte na proxima");
        }
        }
    
        
   
   
    }
}
