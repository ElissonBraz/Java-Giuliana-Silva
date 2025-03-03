public class ForStructure {
    public static void main(String[] args) {
        int n = 7, factorial = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println("i: " + i + ", fatorial: " + factorial);
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
