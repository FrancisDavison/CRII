import java.util.Arrays;
import java.util.Random;
public class Question_2
{
	public static void main(String args[])
	{
		int n=0;
		int lower=1;
		int upper=100;
		RandomMatrix(n, lower, upper);
	}
	
	public static int[][] RandomMatrix(int n, int lower, int upper)
	{
		if(n<=0)
		{
			return null;
		}
		if(lower>upper)
		{
			return null;
		}
		int[][] RandGraph = new int[n][n];
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					RandGraph[i][j]=lower;
					break;
				}
				int r = Math.abs(rand.nextInt((upper+1)-lower)+lower);
				RandGraph[i][j]=r;
				RandGraph[j][i]=r;
			}
		}
		return RandGraph;
		
		
		
		
		
		
	}
}