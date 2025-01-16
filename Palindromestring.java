import java.util.*;
public class Palindromestring {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		Boolean ans = true;
		for(int i=0;i<n/2;i++)
		{
			if(s.charAt(i) != s.charAt(n-1-i))
			{
				ans = false;
			}
		}
		if(ans)
		{
			System.out.print("Yes, the given string palindrome");
		}
		else
		{
			System.out.print("No, the given string not an palindrome");
		}
	}

}
