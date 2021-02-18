import java.util.ArrayList;
import java.util.Random;

public class Question_1
{
	public static void main(String args[])
	{
		int n=1;
		short maxVal=100;
		short minVal=10;
		RandomArray(n, maxVal, minVal);
	}
	
	public static ArrayList<Short> RandomArray(int n, short maxVal, short minVal)
	{
		if(n<=0)
		{
			return null;
		}
		ArrayList<Short> RandomNumber = new ArrayList<Short>(n);
		if(minVal>maxVal)
		{
			return RandomNumber;
		}
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		for(int i=0;i<n;i++)
		{
			int r = Math.abs(rand.nextInt((maxVal+1)-minVal)+minVal);
			short Random_Short = (short)r;
			RandomNumber.add(Random_Short);
		}
		return RandomNumber;
	}
}