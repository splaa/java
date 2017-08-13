public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Reader reader = new Reader();
        reader.Scan();
        reader.i = count(reader.i);
        reader.k = count(reader.k);
        System.out.println(reader.i);
        System.out.println(reader.k);
        reader.i = 11;
        reader.k = 22;
        System.out.println("Первое число: " + reader.i);
        System.out.println("Второе число: " + reader.k);

    }

    private static int count(int x) {
        return ++x;
    }
}
