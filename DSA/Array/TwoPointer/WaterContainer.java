package DSA.Array.TwoPointer;

/*
    You are given an array where each element represents the height of a vertical line.
    Find two lines that together with the x-axis form a container that can hold the maximum amount of water.
 */

public class WaterContainer {
    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        int low=0,high=heights.length-1,area=0;
        while(low<high){
            area = Math.max(area,Math.min(heights[low],heights[high])*(high-low));
            if(heights[low]<heights[high]){
                low++;
            }
            else{
                high--;
            }
        }
        System.out.println(area);
    }
}
