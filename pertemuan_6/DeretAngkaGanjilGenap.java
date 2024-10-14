/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan_6;

/**
 *
 * @author iqbal
 */
public class DeretAngkaGanjilGenap {
    public static void main(String[] args) {
        // Menampilkan angka genap dari 0 sampai 20
        System.out.println("Angka Genap dari 0-20:");
        
        
        for (int numGenap = 0; numGenap <= 20; numGenap++) {
            // Jika numGenap habis dibagi 2, maka itu adalah angka genap
            if (numGenap % 2 == 0) {
                System.out.print(numGenap + " ");
            }
        }

        System.out.println("\n\nAngka Ganjil dari 0-20:");
        
    
        for (int numGanjil = 0; numGanjil <= 20; numGanjil++) {
            // Jika numGanjil tidak habis dibagi 2, maka adalah angka ganjil
            if (numGanjil % 2 != 0) {
                System.out.print(numGanjil + " ");
            }
        }
    }
}

