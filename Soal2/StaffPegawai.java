/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author dewipermatasuci
 */
public class StaffPegawai extends Employee {
     private String gelar;
    
    public StaffPegawai(String nama, String alamat, String noHp, String email, String kantor, double gaji, MyDate tanggaldiPekerjakan, String gelar){
        super(nama, alamat, noHp, email, kantor, gaji, tanggaldiPekerjakan);
        this.gelar = gelar;
    }
    
    @Override
    public String toString(){
        return "Staff Pegawai : " + super.toString();
     }
}

