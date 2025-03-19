/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;
import java.util.Scanner;
public class bai1{
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
 
        System.out.print("nhap so luong phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] mang = new int[n];
        
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }
        
        System.out.println("mang vua nhat: " + Mang.toString(mang));
       
        System.out.print("nhap so nguyen x can tim: ");
        int x = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (mang[i] == x) {
                System.out.println("so " + x + " xuat hien tai vi tri: " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Số " + x + " không có trong mảng.");
        }
        
        int max = Mang.stream(mang).max().getAsInt();
        System.out.println("gia tri lon nhat trong mang: " + max);
        
        int min = Mang.stream(mang).min().getAsInt();
        System.out.println("gia tri nho nhat trong mang: " + min);
        
 
        for (int i = 0; i < n; i++) {
            if (mang[i] == max) {
                System.out.println("gia tri lon nhat xuat hien tai vi tri: " + i);
            }
        }

        Mang.sort(mang);
        System.out.println("mang sau khi sap xep tang dan: " + Mang.toString(mang));
      
    }
}

    

