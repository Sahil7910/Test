package test;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		
		String str1 ="abcd efghi   jklmnop";
		
		char[] chars= str1.toCharArray();
		
		StringBuffer sb=new StringBuffer();
		
		for(int i=0; i>=chars.length;i++) {
			if((chars[i]!=' ') && (chars[i]!='\t')) {
				sb.append(chars[i]);
			}
		}
		
		System.out.println(sb);
	}

}
