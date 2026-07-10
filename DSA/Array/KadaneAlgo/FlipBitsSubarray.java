package DSA.Array.KadaneAlgo;

/*
Flip Bits to Maximize 1's
Example
001110
Flip one subarray.
After flipping
111110
Maximum ones.
Hint
0 → +1
1 → -1
Then apply Kadane.
 */
public class FlipBitsSubarray {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,0,1,1,0,0,0,1};
        int ones=0,curr=0,gain=Integer.MIN_VALUE;
        for (int bit : arr) {
            if (bit == 1)
                ones++;
            int value = (bit == 0) ? 1 : -1;
            curr = Math.max(value, curr + value);
            gain = Math.max(gain, curr);
        }
        System.out.println(ones + gain);
    }
}
