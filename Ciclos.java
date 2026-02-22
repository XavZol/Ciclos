

/*Pide un número (que debe estar entre 0 y 10 ) y mostrar la tabla de multiplicar de dicho número */
import javax.swing.JOptionPane;

public class Ciclos {

    public static void main(String[] args) {
            int numero;

            do {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            } while(numero<0 || numero>10); 

            JOptionPane.showMessageDialog(null, "La tabla de multilplicar del número "+numero+" es: ");

            for(int i=1; i<=12; i++) {
                JOptionPane.showMessageDialog(null, numero+" * "+i+" = "+numero*i);
            }
        }
}
