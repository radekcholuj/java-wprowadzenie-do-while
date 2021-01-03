public class Divisibility {
    public static void main(String[] args) {
        int i = 25;

        do {
            System.out.print(i % 2);
            i /= 2;
        } while (i > 0);
    }
}
