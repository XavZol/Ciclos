

/* Programa para gestionar facturas. En cada factura figura: el código del artículo, la cantidad venndida 
en litros y el precio por litro. Se pide de 5 facturas introducidas: Facturación total, cantidad de litros 
vendidos del artículo 1 y cuantas facturas se emitieron de más de $600. */
import javax.swing.JOptionPane;

public class Ciclos {

    public static void main(String[] args) {
        int codigo, litros, litrosArticulo1=0, conteoMas600=0;
        float precioLitro, importeFactura, facturacionTotal=0;

        for(int i=1; i<=5; i++) {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Artículo N°"+i+"\nDigite el código: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Artículo N°"+i+"\nDigite la cantidad en litros: "));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("Artículo N°"+i+"\nDigite el precio por litro:  "));

            importeFactura = (float) litros * precioLitro;
            facturacionTotal += importeFactura;

            if(codigo == 1) {
                litrosArticulo1 += litros;
            }
            if(importeFactura > 600) {
                conteoMas600++;
            }
        }

        System.out.println("Resumen de ventas");
        System.out.println("Facturación total: "+facturacionTotal);
        System.out.println("Cantidad en litros vendidos del artículo 1: "+litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a 600 dolares "+conteoMas600);
    }
}
