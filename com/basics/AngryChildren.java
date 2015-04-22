package com.basics;

import java.util.*;

public class AngryChildren {
    static int distributePackets(int[] values,int k){
    	int diff,max=0,min=0;
    	int len=values.length;
    	diff=Integer.MAX_VALUE;
    	QuickSort q = new QuickSort();
    	q.quickSort(values, 0, len);
    	for(int i=0;i<len-k;i++){
    		min=values[i];
    		max=values[i+k-1];
    		if(diff>max-min) diff=max-min;
    	}
    	return diff;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] values = new int[n];
        for(int i=0; i<n;i++) values[i] = in.nextInt();
        in.close();
        System.out.println(distributePackets(values,k));
	}

}
