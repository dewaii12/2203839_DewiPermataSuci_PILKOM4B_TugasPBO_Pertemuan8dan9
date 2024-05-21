/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author dewipermatasuci
 */
public class MyDate {
    private int tanggal;
    private int bulan;
    private int tahun;
    
    public MyDate(int tahun, int bulan, int tanggal){
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }
    
    @Override
    public String toString(){
        return tanggal + " " + bulan + " " + tahun;  
    }
}
