package package1;

public class DuplicateArray {

	public static void main(String[] args) {
		
		int a[]= {2,3,5,8,9,9,9,8,};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) {
					System.out.println("The duplicates in array " +a[j]);
				}
			}
		}
        
	}

}
