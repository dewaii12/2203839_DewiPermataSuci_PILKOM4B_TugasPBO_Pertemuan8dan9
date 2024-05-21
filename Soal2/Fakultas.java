/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author dewipermatasuci
 */
public class Fakultas extends Employee {
    private int jamKerja;
    private String pangkat;
    
    public Fakultas(String nama, String alamat, String noHp, String email, String kantor, double gaji, MyDate tanggaldiPekerjakan, int jamKerja, String pangkat){
        super(nama, alamat, noHp, email, kantor, gaji, tanggaldiPekerjakan);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }
    
    @Override
    public String toString(){
        return "Fakultas : " + super.toString();
    }
}
