package KMC;

public class StringDuplicateRemoval {	
	public static void main(String[] args) {
		String str="have you been a java dev you have a dev java";
		String[] str1=str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			System.out.print(str1[i]+" ");
		}
		String str2=str1.toString();
		System.out.println(str2);
		
	}
	
	
	
}
