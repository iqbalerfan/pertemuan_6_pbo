/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan_6;

/**
 *
 * @author iqbal
 */
public class AngkaPrima {
    public static void main(String[] args) {
        System.out.println("Angka Prima dari 0-20 adalah :");

        // Loop untuk memeriksa angka dari 0 sampai 20
        for (int num = 0; num <= 20; num++) {
            int pembagi = 0; // Variabel untuk menghitung jumlah pembagi dari num
            
            // Loop untuk menghitung jumlah faktor dari angka num
            for (int div = 1; div <= num; div++) {
                if (num % div == 0) {
                    pembagi++;
                }
            }
            
            // Jika jumlah faktor hanya 2 (1 dan dirinya sendiri), maka num adalah bilangan prima
            if (pembagi == 2) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\n\nAngka Bukan Prima dari 0-20 adalah :");
        
        // Loop lagi untuk angka bukan prima, mulai dari 0 hingga 20
        for (int num = 0; num <= 20; num++) {
            int pembagi = 0; // Variabel untuk menghitung jumlah pembagi 
            
            
            for (int div = 1; div <= num; div++) {
                if (num % div == 0) {
                    pembagi++;
                }
            }
            
            
            if (pembagi > 2 && num > 1) {
                System.out.print(num + " ");
            }
        }
    }
}

