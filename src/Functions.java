import java.util.ArrayList;
import java.util.Collections;

public class Functions 
{
	public static int[] swipeLeft(int[] arr)
	{
		// 0 Position
		ArrayList<Integer> al = new ArrayList<>();		
		int prevPosition = 0;
		int prevValue = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			int currentValue = arr[i];
			if(arr[i]==0)
				continue;
			else
			{
				if(prevValue == 0)
				{
					prevValue = arr[i];
				}
				else
				{
					if(arr[i] == prevValue )
					{
						prevValue = prevValue + arr[i];
						al.add(prevValue);
						prevValue = 0;
						prevPosition++;
					}
					else
					{
						al.add(prevValue);
						prevValue = arr[i];
						prevPosition++;
					}
				}
			}
			
		}
		al.add(prevValue);


		int[] resultArr = new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			if(i<al.size())
				resultArr[i] = al.get(i);
			else
				resultArr[i] = 0;
		}
		return resultArr;
	}

	public static int[] swipeRight(int[] arr)
	{
		// 0 Position
		ArrayList<Integer> al = new ArrayList<>();		
		int prevPosition = arr.length-1;
		int prevValue = arr[arr.length-1];
		
		for(int i=arr.length-1;i>=0;i--)
		{
			int currentValue = arr[i];
			if(arr[i]==0)
				continue;
			else
			{
				if(prevValue == 0)
				{
					prevValue = arr[i];
				}
				else
				{
					if(arr[i] == prevValue )
					{
						prevValue = prevValue + arr[i];
						al.add(prevValue);
						prevValue = 0;
						prevPosition++;
					}
					else
					{
						al.add(prevValue);
						prevValue = arr[i];
						prevPosition++;
					}
				}
			}
			
		}
		al.add(prevValue);
		Collections.reverse(al);
//
//		System.out.println("");
//		
//		for(int i=0;i<al.size();i++)
//		{
//			System.out.print(al.get(i));
//		}

		int[] resultArr = new int[arr.length];
		int countZero = arr.length - al.size();
		for(int i=0;i<arr.length;i++)
		{
			if(countZero>0)
			{
				resultArr[i] = 0;
				countZero--;
			}
			else
			{
				resultArr[i] = al.get(0);
				al.remove(0);
			}
		}
		return resultArr;
	}
}
