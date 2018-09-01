
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
