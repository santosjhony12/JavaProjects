
import javax.swing.JOptionPane;

public class diasdevacinacao {

   
    public static void main(String[] args) {
        //inicio da programação
        //declaração de variaveis
        int idade;
        String nome;
        
        //entrada e conversão de dados
        nome = JOptionPane.showInputDialog("Digite o seu nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        
        
        //processamento de dados
       switch (idade){
           //segunda-feira
           case 80:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Segunda-feira.");
               break;
           case 81:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Segunda-feira.");
               break;
           case 82:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Segunda-feira.");
               break;
           case 83:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Segunda-feira.");
               break;
           case 84:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Segunda-feira.");
               break;
           case 85:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Segunda-feira.");
               break;
               
               //terça-feira
               
           case 75:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Terça-feira.");
               break;
           case 76:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Terça-feira.");
               break;
           case 77:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Terça-feira.");
               break;
           case 78:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Terça-feira.");
               break;
           case 79:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Terça-feira.");
               break;
               
               //quarta-feira
               
           case 70:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Quarta-feira.");
               break;
           case 71:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Quarta-feira.");
               break;
           case 72:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Quarta-feira.");
               break;
           case 73:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Quarta-feira.");
               break;
           case 74:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Quarta-feira.");
               break;
               
               //quinta-feira
               
           case 65:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Quinta-feira.");
               break;
           case 66:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Quinta-feira.");
               break;
           case 67:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Quinta-feira.");
               break;
           case 68:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Quinta-feira.");
               break;
           case 69:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Quinta-feira.");
               break;
             
               //sexta feira
               
           case 60:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Sexta-feira.");
               break;
           case 61:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Sexta-feira.");
               break;
           case 62:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Sexta-feira.");
               break;
           case 63:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Sexta-feira.");
               break;
           case 64:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", seu dia de vacinação é Sexta-feira.");
               break;
           
           default:
               JOptionPane.showMessageDialog(null, "Olá "+nome+", você está fora do período de vacinação.");
               break;
              
            }
               
            }
        
        
               
    }

    
    
