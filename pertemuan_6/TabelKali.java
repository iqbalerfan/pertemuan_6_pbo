/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan_6;

/**
 *
 * @author iqbal
 */
import java.util.Scanner;

public class TabelKali {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai maksimum (maksimal 10): ");
        int maksimum = input.nextInt();

        if (maksimum > 0 && maksimum <= 10) {
            System.out.print("\t"); 
            
            // Menampilkan header kolom
            for (int kolom = 1; kolom <= maksimum; kolom++) {
                System.out.print(kolom + "\t");
            }
            System.out.println();

            // Menampilkan isi tabel
            for (int baris = 1; baris <= maksimum; baris++) {
                System.out.print(baris + "\t"); 
                
                for (int j = 1; j <= maksimum; j++) {
                    System.out.print(baris * j + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai maksimum harus antara 1 dan 10.");
        }

        input.close();
    }
}
