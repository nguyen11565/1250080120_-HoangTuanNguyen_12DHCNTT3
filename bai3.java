/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;
import java.util.Scanner;
class Sinhvien {
 private int masv;
 private String hoten;
 private float diemLT;
 private float diemTH;
  
    public Sinhvien () {
        this.masv = 0;
        this.hoten = "";
        this.diemLT = 0;
        this.diemTH = 0;
    }
    public Sinhvien(int masv,String hoten,float diemLT,float diemTH){
     this.hoten=hoten;
     this.masv=masv;
     this.diemLT=diemLT;
     this.diemTH=diemTH;
    }
  public int getmasv(){
  return masv;
  }
  public void setmasv(int masv){
      this.masv=masv;
  }
  public String hoten(){
  return hoten;
 }
   public void sethoten(String hoten){
      this.hoten=hoten;
  }
public float diemLT(){
    return diemLT;
}
 public void setdiemLT(float diemLT){
      this.diemLT=diemLT;
  }
public float diemTH(){
    return diemTH;
}  
 public void setdiemTH(float diemTH){
      this.diemTH=diemTH;
  }
 public float diemtb(){
     return (diemLT+diemTH)/2;
 }
@Override
    public String toString() {
        return String.format("%-10d %-20s %-10.2f %-10.2f %-10.2f", masv, hoten, diemLT, diemTH,diemtb());
    }
}
    public class bai3{
        public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        
        Sinhvien sinhvien1 = new Sinhvien(1, "Hoang Tuan Nguyen", 6.0f, 8.0f);
        Sinhvien sinhvien2 = new Sinhvien(2, "Pham Dang Khoi", 5.5f, 6.0f);
        Sinhvien sinhvien3 = new Sinhvien();
       System.out.println("nhap ma sinh vien:");
      sinhvien3.setmasv(scanner.nextInt());
            scanner.nextLine(); 
      System.out.println("nhap ho ten: ");
      sinhvien3.sethoten(scanner.nextLine());
      System.out.println("nhap diem LT: ");
  sinhvien3.setdiemLT(scanner.nextFloat());
      System.out.println("nhap diem TH :");
  sinhvien3.setdiemTH(scanner.nextFloat());
   System.out.println("Danh sach :");
        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n", "masv", "hoten", "diemLT", "diemTH", "diemtb");
        System.out.println(sinhvien1);
        System.out.println(sinhvien2);
        System.out.println(sinhvien3);
        }
    }

