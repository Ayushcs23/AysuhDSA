 package Recurssion;

public class Sudoku_solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{5,3,0,0,7,0,0,0,0},
				      {6,0,0,1,9,5,0,0,0},
				      {0,9,8,0,0,0,0,6,0},
				      {8,0,0,0,6,0,0,0,3},
				      {4,0,0,8,0,3,0,0,1},
				      {7,0,0,0,2,0,0,0,6},
				      {0,6,0,0,0,0,2,8,0},
				      {0,0,0,4,1,9,0,0,5},
				      {0,0,0,0,8,0,0,7,9}};
		suduko_sol(arr,0,0,8,8);
	}

	public static void suduko_sol(int[][] arr, int cc, int cr, int ec, int er) {
		//jb puri array pe traverse krle tb
		if(cc==ec+1 && cr==er) {
			Display(arr);
			return;
		}
		// agr humra current colm length se bada ho jaiye to
		if(cc>ec) {
			suduko_sol(arr,0,cr+1,ec,er);
			return;
		}
		
		if(arr[cr][cc]!=0) {
			suduko_sol(arr,cc+1,cr,ec,er);
		}
		else {
			for(int val=1;val<=9;val++) {
				if(isItposssiable(arr,cr,cc,val)==true) {
					arr[cr][cc]=val;
					suduko_sol(arr,cc+1,cr,ec,er);
					arr[cr][cc]=0;//backtrack
				}
			}
		}
	}
    public static boolean isItposssiable(int[][] arr, int cr, int cc, int val) {
		//row check 
		for(int i=0;i<=8;i++) {
			if(arr[i][cc]==val) {
				return false;
			}
		}
		//col check
		for(int i=0;i<=8;i++) {
			if(arr[cr][i]==val) {
				return false;
			}
		//matrix 3x3 check
		}
		cr=cr-cr%3;//hum jaha bhi hum check kasie krenge ki hum konsi 
		cc=cc-cc%3;//wali grid me hai isi wajah se krte hai
		for(int strt=cr;strt<cr+3;strt++) {
			for(int j=cc;j<cc+3;j++) {
				if(arr[strt][j]==val) {
					return false;
				}
			}
		}		
		return true;
	}
	public  static void Display(int[][] arr) {
	  for(int i=0;i<arr.length;i++) {
		  for(int j=0;j<arr.length;j++) {
			  System.out.print(arr[i][j]+" ");
		  }
		  System.out.println();
	  }
	}
}








