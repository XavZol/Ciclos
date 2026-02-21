

/* Pedir un número N, y mostrar todos  los números del 1 al N.  */
import javax.swing.JOptionPane;

public class Ciclos {

    public static void main(String[] args) {
        int numero, i;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        i = 1;
        while(i <= numero) {
            System.out.println(i);
            i++;
        }
    }
}
