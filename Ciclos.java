

/* Pedir números hasta que se introduzca uno negativo, y calcular la media.  */
import javax.swing.JOptionPane;

public class Ciclos {

    public static void main(String[] args) {
        int numero, elementos = 0, suma = 0;
        float media;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        while (numero >= 0) {
            suma = suma + numero; // Suma Iterativa
            elementos++; // Aumentamos en 1 elementos 

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }

        if (elementos == 0) {
            System.out.println("Error! La división entre 0 no existe");
        } else {
            media = (float) suma/elementos;
            System.out.println("La media es: "+media);
        }
    }
}
