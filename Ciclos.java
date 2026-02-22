

/* Dadas las edades y alturas de 5 alumnas, mostrar la edad y la estatura media, la cantidad de alumnos
mayores de 18 años, y la cantidad de alumnos que miden más de 1.75 */
import javax.swing.JOptionPane;

public class Ciclos {

    public static void main(String[] args) {
        int edad, sumaEdad=0, conteoMayor18=0, contadorMayor175=0;
        float altura, sumaAltura=0, mediaEdad, mediaAltura;

        for(int i=1; i<=5; i++) {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno "+i+"\nDigite su edad: "));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno "+i+"\nDigite su etatura: "));

            sumaEdad += edad;
            sumaAltura += altura;

            if(edad > 18) { // Si la edad es mayor a 18
                conteoMayor18++;
            }
            if(altura > 1.75) { // Si la altura es mayor a 1.75
                contadorMayor175++;
            }
        }

        mediaEdad = (float) sumaEdad/5;
        mediaAltura = (float) sumaAltura/5;

        JOptionPane.showMessageDialog(null, "La edad Promedio es: "+mediaEdad);
        JOptionPane.showMessageDialog(null, "La estatura Promedio es: "+mediaAltura);
        JOptionPane.showMessageDialog(null, "La Cantidad de Alumnos mayores a 18 años es: "+conteoMayor18);
        JOptionPane.showMessageDialog(null, "La Cantidad de Alumnos que miden más de 1.75m es: "+contadorMayor175);
    }
}
