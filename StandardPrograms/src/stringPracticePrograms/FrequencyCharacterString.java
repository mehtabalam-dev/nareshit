package stringPracticePrograms;

public class FrequencyCharacterString 
{
	public static void main(String[] args) 
	{
		String str = "programming";
		String result = "";
		for(int i = 0; i <= str.length()-1; i++)
		{
			if(!result.contains(str.charAt(i)+""))
			{
				int count = 0;
				for(int j = 0; j <= str.length()-1; j++)
				{
					if(str.charAt(i)==str.charAt(j))
					{
						count++;
					}
				}
				System.out.println(str.charAt(i)+" = "+count);
				result = result + str.charAt(i);
			}
		}
	}
}
