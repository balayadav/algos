package com.basics;
import java.util.*;
public class MaximiseXOR {
   static int maximiseXOR(int l, int r){
	   int res=0; int temp;
	   for(int i=l;i<=r;i++){
		   for(int j=l;j<=i;j++){
             temp = i ^ j;
             if(temp>res) res=temp;
		   }
	   }
	   return res;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        in.close();
        System.out.println(maximiseXOR(l,r));
	}

}
