public class DisplayNumbers {
    public static void main(String[] args) {
        int numbers[] = {72, 5, -6, 22, -9};

        int i = 0;

        do{
            System.out.println(numbers[i]);
            i++;
        }while (i < numbers.length && numbers[i-1] > 0);
    }
}
