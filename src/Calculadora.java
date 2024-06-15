import  javax.swing.JOptionPane;


public class Calculadora {
public static void main(String[] args) {
    String conta = JOptionPane.showInputDialog(null,"Qual conta vc deseja fazer? + - x ou /",JOptionPane.QUESTION_MESSAGE);
    
    String numero1 = JOptionPane.showInputDialog(null, "escolha 1 numero",JOptionPane.QUESTION_MESSAGE);
    String numero2 = JOptionPane.showInputDialog(null, "escolha outro numero",JOptionPane.QUESTION_MESSAGE);
    switch (conta) {
        case "+" ->             {
                int n1 = Integer.parseInt(numero1);
                int n2 = Integer.parseInt(numero2);
                int valorF = n1+n2;
                JOptionPane.showMessageDialog(null,"a soma dos valores "+n1+" e "+n2+" é " + valorF);
            }
        case "-" ->             {
                int n1 = Integer.parseInt(numero1);
                int n2 = Integer.parseInt(numero2);
                int valorF = n1-n2;
                JOptionPane.showMessageDialog(null,"a subtração dos valores "+n1+" e "+n2+" é " + valorF);
            }
        case "x" ->             {
                int n1 = Integer.parseInt(numero1);
                int n2 = Integer.parseInt(numero2);
                int valorF = n1*n2;
                JOptionPane.showMessageDialog(null,"a multiplicação dos valores "+n1+" e "+n2+" é " + valorF);
            }
        case "/" ->             {
                int n1 = Integer.parseInt(numero1);
                int n2 = Integer.parseInt(numero2);
                int valorF = n1/n2;
                JOptionPane.showMessageDialog(null,"a divição dos valores "+n1+" e "+n2+" é " + valorF);
            }
        default -> {
        }
    }
   
   
    



}
    
}