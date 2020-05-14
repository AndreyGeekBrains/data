package homework.lesson5;

public class Main {

    public static void main(String[] args) {
        System.out.println(exponentiation(0, 1));
        System.out.println(exponentiation(1, 1));
        System.out.println(exponentiation(2, 2));
        System.out.println(exponentiation(3, -3));
        System.out.println(exponentiation(4, 4));
        System.out.println(exponentiation(5, -5));
    }

    private static double exponentiation(double digit, int rank) {
        if (digit == 0) {
            if (rank > 0)
                return 0;
            else
                throw new IllegalArgumentException("Invalid rank " + rank + " for value = 0");
        }
        if (rank < 0) {
            return 1 / (digit * exponentiation(digit, -rank - 1));
        }
        else if (rank > 0) {
            return digit * exponentiation(digit, rank - 1);
        }
        else {
            return 1;
        }
    }
}
