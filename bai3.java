package ngay10thang3;
import java.util.Scanner;
public class bai3 {
	public static void main(String[] args) {
		MaTran mt = new MaTran();
		mt.nhap();
		mt.xuat();
		System.out.println(mt.donvi());
		if(mt.donvi())
		{
			System.out.println("Ma tran tren ko la ma tran don vi!");
		}
		else
		{
			System.out.println("Ma tran tren la ma tran don vi!");
		}
	}
}
class MaTran{
	int n,i,j;
	public int[][] a = new int[10][10];
	Scanner sc = new Scanner(System.in);
	public void nhap() {
		System.out.println("Nhap so bac cua ma tran:");
		n = sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println("Nhap phan tu thu [" +i+", "+j+" ]: ");
				a[i][j] = sc.nextInt();
			}
		}
	}
	public void xuat() {
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
	boolean donvi() {
		int i,j=0;
		for(i=0;i<n;i++)
		{
			if(a[i][j]!=1)
				return false;
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i!=j && a[j][i]!=0)
					return false;
			}
		}
		return true;
	}
}
