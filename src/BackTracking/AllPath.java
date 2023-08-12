package BackTracking;

import java.util.Arrays;

public class AllPath {
    public static void main(String[] args) {
        boolean maze[][]=
                {
                        {true,true,true},
                        {true,true,true},
                        {true,true,true}
                };
      //  allPath("",maze,0,0);
    int arr[][]=new int[maze.length][maze[0].length];
    allPathprint("",maze,0,0,arr,1);
    }
    static void allPath(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        // i am considering this block in my path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPath(p + 'D', maze, r+1, c);
        }

        if (c < maze[0].length - 1) {
            allPath(p + 'R', maze, r, c+1);
        }

        if (r > 0) {
            allPath(p + 'U', maze, r-1, c);
        }

        if (c > 0) {
            allPath(p + 'L', maze, r, c-1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
         maze[r][c] = true;
    }
    static void allPathprint(String p, boolean[][] maze, int r, int c,int[][] arr,int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            arr[r][c]=step;
            for (int a[]:arr) {
                System.out.println(Arrays.toString(a));}
            System.out.println(p);
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }
        arr[r][c]=step;
        // i am considering this block in my path
        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPathprint(p + 'D', maze, r+1, c,arr,step+1);
        }

        if (c < maze[0].length - 1) {
            allPathprint(p + 'R', maze, r, c+1,arr,step+1);
        }

        if (r > 0) {
            allPathprint(p + 'U', maze, r-1,c,arr,step-1);
        }

        if (c > 0) {
            allPathprint(p + 'L', maze, r, c-1,arr,step-1);
        }
        arr[r][c]=0;
        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }

}
