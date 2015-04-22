package com.basics;

public class QuickSort {

private int partition(int[] A, int p, int r){
	int x = A[r-1];
	int temp;
	int i =p-1;
	for(int j=p;j<r-1;j++){
		if(A[j]<=x){
			i=i+1;
			temp=A[i];
			A[i]=A[j];
			A[j]= temp;
		}
	}
	temp=A[i+1];
	A[i+1]=A[r-1];
	A[r-1]=temp;
	return i+1;
}
protected void quickSort(int[] A, int start, int end){
	int q;
	if(start<end){
		q=partition(A, start, end);
		quickSort(A, start, q);
		quickSort(A, q+1, end);
	}
}
}
