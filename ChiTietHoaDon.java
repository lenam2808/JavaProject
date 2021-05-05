package Kiemtra;

import java.util.Scanner;
public class ChiTietHoaDon extends HoaDon {
    private String masp;
    private String tensp;
    private int soluong,dongia;
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma san pham: ");
        masp = scanner.nextLine();
        System.out.print("Nhap ten san pham: ");
        tensp = scanner.nextLine();
        System.out.print("Nhap so luong: ");
        soluong = scanner.nextInt();
        System.out.print("Nhap dongia: ");
        dongia = scanner.nextInt();
    };
    public void hien() {
        System.out.println("Ma san pham: " + masp);
        System.out.println("Ten sanpham: " + tensp);
        System.out.println("So luong: " + soluong);
        System.out.println("Don gia: " + dongia);
    };
}