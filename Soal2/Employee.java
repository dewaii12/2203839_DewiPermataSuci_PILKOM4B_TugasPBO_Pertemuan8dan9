/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author dewipermatasuci
 */
public class Employee extends Person {
    private String kantor;
    private double gaji;
    private MyDate tanggaldiPekerjakan;
    
    public Employee (String nama, String alamat, String noHp, String email, String kantor, double gaji, MyDate tanggaldiPekerjakan){
        super(nama, alamat, noHp, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggaldiPekerjakan = tanggaldiPekerjakan;
    }
    
    @Override
    public String toString(){
        return "Employee : " + super.toString();
    }
}
