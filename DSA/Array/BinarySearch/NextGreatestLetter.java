package DSA.Array.BinarySearch;

/*
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
 */

class NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int low=0,high=letters.length-1,mid;
        char ch=letters[0];
        while(low<=high){
            mid=low+(high-low)/2;
            if(letters[mid]>target){
                ch=letters[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ch; // May also return letters[low%letters.length]
    }
}
