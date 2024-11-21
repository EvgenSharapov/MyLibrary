package array;

import java.util.Arrays;

public class MinimumPathSum {
    public static void main(String[] args) {
        int[][]array={{1,2,3,4,5,11},{2,3,4,5,6,7},{3,4,5,6,7,11},{4,5,6,7,11,9}};
        System.out.println(minPathSum(array));

    }
        public static int minPathSum(int[][]grid){
        int m=grid.length;
        int n=grid[0].length;

        for(int i=1;i<m;i++){
            grid[i][0]+=grid[i-1][0];
        }
        for(int x=0;x<m;x++){
            for(int y=0;y<n;y++){
                System.out.print(grid[x][y]+"\t");
            }
            System.out.println();
        }
            System.out.println();

        for (int j=1;j<n;j++){
            grid[0][j]+=grid[0][j-1];
        }
            for(int x=0;x<m;x++){
                for(int y=0;y<n;y++){
                    System.out.print(grid[x][y]+"\t");
                }
                System.out.println();
            }
            System.out.println();
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
                System.out.print(grid[i][j]+" ");

            }

        }
            System.out.println();
        return grid[m-1][n-1];
        }
}
