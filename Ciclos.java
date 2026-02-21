

/* Pedir númmeros hasta que se teclee un 0, mostrar la suma de todos los númmeros introducidos.  */

import javax.swing.JOptionPane;

public class Ciclos {

    public static void main(String[] args) {
        int numero, suma = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            suma = suma + numero;
        } while(numero != 0);

        System.out.println("La suma es: "+suma);
    }
}