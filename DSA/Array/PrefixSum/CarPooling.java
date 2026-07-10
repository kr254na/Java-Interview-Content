package DSA.Array.PrefixSum;

/*
There is a car with capacity empty seats. The vehicle only drives east (i.e., it cannot turn around and drive west).
You are given the integer capacity and an array trips where trips[i] = [numPassengersi, fromi, toi] indicates that the ith trip has numPassengersi passengers and the locations to pick them up and drop them off are fromi and toi respectively. The locations are given as the number of kilometers due east from the car's initial location.
Return true if it is possible to pick up and drop off all passengers for all the given trips, or false otherwise.
Example 1:
Input: trips = [[2,1,5],[3,3,7]], capacity = 4
Output: false
Example 2:
Input: trips = [[2,1,5],[3,3,7]], capacity = 5
Output: true
 */

class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        int diff[] = new int[1001];
        for(int i=0;i<trips.length;i++){
            int people = trips[i][0];
            int from = trips[i][1];
            int to = trips[i][2];
            diff[from]+=people;
            diff[to]-=people;
        }
        int people=0;
        for(int i=0;i<diff.length;i++){
            people+=diff[i];
            if(people>capacity){
                return false;
            }
        }
        return true;
    }
}
