package com.techment.WCCount;

public class WCcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello welcome to india";
		int word = 1;
		int character = 1;
		 
		for(int i=0;i<str.length()-1;i++) {
			char ch = str.charAt(i);
			
			if(str.charAt(i)==' ') {
				word++;
			}
			else if(str.charAt(i)!=' ') {
				character++;
			}
		}
		System.out.println("Total word:"+word);
		System.out.println("Total character:"+character);
	}

}
