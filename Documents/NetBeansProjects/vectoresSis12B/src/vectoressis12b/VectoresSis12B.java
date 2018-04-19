
package vectoressis12b;

import javax.swing.JOptionPane;

/**
 * Nombre de la clase: VectoresSis12B
 * Fecha: 12/04/2018
 * Versión: 1.0
 * CopyRight: Balmore Pérez
 * @author Douglas
 */
public class VectoresSis12B {

    public static void main(String[] args) {
        
        // Declaracion de vectores
        String nombres[] =new String[5];
        double notas[] = new double[5];
        int edades[]= new int[5];
        String imprimir="";
        
        nombres[3]="Lucas";
        nombres[2]="Adela";
        
        for(int i=0; i<edades.length; i++)
        {
            edades[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
            imprimir= imprimir+edades[i]+"\n";
        }
        /*JOptionPane.showMessageDialog(null, "valores: "+imprimir);*/
        //Imprimir vector
        for(int i=0; i<edades.length; i++)
        {
           JOptionPane.showMessageDialog(null, "valor: "+edades[i]);
        }
        
    }
    
}
