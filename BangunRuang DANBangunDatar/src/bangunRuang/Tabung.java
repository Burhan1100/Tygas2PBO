package bangunRuang;

import BangunDatar.Lingkaran;
public class Tabung extends Lingkaran{
    private double volume;
    private int tinggi;

    public Tabung(int jari,int tinggi){
        super(jari);
        this.tinggi=tinggi;
        volume();
        luasPermukaan();
    }
    public void luasPermukaan(){
        super.setLuas(2*super.Luas()+super.Keliling()*tinggi);
    }

    public void volume(){
        this.volume = super.Luas()*this.tinggi;
    }

    public double getVolume() {
        return volume;
    }
}
