

public class Tanggal {
    private int hari;
    private int bulan;
    private int tahun;

    public  Tanggal(int hari, int bulan, int tahun){
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public int getHari() {
        return hari;
    }

    public int getBulan() {
        return bulan;
    }

    public int getTahun() {
        return tahun;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setDate(int hari, int bulan, int tahun){
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public String toString(){
        return String.format("%02d/%02d/%04d", hari,bulan,tahun);
    }

}
