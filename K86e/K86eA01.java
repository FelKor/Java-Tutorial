import java.util.Scanner;
import java.math.BigInteger;

class K86eA01 {
    public static void main(String[] args) {
        String input;
        BigInteger N;
        BigInteger sum = BigInteger.ZERO;
        BigInteger sum2 = BigInteger.ZERO;
        Scanner scan = new Scanner(System.in);

        System.out.println("N: ");
        input = scan.nextLine();
        N = new BigInteger(input);
        scan.close();

        sum2 = N.multiply(N.add(BigInteger.ONE)).divide(BigInteger.TWO);

        while (N.compareTo(new BigInteger("1")) >= 0) {
            sum = sum.add(N);
            N = N.subtract(new BigInteger("1"));
        }

        System.out.println("Series  Sum: " + sum);
        System.out.println("Formula Sum: " + sum2);

    }
}