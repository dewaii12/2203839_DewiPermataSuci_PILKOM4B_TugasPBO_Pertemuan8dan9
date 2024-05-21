/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal2;

/**
 *
 * @author dewipermatasuci
 */
public class Pengujian {
     public static void main(String[] args) {
        Person orang = new Person("Dewi Permata Suci", "Bandung", "08986843600", "deewiips12@upi.edu");
        Student pelajar = new Student("Dewi Permata Suci", "Bandung", "08986843600", "deewiips12@upi.edu", Student.Junior);
        MyDate hireDate = new MyDate(12, 5, 20219);
        Employee karyawan = new Employee("Nana", "Bandung", "081325674532", "nana2@gmail.com", "FPMIPA", 3250000, hireDate);
        Fakultas dosen = new Fakultas("Dr. Aji", "Cidadap", "087772717641", "ajip@upi.edu", "FPMIPA B", 7500000, hireDate, 12, "Professor");
        StaffPegawai staff = new StaffPegawai("Riza", "Setiabudi", "089866547654", "riza3@yahoo.co.id", "JICA", 3000000, hireDate, "Staff Administrasi");

        System.out.println(orang);
        System.out.println(pelajar);
        System.out.println(karyawan);
        System.out.println(dosen);
        System.out.println(staff);
    }
}
