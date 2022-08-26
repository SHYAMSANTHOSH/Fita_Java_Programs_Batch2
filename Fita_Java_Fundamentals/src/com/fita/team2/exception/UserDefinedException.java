package com.fita.team2.exception;

public class UserDefinedException extends Exception{
	
	private static int rollno[] = {1, 13, 29, 34,8};
	 
    private static String name[] =
                 {"Shyam", "Kumar", "Barani", "Mani", "Peter"};
    
    private static double fees[] =
        {560.0, 299.00, 110.55,1000.00, 1200.00};
       
    UserDefinedException(String  value){
    	super(value);
    }
	
	public static void main(String[] args) {
		System.out.println("Roll No" + "\t" + "Name" + "\t" + "Exam Fees");
		try {
			
			for(int i=0;i<rollno.length;i++) {
				System.out.println(rollno[i] + "\t" + name[i] + "\t" + fees[i]);
				if(fees[i] >= 1000.0) {
					UserDefinedException user = new UserDefinedException("Fees With Arrear Amount");
					throw user;
				}
			}
			
		}catch(UserDefinedException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
