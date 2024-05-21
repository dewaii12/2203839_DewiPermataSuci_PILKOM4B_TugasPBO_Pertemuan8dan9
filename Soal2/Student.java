/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author dewipermatasuci
 */
public class Student extends Person {
    public static final String MahasiswaBaru = "Mahasiswa Baru";
    public static final String MahasiswaTh2 = "Mahasiswa Tahun Ke-2";
    public static final String Junior = "Junior";
    public static final String Senior = "Senior";
    
    private String status;
    
    public Student (String nama, String alamat, String noHp, String email, String status){
        super(nama,alamat,noHp,email);
        this.status = status;
    }
    
    @Override
    public String toString(){
        return "Student : " + super.toString();
    }
}
