/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan35.objectoriented.programtunjangan;

/**
 *
 * @author Guntur Maulana I
 * NAMA     : Guntur Maulana Ibrahim
 * KELAS    : IF-1
 * NIM      : 10118032
 * Deskripsi Program : Membuat proses gaji karyawan
 */
public class karyawan {
    public String status;
    public double gajiPokok;
    public double tunjangan;

    public double HitungTunjangan(String parStatus, double parGajiPokok){
    return tunjangan=(parStatus.equals("Menikah")?0.35*parGajiPokok:0); }

    public double HitungTotalGaji(double parGajiPokok, double parTunjangan){
    return tunjangan = parGajiPokok+parTunjangan;}

    public void HasilHitung(String parStatus, double parGajipokok){
        System.out.println("\n=========Hasil Perhitungan Gaji Anda=========");
        System.out.println("Gaji Pokok \t: Rp "+gajiPokok);
        System.out.println("Tunjangan \t: Rp "+HitungTunjangan(parStatus,parGajipokok));
        System.out.println("Total Gaji \t: Rp "+HitungTotalGaji(parGajipokok,tunjangan));
        System.out.println("(Developed by : Rizki Adam Kurniawan)");
    }
    
}
