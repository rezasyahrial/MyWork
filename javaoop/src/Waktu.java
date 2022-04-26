

public class Waktu {
    private int jam;
    private int menit;
    private int detik;

    public Waktu(int jam, int menit, int detik){
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public int getMenit() {
        return menit;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public int getDetik() {
        return detik;
    }

    public void setDetik(int detik) {
        this.detik = detik;
    }

    public void setWaktu(int jam, int menit, int detik){
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;
    }

    public String toString(){
        return String.format("%02d:%02d;%02d", jam, menit, detik);
    }

    public Waktu nextSecond(){
        ++detik;
        if(detik >= 60){
            detik = 0;
            ++menit;
            if (menit >= 60){
                menit = 0;
                ++jam;
                if(jam >=24){
                    jam = 0;
                }
            }
        }
        return this;
    }

    public Waktu previousSecond(){
        --detik;
        if(detik < 0){
            detik = 59;
            --menit;
            if(menit < 0){
                menit = 59;
                --jam;
                if (jam < 0){
                    jam = 23;
                }
            }
        }
        return this;
    }

}
