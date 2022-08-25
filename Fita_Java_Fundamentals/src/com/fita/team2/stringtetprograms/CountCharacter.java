package com.fita.team2.stringtetprograms;

import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String:");
		String name =in.nextLine();
		char[] ch=name.toCharArray();
		int n=ch.length;//loganathan
//	   
//	    for(int i=0;i<n;i++) {
//	    	int count=0;
//	    	for(int j=0;j<n;j++) {
//	    		
//	    		if(ch[i]==ch[j]) {
//	    			count++;
//	    		}
//	    		
//	    	}
////	    	if((count>1) && ch[i] )
////	    	 System.out.println("The count of "+ ch[i] +" is: "+ count);
//	    
//	    }
		
		for(char c= 'a';c<='z';c++) {
			int count = 0;
			for(int i =0;i<n;i++) {
				if(name.charAt(i) == c) {
					count++;
				}
			}
			if(count>=1) {
				System.out.println(c + "-->" + count);
			}
		}
		
		
	   

	}

}
