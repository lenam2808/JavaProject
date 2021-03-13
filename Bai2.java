package ngay10thang3;
import java.util.Scanner;
public class Bai2 {
	public static void main(String[] args) {
		ThoiGian t = new ThoiGian();
		int h = t.getGio();
		int m = t.getPhut();
		int s = t.getGiay();
		int a = t.Chuyen(s,m,h);
		System.out.println("Nhap so van dong vien: ");
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		ThoiGian[] x =new ThoiGian[10];
		for(int i=0;i<n;i++)
		{
			System.out.println("Thoi gian chay cua VDV thu "+i+" la: ");
			x[i] = new ThoiGian();
			x[i].nhap();
		}
		for(int i=0;i<n;i++)
		{
			x[i].xuat();
		}
		int min= x[0].Chuyen(x[0].getGiay(), x[0].getPhut(), x[0].getGio());
		int vtmin = 0;
		for(int i=0;i<n;i++)
		{
			if(x[i].Chuyen(x[i].getGiay(), x[i].getPhut(), x[i].getGio())<min)
			{
				vtmin = i;
				min = x[i].Chuyen(x[i].getGiay(), x[i].getPhut(), x[i].getGio());
			}
		}
		System.out.println("VDV chay nhanh nhat la");
		x[vtmin].xuat();
		int tb = 0;
		for(int i=0;i<n;i++)
		{
			tb = tb +  x[i].Chuyen(x[i].getGiay(), x[i].getPhut(), x[i].getGio());
		}
		System.out.println("Thoi gian chay trung binh cua cac VDV la: "+tb/n+" giay");
	}
}
class ThoiGian{
	private int gio,phut,giay;
	public int getGio() {
		return this.gio;
	}
	public void setGio(int gio) {
		this.gio = gio;
	}
	public int getPhut() {
		return this.phut;
	}
	public void setPhut(int phut) {
		this.phut = phut;
	}
	public int getGiay() {
		return this.giay;
	}
	public void setGiay(int giay) {
		this.giay = giay;
	}
	public ThoiGian() {
		gio = 0;
		phut = 0;
		giay = 0;
	}
	void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gio:");
		gio = sc.nextInt();
		System.out.println("Nhap phut:");
		phut = sc.nextInt();
		System.out.println("Nhap giay:");
		giay = sc.nextInt();
	}
	void xuat() {
		System.out.println("time = "+gio+" gio, "+phut+" phut, "+giay+" giay");
	}
	public int Chuyen(int giay,int phut, int gio) {
		int time1;
		time1 = giay+phut*60+gio*3600;
		return time1;
	}
	void sosanh(int a,int b) {
		if(a>b)
		{
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
	}
}