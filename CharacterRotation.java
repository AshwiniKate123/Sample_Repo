public class StringPatternCircle {
	public static void main(String[] args) 
	{
		String str="LOVE";
	char[] charArr=str.toCharArray();
	for(int i=0;i<=charArr.length-1;i++)
	{
		int index=i;
		for(int j=0;j<=charArr.length-1;j++)
		{
			System.out.print(charArr[index]);
			index++;
			index=index%4;
		}
		System.out.println();
		
			}	
	}
}