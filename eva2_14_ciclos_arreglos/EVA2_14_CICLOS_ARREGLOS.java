/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_ciclos_arreglos;

/**
 *
 * @author Jose Enrique
 */
public class EVA2_14_CICLOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dato, val[];// un solo arreglo --> valores
        int [] datos, x, y, z;// todos son arreglos
        int[] arreglo = new int [100];
        
        for (int i = 0; i <arreglo.length; i++){// leer todos los valores
            arreglo[i] = (int)(Math.random()*100);
        }
        //System.out.println(arreglo);solo imprime la dirección en mi
        for (int i = 0; i <arreglo.length; i++){
            System.out.print(arreglo[i]+"-");
        }
    }
    
}
