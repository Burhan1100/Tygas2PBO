package bangunRuang;
import BangunDatar;
public class Balok extends persegiPanjang{
    private int tinggi;
    private double volume;
    public Balok(int panjang,int lebar,int tinggi) {
        super(panjang,lebar);
        this.tinggi = tinggi;
        volume();
        luasPermukaan();
    }

    public void volume(){
        this.volume = super.Luas()*this.tinggi;
    }

    public void luasPermukaan(){
        double luas = 2*(super.getPanjang()*super.getLebar()
                + super.getPanjang()*this.tinggi
                + super.getLebar()*this.tinggi);
        super.setLuas(luas);
    }


    public double getVolume() {
        return volume;
    }

}