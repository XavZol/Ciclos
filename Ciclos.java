
import javax.swing.JOptionPane;

/* Leer un número e indicar si es positivo o negativo. El proceso se repetira hasta que se introduzca un cero */
public class Ciclos {

    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        while(numero != 0) {
            if(numero > 0) {
                System.out.println("El número "+numero+" es positivo");
            } else {
                System.out.println("El número "+numero+" es negativo");
            }
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        }
    }
}