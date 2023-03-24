public class Calculator {

    public float add(float n1, float n2) {

        return n1 + n2;

    }

    public float subtract(float n1, float n2) {

        return n1 - n2;

    }

    public float divide(float n1, float n2) throws ArithmeticException {
        if (n1 == 0 || n2 == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return n1 / n2;

    }

    public float multiply(float n1, float n2) {

        return n1 * n2;

    }

}
