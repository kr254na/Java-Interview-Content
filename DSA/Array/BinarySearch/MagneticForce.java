package DSA.Array.BinarySearch;

import java.util.Arrays;

/*
In the universe Earth C-137, Rick discovered a special form of magnetic force between two balls if they are put in his new invented basket. Rick has n empty baskets, the ith basket is at position[i], Morty has m balls and needs to distribute the balls into the baskets such that the minimum magnetic force between any two balls is maximum.
Rick stated that magnetic force between two different balls at positions x and y is |x - y|.
Given the integer array position and the integer m. Return the required force.

Example 1:
Input: position = [1,2,3,4,7], m = 3
Output: 3
Explanation: Distributing the 3 balls into baskets 1, 4 and 7 will make the magnetic force between ball pairs [3, 3, 6]. The minimum magnetic force is 3. We cannot achieve a larger minimum magnetic force than 3.
 */

public class MagneticForce {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int ans = 0;
        int low = 1, mid, high = position[position.length - 1] - position[0];
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (canPlace(position, m, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    boolean canPlace(int[] position, int m, int dist) {
        int balls = 1;
        int last = position[0];
        for (int i = 1; i < position.length; i++) {
            if (position[i] - last >= dist) {
                balls++;
                last = position[i];
                if (balls == m) {
                    return true;
                }
            }
        }
        return balls >= m;
    }
}