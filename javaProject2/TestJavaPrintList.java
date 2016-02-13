package javaProject2;

public class TestJavaPrintList {

	public static void main(String[] args) 
	{
		int A[][] = {{23,34,52,12,32},{14,46,67}};
		int B[][] = add10(A);
		for (int i=0;i<B.length;i++)
		{
			for(int j=0;j<B[i].length;j++)
			{
				System.out.print(B[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
	
	public static int[][] add10(int arr[][])
	{
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] += 10;
			}
		}
		return arr;
	}

}
