package gaji;

public class Karyawan {
    private int gajiPokok;

    public Karyawan(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public int hitungGajiPokok(int jumlahHari){
        return + 8 * gajiPokok * jumlahHari;
    }
    
    public int hitungBonus(int jumlahHari){
        return 0;
    }
    
    public int hitungInsentif(int jumlahHari){
        return 0;
    }
}
