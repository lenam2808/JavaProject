package ngay10thang3;
import java.util.Scanner;
public class bai1 {
	public static void main(String[] args) {
		DIEM d =new DIEM();
		d.nhapToado();
		d.xuatToado();
		if(d.x == 0 || d.y == 0)
		{
			System.out.println("Diem khong tren 2 truc toa do");
		}
		else {
			System.out.println("Dien tich tam giac la: "+d.x * d.y);
		}
		
	}
}
class DIEM{
	int x,y;
	void nhapToado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap hoanh do: ");
		x = sc.nextInt();
		System.out.println("Nhap tung do: ");
		y = sc.nextInt();
	}
	void xuatToado() {
		System.out.println("Toa do vua nhap la: (" +x+","+y+")");
	}
	void dxOx() {
		y = -y;
		System.out.println("Toa do doi xung voi Ox la: (" +x+","+y+")");
	}
	double KhoangCach(DIEM d1, DIEM d2) {
		double kc=0;
		kc = Math.sqrt((d1.x-d2.x)*(d1.x-d2.x)+(d1.y-d2.y)*(d1.y-d2.y));
		return kc;
	}
}

