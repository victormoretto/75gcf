
package git;

import javax.swing.JOptionPane;

public class Git {

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe Numero"));
        for (int i = 1; i <=10; i++){
            System.out.println(numero+" x "+i+" = "+numero*i);
        }
    }
    
}
