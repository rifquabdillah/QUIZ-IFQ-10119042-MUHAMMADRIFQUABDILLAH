/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if1.pkg10119042.muhammadrifquabdillah;
import java.util.Scanner;

/**
 *
 * @author Muhammad Rifqu Abdillah
 * NIM  :10119042
 * kelas: IF-1
 */
public class QUIZIF110119042MUHAMMADRIFQUABDILLAH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Costumer cos = new Costumer();
        Service serv = new Service();
        
        
        System.out.println("=====Program Kasir Rock n Roll Haircut=====");
        System.out.print("Masukan Nama : ");
        cos.setNama(scan.nextLine());
        System.out.print("Masukan Email : ");
        cos.setEmail(scan.nextLine());
        
        String nama = cos.getNama();
        String email =cos.getEmail();
       
        System.out.println();
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Email\t\t: " + email);
        System.out.println("*************************");
        System.out.println("***Rock n Roll Haircut***");
        System.out.println("*************************");
        
    }
    
}
