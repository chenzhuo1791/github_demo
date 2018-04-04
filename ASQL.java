package com.cyou.FApirl;

public class ASQL {

	/**
	 * 7D0414_real_	  7D0414_base_
	 */
	public static void main(String[] args) {
		
		String suffix = "8F04" ; //
		String line = "";
		String begin = suffix;
		String middle = "_base_	 " + suffix;
		String end = "_real_";
		String number = "" ;
		for(int i = 1 ; i <= 30 ; i++){
			if (i < 10) {
				number = "0" + i ;
			}else {
				number = "" + i ;
			}
			line = "\t" + begin + number + middle + number + end ;
			if (i%10 == 1) {
				System.out.println();
			}
			System.out.println(line);
		}
	}

}
