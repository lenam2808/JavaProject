package Kiemtra;
import java.util.Scanner;
public class HoaDon extends KhachhangAb {
    private String sohd;
    private String ngayban;
    private String tenkh;

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so hoa don: ");
        sohd = scanner.nextLine();
        System.out.print("Nhap ngay ban: ");
        ngayban = scanner.nextLine();
    };
    public void hien() {
        System.out.println("So hoa don: " + sohd);
        System.out.println("Ngay ban: " + ngayban);
        System.out.println("Ten khach hang: " + tenkh);
    };
}
	