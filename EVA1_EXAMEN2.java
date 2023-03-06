/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_examen2;
/**
 *
 * @author Marisol G
 */
public class EVA1_EXAMEN2 {

    public static void main(String[] args) {
        // TODO code application logic here

        int contador = 0;
        int[][] matriz = new int[15][2];
        int[] arreglo1 = new int[15];

        llenar(arreglo1);
        imprimir(arreglo1);

        System.out.println("");
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1.length; j++) {
                if (arreglo1[i] == arreglo1[j]) {
                    contador++;
                }
            }
            System.out.print("[" + contador + "]");
            contador = 0;
        }

    }

    public static void llenar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100 + 1);

        }
    }

    public static void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
    }

}
