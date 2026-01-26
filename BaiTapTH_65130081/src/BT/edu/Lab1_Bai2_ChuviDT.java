package BT.edu;

import java.util.Scanner;

public class Lab1_Bai2_ChuviDT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap chieu dai: ");
		double dai = sc.nextDouble();
		System.out.print("Nhap chieu rong: ");
		double rong = sc.nextDouble();
		
		double chuVi = (dai + rong) * 2;
		double dienTich = dai * rong;
		double canhNho = Math.min(dai, rong);
		
		System.out.println("chu vi hinh chu nhat: " + chuVi);
		System.out.println("dien tich hinh chu nhat: " + dienTich);
		System.out.println("canh nho cua hinh chu nhat: " + canhNho);
	}

}
