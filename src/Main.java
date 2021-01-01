public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            printNumber(i);
        }
    }

    private static void printNumber(int number) {
        System.out.println(number);
    }

    private static void printSquareOf(int number) {
        System.out.println(number * number);
    }
}
