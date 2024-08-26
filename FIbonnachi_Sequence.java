public class FibonacciSequence {

    public static int[] generateFibonacciSequence(int n) {
        if (n <= 0) {
            return new int[]{};
        }

        int[] fibonacci = new int[n];
        fibonacci[0] = 0;

        if (n > 1) {
            fibonacci[1] = 1;

            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }

        return fibonacci;
    }
    public static void main(String[] args) {
        // Test the Fibonacci sequence generator
        int[] sequence = generateFibonacciSequence(10);
        for (int num : sequence) {
            System.out.print(num + " ");
        }
    }
}
