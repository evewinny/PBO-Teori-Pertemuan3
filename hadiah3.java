import java.util.Scanner;
public class hadiah3 {
	public static void main(String[] args) {
		Scanner masukan = new Scanner(System.in);	
	System.out.println("Nomor 1");
	int aa = 5;
	int bb = 6;
	double cc = 0.5;
	System.out.println("aa=" + aa+ "bb =" + bb+ "cc =" + cc);
	System.out.println("aa + bb = " + (aa+bb));
	System.out.println("aa x bb x cc =" + (aa*bb*cc));
	System.out.println("bb / cc =" + (bb/cc));
	System.out.println();
	
	System.out.println("Nomor 2");
	String nama, alamat;
	int umur;
	
	System.out.print("Masukkan nama anda = ");
	nama = masukan.nextLine();
	System.out.print("Masukkan alamat anda = ");
	alamat = masukan.nextLine();
	System.out.print("Masukkan umur anda = ");
	umur = masukan.nextInt();
		System.out.println("Saudara " + nama);
		System.out.println("Tinggal di " +alamat);
		System.out.println("Berumur "+umur+" tahun");
	}
}