package com.basics;

import java.util.*;

public class AlternatingCharacters {
	static int numOfDeletes(String str){
    	int deletes =0;
    	int prevIndex=0;
    	int nextIndex=1;
    	for(int i=0; i<str.length()&&nextIndex<str.length();i++){
    		if(str.charAt(prevIndex)==str.charAt(nextIndex)){
    			deletes++;
    			nextIndex++;
    		}
    		else {
    			nextIndex++;
    			if(nextIndex<str.length()&&str.charAt(prevIndex)!=str.charAt(nextIndex)){
    				deletes++;
    			}
    			else{
    				prevIndex=nextIndex-1;
    			}
    		}
    	}
    	return deletes;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int lines = in.nextInt();
		String[] ipStrings = new String[lines];
		for (int i = 0; i < lines; i++)
			ipStrings[i] = in.next();
		in.close();
		for (int i = 0; i < lines; i++)
			System.out.println(numOfDeletes(ipStrings[i]));
	}

}
