/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitapjava;
import java.util.Scanner;
class Hcn {
   private double dai;
   private double rong;
   public Hcn (double dai, double rong){
       this.dai=dai;
       this.rong=rong;
   }
   public double getdai() {
       return dai;
   }
       public void setdai(double dai) {
      this.dai=dai;
       }
       public double getrong() {
           return rong;
       }
       public void setrong(double rong) {
         this.rong=rong;
       }
       public double dientich() {
           return dai*rong;
       }
       public double chuvi() {
           return 2*(dai+rong);
       }
          @Override
      public String toString() {
        return " hinh chu nhat [cd = " + dai + ", cr = " + rong +
               ", dt = " + dientich() + ", cv = " + chuvi() + "]";
    }
   }
public class bai2 {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  
System.out.print("nhap chieu dai");
double dai = scanner.nextDouble();

System.out.println("nhap chieu rong");
   double rong = scanner.nextDouble();
Hcn hcn = new Hcn(dai,rong);
System.out.println(hcn);
      
}
}

