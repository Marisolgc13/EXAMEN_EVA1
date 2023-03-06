/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_examen1;

import java.util.Scanner;

/**
 *
 * @author Marisol G
 */
public class EVA1_EXAMEN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[] array = new int[15];

        for (int i = 0; i <= 14; i++) {
            System.out.println("Ingresa un valor para el arreglo:");
            array[i] = leer.nextInt();
            System.out.print("[" + array[14] + "]" + "[" + array[13] + "]" + "[" + array[12] + "]" + "[" + array[11] + "]" + "[" + array[10] + "]" + "[" + array[9] + "]" + "[" + array[8] + "]" + "[" + array[7] + "]" + "[" + array[6] + "]" + "[" + array[5] + "]" + "[" + array[4] + "]" + "[" + array[3] + "]" + "[" + array[2] + "]" + "[" + array[1] + "]" + "[" + array[0] + "]");
            System.out.println("");
        }
    }
}
