public class MethodFunction {

    public static int rumus1(int a, int b){
        System.out.println("Runtime 1");
        return (a+b/2);
    }

    public static int rumus2(int a, int b){
        System.out.println("Runtime 2");
        return (a-b*2);
    }

    public static String mahasiswa(String nama){
        System.out.println("Runtime 3");
        return nama;
    }

    public static void main(String[] args) {
        System.out.println(rumus1(10,8));
        System.out.println(rumus2(10,8));
        System.out.println(mahasiswa("Reza Syahrial Putra"));
    }
}
