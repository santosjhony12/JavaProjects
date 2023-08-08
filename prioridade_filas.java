import javax.swing.JOptionPane;

//inicio do programa

public class prioridade_filas {

    public static void main(String[] args) {
        //inicio da progração
        //declaração de variaveis 
        int idade;
        String aux;
        
        //entrada de dados 
        aux =JOptionPane.showInputDialog("Digite sua idade:");
        idade = Integer.parseInt(aux);
        
        //processamento e saída de dados
        if (idade>=60){
            if (idade>=80){
                JOptionPane.showMessageDialog(null, "Fila 80+");
        }
        else {
            JOptionPane.showMessageDialog(null, "Fila prioritária");
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Fila comum");
            
        }
        
       
    }
    
}
