package Kiemtra;
import java.util.Scanner;
public class KhachHang extends KhachhangAb {
        private    String makh;
        private String tenkh;
        private String sodt;
        public KhachHang(String tenkh, String sodt,String makh) {
            this.makh=makh;
            this.tenkh=tenkh;
            this.sodt=sodt;
        }


        public void nhap() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap ma khach hang: ");
            makh = scanner.nextLine();
            System.out.print("Nhap ten khach hang: ");
            tenkh = scanner.nextLine();
            System.out.print("Ma so dien thoai: ");
            sodt = scanner.nextLine();
        };
        public void hien() {
             System.out.println("Ma khach hang: " + makh);
             System.out.println("Ten khach hang: " + tenkh);
             System.out.println("So dien thoai: " + sodt);
        };


}
