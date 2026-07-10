package DSA.Array.KadaneAlgo;

/*
Approach without Kadane's Alorithm
*/

public class MaximumSubarrayProduct {
    public static void main(String[] args) {
        int arr[] = {-3,3,5,-3,1,-4,5,-2,-4};
        int maxProd=Integer.MIN_VALUE,pref=1,suff=1;
        for(int i=0;i<arr.length;i++){
            if(pref==0)
                pref=1;
            if(suff==0)
                suff=1;
            pref*=arr[i];
            suff*=arr[arr.length-i-1];
            maxProd=Math.max(maxProd,Math.max(pref,suff));
            System.out.println("Prefix = "+pref+", Suffix = "+suff+", Max Product = "+maxProd);
        }
        System.out.println(maxProd);
    }
}
