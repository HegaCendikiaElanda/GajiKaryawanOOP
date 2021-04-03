package gaji;

public class Manager extends Karyawan {
    private int bonus = 10;
    public Manager(){
        super(50);
    }
    public int hitungBonus(int jumlahHari){
        return bonus*jumlahHari;
    }
}
