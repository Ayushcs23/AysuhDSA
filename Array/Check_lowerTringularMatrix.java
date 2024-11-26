package Array;

public class Check_lowerTringularMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{374, 0, 0,0 },
				{761, 60 ,0, 0 },
				{578 ,531, 878 ,0}, 
				{75 ,10, 197 ,198 }};
		System.out.print( lowerTriangluarMatrix( arr));
		}
    public static boolean lowerTriangluarMatrix(int arr[][]) {
    	for(int i=0;i<arr.length;i++) 
    	{
    		for(int j=0;j<arr.length;j++) {
    			if(j>i && arr[i][j]!=0)
    			{
    				return false;
    			}
    		}
    
    	}
    	return true;
    }
}