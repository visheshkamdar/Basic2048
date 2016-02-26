
public class Call {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4,2,2,4};
		int[] resultArr = Functions.swipeLeft(arr);
		for(int i=0; i<resultArr.length; i++)
		{
			System.out.print(resultArr[i]);
		}
		System.out.println("");
		resultArr = Functions.swipeLeft(resultArr);
		for(int i=0; i<resultArr.length; i++)
		{
			System.out.print(resultArr[i]);
		}
		System.out.println("");

		resultArr = Functions.swipeRight(resultArr);
		for(int i=0; i<resultArr.length; i++)
		{
			System.out.print(resultArr[i]);
		}
	}

}
