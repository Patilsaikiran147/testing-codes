package package1;

public class CountVwlsNdCnsnts 
{

	public static void main(String[] args)
	{
		String str="naga tulasi devi guduri";
		int Vcount=0;
		int Ccount=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				Vcount++;
				
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				Ccount++;
			}
			
					
		}
		System.out.println("The no. of vowels in given string is = "+Vcount);
		System.out.println("The no. of consonants in given string is = "+Ccount);

	}

}
