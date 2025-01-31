package Recurssion;

import java.util.Scanner;

public class Rat_chase_its_cheese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char maze[][]=new char[n][m];
		for(int i=0;i<maze.length;i++) {
			String s=sc.next();
			for(int j=0;j<s.length();j++) {
				maze[i][j]=s.charAt(j);
			}
		}
		int ans[][]=new int[n][m];
		RAtinmaze(maze,0,0, ans);
	}
	public static void RAtinmaze(char[][] maze, int curr, int col,int ans[][]) {
		// TODO Auto-generated method stub
		if(curr==maze.length-1 && col==maze[0].length-1 && maze[curr][col]!='X') {
			maze[curr][col]='1';
			display(ans);
			return;
		}
		if(curr<0 || col<0 || curr>maze.length || col>maze[0].length || maze[curr][col]!='X') {
			return;
		}
		maze[curr][col]='0';
		ans[curr][col]=1;
		int r[]= {0,0,-1,-1};
		int c[]= {-1,1,0,0};
		for(int i=0;i<c.length;i++) {
			RAtinmaze(maze,curr+r[i],col+c[i],ans);
		}
		
//		RAtinmaze(maze,curr,col-1,ans);//left
//		RAtinmaze(maze,curr,col+1,ans);//right
//		RAtinmaze(maze,curr+1,col,ans);//down
//		RAtinmaze(maze,curr-1,col,ans);//up
		maze[curr][col]='1';
		ans[curr][col]=0;
	}
	public static void display(int[][] ans) {
		// TODO Auto-generated method stub
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]);
			}
			System.out.println();
		}
	}

}
