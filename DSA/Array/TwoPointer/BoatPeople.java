package DSA.Array.TwoPointer;

import java.util.Arrays;

/*
    You are given:
    people[i] = weight of the i-th person
    limit = maximum weight a boat can carry
    Each boat can carry at most 2 people
    Find the minimum number of boats needed.
 */
public class BoatPeople {
    public static void main(String[] args) {
        int weights[] = {2,3,2,5,1,6,8,3,5};
        int limit = 10;
        Arrays.sort(weights);
        // 1,2,2,3,3,5,5,6,8      1,8  2,6  2,5  3,5  3
        int low=0,high=weights.length-1,boats=0;
        while(low<=high){
            if(weights[low]+weights[high]<=limit)
            {
                low++;
            }
            high--;
            boats++;
        }
        System.out.println(boats);
    }
}
