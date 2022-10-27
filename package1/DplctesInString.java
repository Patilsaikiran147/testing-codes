package package1;

public class DplctesInString 
{

	public static void main(String[] args) 
	{
		String str="haiiii";
		char ch='i';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(ch+" is repeated "+count+" times");
	}

}
