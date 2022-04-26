

public class TestTanggal {
    public static void main(String[] args) {
        Tanggal tanggal = new Tanggal(1,2,2014);
        System.out.println(tanggal.toString());

        tanggal.setBulan(12);
        tanggal.setHari(9);
        tanggal.setTahun(2099);
        System.out.println(tanggal.toString());
        System.out.println("Bulan: " + tanggal.getBulan());
        System.out.println("Hari: " + tanggal.getHari());
        System.out.println("Tahun: " + tanggal.getTahun());

        tanggal.setDate(3,4,2016);
        System.out.println(tanggal.toString());
    }
}
