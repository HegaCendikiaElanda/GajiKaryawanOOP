/*
 * Nama : Hega Cendikia Elanda
 * NPM : 0619101012
 */
package gaji;

public class Direktur extends Karyawan {
    private int insentif = 300;
    private int bonus = 20;
    public Direktur(){
        super(75);
    }
    
    public int hitungBonus(int jumlahHari){
        return bonus*jumlahHari;
    }
    
    public int hitungInsentif(int jumlahHari){
        if (jumlahHari >= 10)
            return insentif*(jumlahHari/10);
        else
            return 0;
    }
}
