//Tính C(k, n) modulo 10^9 + 7

import java.io.*;
import java.math.BigInteger;

public class ComputeC_k_n {
    public static void main(String[] args) {
        try {
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);

            String a[] = br.readLine().split(" ");
            int k = Integer.parseInt(a[0]);
            int n = Integer.parseInt(a[1]);
            BigInteger c = BigInteger.ONE;

            for (int i = 1; i <= k; i++)
                c = c.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i)); // c = c * (n - i + 1) / i

            long mod = 1000000007;
            while (c.compareTo(BigInteger.valueOf(mod)) >= 0) // vì c modulo 10^9 + 7 nên tràn số => chia lấy dư
                c = c.mod(BigInteger.valueOf(mod)); // c = c % mod

            System.out.println(c);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
