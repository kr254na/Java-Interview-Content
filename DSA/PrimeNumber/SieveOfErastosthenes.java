package DSA.PrimeNumber;

import java.util.Arrays;

/*
Prime Numbers from 1 to n
Sieve of Eratosthenes Approach
Time : O(n log log n)
Space : O(n)
 */

public class SieveOfErastosthenes {
    public static void sieve(int n){

        boolean prime[] = new boolean[n+1];

        Arrays.fill(prime,true);

        prime[0]=false;
        prime[1]=false;

        for(int i=2;i*i<=n;i++){

            if(prime[i]){

                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }

        for(int i=2;i<=n;i++){

            if(prime[i])
                System.out.print(i+" ");
        }
    }
}
