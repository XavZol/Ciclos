

/* Pedir 10 números y escribir la suma total. */
import javax.swing.JOptionPane;

public class Ciclos {

    public static void main(String[] args) {
        int numero, suma = 0;

        for(int i=1; i<= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

            suma = suma + numero;
        }

        System.out.println("La suma es: "+suma);
    }
}
