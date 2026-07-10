package DSA.PrimeNumber;

/*
Square Root Optimization - Every number has atleast one factor below root of n for factor above root of n
Time Complexity
O(√n)
Space
O(1)
 */
public class SquareRootMethod {
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
