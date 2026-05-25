package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        count(3,3,"");
//        System.out.println(pathwithDiagonal(3,3,""));
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int path[][]=new int[board.length][board[0].length];
//        pathwithRestrictions(0,0,"",board);
//        allDirection(0,0,"",board);
        printallDirection(0,0,"",board,path,1);
    }
    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }

    static void count(int r,int c,String p){
        if(r==1 && c==1){
            System.out.println(p);
            return  ;
        }
        if(r>1) {
            count(r - 1, c, p + 'D');
        }
        if(c>1) {
            count(r, c - 1, p + 'R');
        }


    }

    static ArrayList<String> pathwithDiagonal(int r, int c, String p){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();

        if(r>1) {
         list.addAll(pathwithDiagonal(r - 1, c, p + 'D'));
        }
        if(c>1) {
            list.addAll(pathwithDiagonal(r, c - 1, p + 'R'));
        }
        if(r>1 && c>1){
            list.addAll(pathwithDiagonal(r-1,c-1,p+'D'));
        }
return list;
    }
    static void pathwithRestrictions(int r, int c, String p, boolean[][] maze){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return  ;
        }
        if(maze[r][c]==false){
            return;
        }
        if(r<maze.length-1) {
            pathwithRestrictions(r +1, c, p + 'D',maze);
        }
        if(c<maze[0].length-1) {
            pathwithRestrictions(r, c +1, p + 'R',maze);
        }


    }

    static void allDirection(int r, int c, String p, boolean[][] maze){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return  ;
        }
        if(maze[r][c]==false){
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1) {
            allDirection(r+1, c, p + 'D',maze);
        }
        if(c<maze[0].length-1) {
            allDirection(r, c +1, p + 'R',maze);
        }
        if(r>0){
            allDirection(r-1,c,p+'U',maze);
        }
        if(c>0){
            allDirection(r,c-1,p+'L',maze);
        }
    //this line is where the function will be over
        //so before the function get removed, also remove the changes that wore made by that function
        maze[r][c]=true;
    }

    static void printallDirection(int r, int c, String p, boolean[][] maze,int[][] path,int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }

            System.out.println(p);
            System.out.println();
            return  ;
        }
        if(maze[r][c]==false){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1) {
            printallDirection(r+1, c, p + 'D',maze,path,step+1);
        }
        if(c<maze[0].length-1) {
            printallDirection(r, c +1, p + 'R',maze,path,step+1);
        }
        if(r>0){
            printallDirection(r-1,c,p+'U',maze,path,step+1);
        }
        if(c>0){
            printallDirection(r,c-1,p+'L',maze,path,step+1);
        }
        //this line is where the function will be over
        //so before the function get removed, also remove the changes that wore made by that function
        maze[r][c]=true;
        path[r][c]=0;
    }
}
