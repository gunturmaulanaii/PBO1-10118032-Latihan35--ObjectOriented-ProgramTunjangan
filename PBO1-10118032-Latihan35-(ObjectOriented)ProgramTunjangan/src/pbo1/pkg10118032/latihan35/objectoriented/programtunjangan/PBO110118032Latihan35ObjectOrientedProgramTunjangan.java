/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan35.objectoriented.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Guntur Maulana I
 * NAMA     : Guntur Maulana Ibrahim
 * KELAS    : IF-1
 * NIM      : 10118032
 * Deskripsi Program : Menampilkan tampilan gaji karyawan
 */
public class PBO110118032Latihan35ObjectOrientedProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        karyawan kar = new karyawan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        kar.gajiPokok = scn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) :");
        kar.status = scn.next();

        kar.HasilHitung(kar.status,kar.gajiPokok);
    }
    
}
