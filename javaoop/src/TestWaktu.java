

public class TestWaktu {

    public static void main(String[] args) {

        Waktu waktu = new Waktu(1,2,3);
        System.out.println(waktu.toString());

        waktu.setJam(4);
        waktu.setMenit(5);
        waktu.setDetik(6);
        System.out.println(waktu.toString());
        System.out.println("Jam: " + waktu.getJam());
        System.out.println("Menit: " + waktu.getMenit());
        System.out.println("Detik: " + waktu.getDetik());

        waktu.setWaktu(23,59,58);
        System.out.println(waktu.toString());

        System.out.println(waktu.nextSecond());
        System.out.println(waktu.nextSecond().nextSecond());

        System.out.println(waktu.previousSecond());
        System.out.println(waktu.previousSecond().previousSecond());

    }
}
