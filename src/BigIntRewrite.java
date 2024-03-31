import java.math.BigInteger;
public class BigIntRewrite {

    public static BigInteger pow(int x, int n) {
        BigInteger newX= BigInteger.valueOf(x);
        if (n == 0) return BigInteger.valueOf(1);
        // find x to the n/2 recursively
        BigInteger t = pow(x, n / 2);
        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x
        if (n % 2 == 0) {
            return t.multiply(t);
        } else {
            BigInteger theBigInteger=t.multiply(t);
            return  theBigInteger.multiply(newX);
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(20,20));

    }
}
