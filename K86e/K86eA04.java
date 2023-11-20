import java.math.BigInteger;
import java.util.Scanner;

public class K86eA04 {
    static long fact_l(long input_l) {
        long result = 1;
        if (input_l == 1) {
            return result = 1;
        }
        for (long count = 1; count <= input_l; count++) {
            result *= count;
        }
        return result;
    }

    static String fact_S(String input_S) {
        BigInteger N = new BigInteger(input_S);
        BigInteger loop_count = new BigInteger("1");
        BigInteger result = new BigInteger("1");
        if (N.equals(BigInteger.ONE)) {
            return result.toString();
        }
        System.out.println("N is greater than one");
        while (loop_count.equals(N) == false) {
            loop_count = loop_count.add(BigInteger.ONE);
            result = result.multiply(loop_count);
            // System.out.println(loop_count+" : "+result);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Integer N:");
        String input_N = scan.nextLine();
        System.out.println("BigInteger: " + fact_S(input_N));
        System.out.println("Long: " + fact_l(Long.parseLong(input_N)));
    }
}
