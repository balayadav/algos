package com.basics;

import java.util.*;

public class LoveLetterMystery {
    static int noOfOperations(String str){
    	int res=0; int n= str.length();
    	int l1,l2;
    	for(int i=0; i<n/2;i++){
    		l1=(int)str.charAt(i);
    		l2=(int)str.charAt(n-i-1);
    		if(l2>l1) res = res+ (l2-l1);
    		else if (l1>l2) res = res + (l1-l2);
    	}
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int lines = in.nextInt();
		String[] seq = new String[lines];
		for (int i = 0; i < lines; i++)
			seq[i] = in.next();
		in.close();
		for (int i = 0; i < lines; i++)
        System.out.println(noOfOperations(seq[i]));
	}

}
