// You are given a string of characters and you are required to reduce it to replace all occurences of two or more consequtive "e"s with a single e.


public class yelpInterviewQuestion {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s;
		s = in.nextLine();
		String newstring = "";
		char c;
		if (s.length() <= 0)
			return;
		c = s.charAt(0);
		for (int i = 1; i < s.length(); i++)
		{
			if (c == s.charAt(i))
				continue;
			newstring += c;
		}
		System.out.println(newstring);
	}

}
