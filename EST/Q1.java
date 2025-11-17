class Q1 {
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        return a / b;
    }
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());

        } finally {
            System.out.println("Program ended. Cleaning up...");
        }
    }
}
