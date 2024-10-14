/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan_6;

/**
 *
 * @author iqbal
 */
public class LaguAyamTurun {
    public static void main(String[] args) {
        int jumlahAyam = 10; 
        for (int ayam = jumlahAyam; ayam > 0; ayam--) {
            if (ayam == 1) {
                System.out.println("Ayam turun " + ayam + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Ayam turun " + ayam + ", mati satu tinggal " + (ayam - 1));
            }
        }
    }
}

