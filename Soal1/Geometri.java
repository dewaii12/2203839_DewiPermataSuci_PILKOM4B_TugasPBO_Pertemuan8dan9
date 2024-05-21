/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author dewipermatasuci
 */
public class Geometri {
  private String warna;
  private boolean isi;
  
  public Geometri(){
    warna = "putih";
    isi = false;
  }
  
  public Geometri(String warna, boolean isi){
      this.warna = warna;
      this.isi = isi;
  }
  
  public String getWarna(){
      return warna;
  }
  
  public void setWarna(String warna){
      this.warna = warna;
  }
  
  public boolean getIsi(){
      return isi;
  }
  
  public void setIsi(boolean isi){
      this.isi = isi;
  }
  
  public String toString(){
      return "Segitiga berwarna : "+ warna + "dan terisi : " + isi;
  }
}

