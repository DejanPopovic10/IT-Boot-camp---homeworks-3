package rs.itbootcamp.gen4.nedelja9;

public class Zadacici {
	public static String removeChar(String text, char c) {
		return text.replace(String.valueOf(c), "");
	}
	
	public static String flipWords(String text) {
		String buffer = "";
		for(String word: text.split(" ")) {
			for(int i=word.length()-1; i>=0; i--)
				buffer += word.charAt(i);
			buffer += " ";
		}
		return buffer;
	}
	
	// bolje vratiti listu duplikata, ili ceo niz
	public static String findDuplicates(String text) {
		int[] duplicates = new int[26];
		
		text = text.toLowerCase();
		
		for(int i=0; i<text.length(); i++) {
			int ind = text.charAt(i) - 'a';
			if(ind >= 0 && ind < 26)
				duplicates[ind]++;
		}
			
		String buffer = "";
		for(int i=0; i<duplicates.length; i++) {
			if(duplicates[i] > 1)
				buffer += String.format("%c:%d ", i + 'a', duplicates[i]);
		}
		return buffer;
	}
	
	public static boolean isPalindrome(String text) {
		for(int i=0; i<text.length(); i++)
			if(text.charAt(i) != text.charAt(text.length()-1-i))
				return false;
		return true;
	}
	
	public static int isRotation(String str1, String str2) {
		// sigurno nije rotacija ako nemaju iste duzine
		if(str1.length() != str2.length())
			return -1;
		
		// ispitujemo za razlicite offsete
		for(int offset=0; offset<str1.length(); offset++) {
			int i = 0;
			while(i<str1.length() && str2.charAt(i) == str1.charAt((i + offset) % str1.length()))
				i++;
			if(i == str1.length())
				return offset;
		}
		return -1;
	}
	
	public static String caesar(String text, int offset) {
		String buffer = "";
		for(int i=0; i<text.length(); i++) {
			if(text.charAt(i) >= 'a' && text.charAt(i) <= 'z')
				buffer += String.valueOf((char)('a' + ((text.charAt(i) - 'a' + offset) % 26)));
			else
				buffer += text.charAt(i);
		}
		return buffer;
	}
	
	
	public static void main(String[] args) {
		String zad1 = "Ala je lep ovaj svet";
		System.out.printf("%s, %c => %s\n", zad1, 'e', removeChar(zad1,'e'));
		System.out.println("--------------------------------------------");
	
		String zad2 = "danas je divan dan";
		System.out.printf("%s => %s\n", zad2, flipWords(zad2));
		System.out.println("--------------------------------------------");
		
		String[] zad3 = {"meraklija", "programiranje"};
		for(String str: zad3)
			System.out.printf("%s => %s\n", str, findDuplicates(str));
		System.out.println("--------------------------------------------");
		
		String[][] zad4 = {{"programiranje", "gramiranjepro"}, {"jabuka", "kruska"}, {"tastatura", "turatasta"}};
		for(String[] str: zad4) {
			System.out.printf("%s/%s => %b, %d\n", str[0], str[1], isRotation(str[0],str[1]) >= 0, isRotation(str[0],str[1]));
		}
		System.out.println("--------------------------------------------");
		
		String[] zad5 = {"anavolimilovana", "danasjelepdan"};
		for(String str: zad5)
			System.out.printf("%s => %b\n", str, isPalindrome(str));
		System.out.println("--------------------------------------------");
	
		String zad6 = "danas je lep dan";
		System.out.printf("%s, %d => %s\n", zad6, 13, caesar(zad6,13));
		System.out.printf("%s, %d => %s\n", zad6, 9, caesar(zad6,9));
	}

}
