

/* Pedir un número y calcular su factorial 5!= 1*2*3*4*5, 7!= 1*2*3*4*5*6*7 */
import javax.swing.JOptionPane;

public class Ciclos {

    public static void main(String[] args) {
        int numero;
        long factorial=1;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

        // 5! = 1*2*3*4*5
        for (int i=1; i<= numero; i++ ) {
            factorial *= i; //multiplicación iterativa
        }

        System.out.println("El factorial de "+numero+" es: "+factorial);
    }
}
