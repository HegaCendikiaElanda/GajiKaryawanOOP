package gaji;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input, jumlahHari, a, b, c;
        System.out.println("Aplikasi Hitung Gaji");
        System.out.println("1. Hitung Gaji Staff");
        System.out.println("2. Hitung Gaji Manager");
        System.out.println("3. Hitung Gaji Direktur");
        System.out.println("");
        System.out.print("Input : "); input = scan.nextInt();
        switch(input){
            case 1 : 
                System.out.println("");
                System.out.println("Aplikasi Hitung Gaji");
                System.out.print("Masukan jumlah hari : "); jumlahHari = scan.nextInt();
                Karyawan s = new Staff();
                System.out.println("");
                System.out.println("Rincian Gaji");
                System.out.println("Gaji Total : $" + s.hitungGajiPokok(jumlahHari));
                break;
            case 2 : 
                System.out.println("");
                System.out.println("Aplikasi Hitung Gaji");
                System.out.print("Masukan jumlah hari : "); jumlahHari = scan.nextInt();
                Karyawan m = new Manager();
                a = m.hitungGajiPokok(jumlahHari);
                b = m.hitungBonus(jumlahHari);
                System.out.println("");
                System.out.println("Rincian Gaji");
                System.out.println("Gaji Pokok : $ " + a);
                System.out.println("Bonus : $ " + b);
                System.out.println("Gaji Total : $ " + (a + b));
                break;
            case 3 :
                System.out.println("");
                System.out.println("Aplikasi Hitung Gaji");
                System.out.print("Masukan jumlah hari : "); jumlahHari = scan.nextInt();
                Karyawan d = new Direktur();
                a = d.hitungGajiPokok(jumlahHari);
                b = d.hitungBonus(jumlahHari);
                c = d.hitungInsentif(jumlahHari);
                System.out.println("");
                System.out.println("Rincian Gaji");
                System.out.println("Gaji Pokok : $ " + a);
                System.out.println("Bonus : $ " + b);
                System.out.println("Insentif : $ " + c);
                System.out.println("Gaji Total : $ " + (a + b + c));
                break;
            default : System.out.println("Input Tidak Valid"); break;
        }
    }
}
