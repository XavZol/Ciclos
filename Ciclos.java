

/* Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de $1000 */
import javax.swing.JOptionPane;

public class Ciclos {

    public static void main(String[] args) {
        float sueldo, suma=0;
        int contador= 0;

        for(int i=1; i<=10; i++) {
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite su sueldo: "));
            
            if(sueldo > 1000) { //Si el sueldo supera a mil 
                contador++; //Aumentamos uno a contador
            }

            suma += sueldo;
        }

        JOptionPane.showMessageDialog(null,"La suma de todos los sueldos es: $"+suma);
        JOptionPane.showMessageDialog(null,"Cantidad de sueldos mayores a 1000: "+contador);
    }
}
