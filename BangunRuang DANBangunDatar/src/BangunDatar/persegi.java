package BangunDatar;

public class persegi extends Bangundatar {
    private int sisi;

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public persegi(int sisi) {
        this.sisi = sisi;
        luas();keliling();
    }
    public void luas(){
        double luas = this.sisi*this.sisi;
        super.setLuas(luas);
    }

    public void keliling(){
        super.setKeliling(4*this.sisi);
    }

    public int getSisi() {
        return sisi;
    }

    public void volume() {
    }

}
