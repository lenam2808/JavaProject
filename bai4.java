package ngay10thang3;
import java.util.Scanner;
public class bai4 {
	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.println("Nhap so sinh vien:");
		n = scan.nextInt();
		SinhVien[] a = new SinhVien[n];
		for(int i=0;i<n;i++)
		{
			System.out.printf("Nhap thong tin SV thu %d : \n",i+1);
			a[i] = new SinhVien();
			a[i].nhap();
			
		}
		for(int i=0;i<n;i++)
		{
			a[i].xuat();
			System.out.println("Diem TB la: "+a[i].DTB());
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				
				if(a[i].DTB()<a[j].DTB())
				{
					SinhVien temp =  new SinhVien();
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Danh sach sau khi sap xep la:");
		for(int i=0;i<n;i++)
		{
			a[i].xuat();
			System.out.println("Diem TB la: "+a[i].DTB());
		}
		
		
	}
}
class SinhVien{
	int n;
	String HoTen;
	String NgaySinh,GioiTinh,Lop;
	float dToan,dLy,dHoa;
	
	void nhap() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Nhap Ho ten:");
		HoTen = sc.nextLine();
		System.out.println("Nhap ngay sinh:");
		NgaySinh = sc.nextLine();
		System.out.println("Nhap gioi tinh:");
		GioiTinh = sc.nextLine();
		System.out.println("Nhap Lop:");
		Lop = sc.nextLine();
		System.out.println("Nhap diem Toan:");
		dToan = sc.nextFloat();
		System.out.println("Nhap diem Ly:");
		dLy = sc.nextFloat();
		System.out.println("Nhap diem Hoa:");
		dHoa = sc.nextFloat();
	}
	void xuat() {
		System.out.println("Ho ten: "+HoTen);
		System.out.println("Ngay sinh: "+NgaySinh);
		System.out.println("Gioi tinh: "+GioiTinh);
		System.out.println("Lop: "+Lop);
		System.out.println("Diem Toan: "+dToan);
		System.out.println("Diem Ly: "+dLy);
		System.out.println("Diem Hoa: "+dHoa);
	}
	float DTB() {
		float dtb = 0;
		dtb = (dToan + dLy + dHoa)/3;
		return dtb;
		
	}
}