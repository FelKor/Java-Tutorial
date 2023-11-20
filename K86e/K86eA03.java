import java.util.Scanner;
import java.math.BigInteger;

class K86eA03 {
    public static void main(String[] args) {
        String input;
        BigInteger N;
        BigInteger sum = BigInteger.ZERO;
        BigInteger sum2 = BigInteger.ZERO;
        Scanner scan = new Scanner(System.in);

        System.out.println("(start) N: ");
        input = scan.nextLine();
        N = new BigInteger(input);
        scan.close();

        sum2 = N.multiply(BigInteger.TWO).add(BigInteger.ONE);

        while (N.compareTo(BigInteger.ZERO) != -1) {
            if (N.mod(BigInteger.TWO).equals(BigInteger.ONE)) {
                sum = sum.add(N);
                System.out.println("" + N);
            }
            N = N.subtract(BigInteger.ONE);
        }

        System.out.println("Series  Sum: " + sum);
        System.out.println("Formula Sum: " + sum2);
    }
}