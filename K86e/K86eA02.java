import java.util.Scanner;
import java.math.BigInteger;

class K86eA02 {
    public static void main(String[] args) {
        String input;
        BigInteger N, M;
        BigInteger sum = BigInteger.ZERO;
        BigInteger sum2 = BigInteger.ZERO;
        Scanner scan = new Scanner(System.in);

        System.out.println("(start) N: ");
        input = scan.nextLine();
        N = new BigInteger(input);

        System.out.println("(end) M: ");
        input = scan.nextLine();
        M = new BigInteger(input);
        scan.close();

        sum2 = (M.multiply(M.add(BigInteger.ONE)).divide(BigInteger.TWO))
                .subtract(((N.subtract(BigInteger.ONE)).multiply(N.add(BigInteger.ONE))).divide(BigInteger.TWO));

        while (N.compareTo(M) != 1) {
            sum = sum.add(N);
            N = N.add(BigInteger.ONE);
        }
        System.out.println("Series  Sum: " + sum);
        System.out.println("Formula Sum: " + sum2);
    }
}