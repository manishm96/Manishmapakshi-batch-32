package com.cistech.batch32.week3.src;

public class CustomException {

	public static void main(String[] args) throws MyException {
		
		int i = 1;
		
		try {
			if(i == 0)
			{
				System.out.println(i);
			}else {
				throw new MyException("This is not a zero!");
			}
		}catch(Exception err){
			err.printStackTrace();
		}

	}

}
