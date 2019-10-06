/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan24.perbandinganduanilai;

import java.util.Scanner;
/**
 * @author 
 * NAMA      : Bagus Syibro Malisi
 * KELAS     : PBO2
 * NIM       : 10118052
 * Deskripsi Program : Program ini bertujuan untuk membandingakn antar dua nilai
 * tersebut 
 * 
 */
public class PBO210118052Latihan24PerbandinganDuaNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("======== Program Perbandingan Nilai ========");
        
        boolean enaugh = false;
        
        while(!enaugh) {
            System.out.print("Masukan nilai pertama : ");
            int nilai1 = scanner.nextInt();
            System.out.print("Masukan nilai kedua : ");
            int nilai2 = scanner.nextInt();
            
            if(nilai1 > nilai2) {
                System.out.println("Hasil: " + nilai1 + " Lebih besar dari " + nilai2);
            } else if(nilai1 < nilai2) {
                System.out.println("Hasil: " + nilai1 + " Lebih kecil dari " + nilai2);
            } else {
                System.out.println("Hasil: " + nilai1 + " Sama dengan " + nilai2);
            }
            System.out.println();
            System.out.print("Ulangi aktifitas? (Ya/Tidak) : ");
            
            if(!scanner.next().equals("Ya")) {
                enaugh = true;
            }
            System.out.println();
        }
    }
    
}
