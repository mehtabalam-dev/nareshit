package stringPracticePrograms;

public class FirstNonRepeatedCharacter
{
	public static void main(String[] args) 
	{
		String str = "swiss";
		boolean found = false;
		for(int i = 0; i <= str.length()-1; i++)
		{
			char ch = str.charAt(i);
			int count = 0;
			for(int j = 0; j <= str.length()-1; j++)
			{
				if(str.charAt(j)==ch)
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println("First non repeated character "+ch);
				found = true;
				break;
			}
		}
		if(found == false)
		{
			System.out.println("No repeated character");
		}
		
		
//		String str = "abcabcbb";
//		String res = "";
//		String largeRes = "";
//		for(int i=0; i<str.length(); i++) {
//			if(!res.contains(str.charAt(i) + "")) {
//				res += str.charAt(i);
//				if(res.length() >= largeRes.length()) {
//					largeRes = res;
//				}
//			}else {
//				res = "";
//			}
//		}
//		System.out.println(largeRes);
		
		
		
	}
}
