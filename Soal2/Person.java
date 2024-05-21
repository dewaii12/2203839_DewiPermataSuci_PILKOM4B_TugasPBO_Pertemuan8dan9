package Soal2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dewipermatasuci
 */
public class Person {
    protected String nama;
    protected String alamat;
    protected String noHp;
    protected String email;

    public Person(String nama, String alamat, String noHp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.noHp = noHp;
        this.email = email;
    }
    
    @Override
    public String toString(){
        return "Person: " + nama;
    }
}
