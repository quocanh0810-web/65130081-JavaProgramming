
package BT.edu;

import java.util.Scanner;
public class Lab1_Bai1_DTB {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ho va ten sinh vien: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhap diem trung binh: ");
        double dtb = sc.nextDouble();

        System.out.println("Ho ten sinh vien: " + hoTen);
        System.out.println("Diem trung binh: " + dtb);
    }
}
