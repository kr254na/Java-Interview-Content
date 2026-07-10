package DSA.Array.PrefixSum;

/*
Given a 2D matrix matrix, handle multiple queries of the following type:

Calculate the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
Implement the NumMatrix class:

NumMatrix(int[][] matrix) Initializes the object with the integer matrix matrix.
int sumRegion(int row1, int col1, int row2, int col2) Returns the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
You must design an algorithm where sumRegion works on O(1) time complexity.
 */

class RangeSumQuery {
    int [][] mat;
    public RangeSumQuery(int[][] matrix) {
        mat = new int[matrix.length+1][matrix[0].length+1];
        for(int i=1;i<mat.length;i++){
            for(int j=1;j<mat[0].length;j++){
                mat[i][j]=matrix[i-1][j-1]+mat[i-1][j]+mat[i][j-1]-mat[i-1][j-1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return mat[row2+1][col2+1]-mat[row1][col2+1]-mat[row2+1][col1]+mat[row1][col1];
    }
}

/**
 * Your RangeSumQuery object will be instantiated and called as such:
 * RangeSumQuery obj = new RangeSumQuery(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */