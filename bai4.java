/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;
import java.util.Scanner;
class xe{
    private String tenchuxe;
    private double trigia;
    private int dungtichxe;
    public xe(String tenchuxe ,double trigia ,int dungtichxe){
        this.tenchuxe=tenchuxe;
        this.trigia=trigia;
        this.dungtichxe=dungtichxe;
    }
    public double thue() {
        if (dungtichxe < 100) {
            return trigia * 0.01;
        } else if (dungtichxe <= 200) {
            return trigia* 0.03;
        } else {
            return trigia * 0.05;
        }
    }
       @Override
    public String toString() {
        return String.format("%-20s %-10.2f %-10d %-10.2f", tenchuxe, trigia, dungtichxe, thue());
    }
}
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("nhap thong tin chu  xe:");
        System.out.print("Chu xe: ");
        String tenchuxe1 = scanner.nextLine();
        System.out.print("Trị giá xe: ");
        double trigia = scanner.nextDouble();
        System.out.print("Dung tich xe: ");
        int dungtichxe1 = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Nhap thong tin xe 2:");
        System.out.print("Chu xe: ");
        String tenchuxe2 = scanner.nextLine();
        System.out.print("Tri gia xe: ");
        double trigia2 = scanner.nextDouble();
        System.out.print("Dung tich xe: ");
        int dungtichxe2 = scanner.nextInt();
        scanner.nextLine(); 
        
        System.out.println("Nhap thong tin xe 3:");
        System.out.print("Chu xe: ");
        String tenchuxe3 = scanner.nextLine();
        System.out.print("Tri gia xe: ");
        double trigia3 = scanner.nextDouble();
        System.out.print("Dung tich xe: ");
        int dungtichxe3 = scanner.nextInt();
    
       xe xe1 = new xe(tenchuxe2, trigia2,dungtichxe2);
       xe xe2 = new xe(tenchuxe2, trigia2,dungtichxe2);
       xe xe3 = new xe(tenchuxe3, trigia3,dungtichxe3);
        
        System.out.println("bang khai thue truoc ba cua cac xe:");
        System.out.printf("%-20s %-10s %-10s %-10s", "ten chu xe", "tri gia", "Dung tich xe", "Thue");
        System.out.println("----------------------------------------------------");
        System.out.println(xe1);
        System.out.println(xe2);
        System.out.println(xe3);
          }
}

