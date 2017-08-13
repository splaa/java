public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Reader reader = new Reader();
        reader.Scan();
        /*i = count(i);
        k = count(k);
        System.out.println("Variable i = " + i +"\n");
        System.out.println("Variable k = " + k +"\n");*/
    }

    private static int count(int x) {
        return ++x;
    }
}
