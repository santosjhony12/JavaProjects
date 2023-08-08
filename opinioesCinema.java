
import javax.swing.JOptionPane;


public class opinioesCinema {

  
    public static void main(String[] args) {
        int idade = 0;
        char op;
        int esp=0;
        int otimo=0, bom=0, regular=0, ruim=0, pessimo=0;
        double idaderuim=0;
        
    
         while (esp<40){ 
            idade = Integer.parseInt(JOptionPane.showInputDialog(esp + " - Digite sua idade:"));
            
            op = JOptionPane.showInputDialog("Digite sua opinião sobre o filme sendo:"+
                "\n A - Ótimo, B - Bom, C - Regular, D - Ruim e E - Péssimo").charAt(0);
            esp +=1;
            switch (op){
                case 'a':
                    otimo = otimo + 1;
                    break;
                case 'b':
                    bom = bom+1;
                    break;
                case 'c':
                    regular = regular+1;
                    break;
                case 'd':
                    ruim = ruim+1;
                    idaderuim += idade;
                    break;
                case 'e':
                    pessimo = pessimo+1;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção incorreta!");
                    break;
            }   
            
            }
            
            
            JOptionPane.showMessageDialog(null, "Total de pessoas que respoderam Ótimo: "+otimo);
            JOptionPane.showMessageDialog(null, "Porcentagem de respostas Péssimo: "+(pessimo*100/10));
            JOptionPane.showMessageDialog(null, "Média de idade das pessoas que responderam ruim: "+(idaderuim/40));
        }
            
        }
        
       
