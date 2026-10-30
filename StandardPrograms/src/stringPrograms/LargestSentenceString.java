package stringPrograms;

import java.util.Scanner;

public class LargestSentenceString 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s = sc.nextLine();
		String [] a = s.split(" ");
		int maxLength = 0;
		for(String e : a)
		{
			if(e.length()>maxLength)
			{
				maxLength = e.length();
			}
		}
		for(String e : a)
		{
			if(e.length()==maxLength)
			{
				System.out.println(e);
			}
		}

	}
}


/*
 

package stringPrograms;

import java.util.Scanner;

public class LargestSentenceString
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String : ");

        String s = sc.nextLine();

        String[] a = s.split(" ");

        int maxLength = 0;
        String largest = "";

        for(String e : a)
        {
            if(e.length() > maxLength)
            {
                maxLength = e.length();
                largest = e;
            }
        }

        System.out.println("Largest Word : " + largest);
        System.out.println("Max Length of sentence : " + maxLength);
    }
}

 */