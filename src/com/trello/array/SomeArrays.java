package com.trello.array;


import java.util.ArrayList;
import java.util.List;

public class SomeArrays {

	public static void main(String[] args) {
		int  k[]={1, 2, 3, 4, 1, 2, 3};
		printArray(k);
		findMin(k);
		findTuple(k, 5);
		bubbleSort(k);
		printArray(k);
		
		
		int l[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		printArray(l);
		findMin(l);
		findTuple(l, 12);
		bubbleSort(l);
		printArray(l);
		
		
		int m[]={11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1,0, -1, -2};
		printArray(m);
		findMin(m);
		bubbleSort(m);
		printArray(m);
		
		

	}
	 public static void bubbleSort(int [] A)
	  {
	     int tmp;

	    for(int i=0; i<A.length; i++)
	    {
	      for(int j=A.length-1 ; j>i;j--)  
	      {
	        if(A[j-1]>A[j]) 
	        {
	          tmp=A[j-1];
	          A[j-1]=A[j];
	          A[j]=tmp;
	        }
	        else if(A[j-1]==A[j]){continue;}
	        else continue;
	      }
	    
	    }
	  }

public static Integer findMin(int B[]) {
	int min=B[0];
	int index=0;
	for(int i=0;i<B.length-1;i++){
		
		if(B[i+1]<min){
			min=B[i+1];
			index=i+1;
		}
		else continue;
	}
	System.out.println("en küçük deger:"+min+"\tindexi:"+index);
	return 0;	}

public static void findTuple(int a[],int target){
	int index1,index2;
	for (int i=0;i<a.length;i++){
		for(int j=a.length-1;j>i;j--)
	{
			if(a[j-1]+a[j]==target){
				index1=a.length-(j)-1;
				index2=a.length-(j-1)-1;
				System.out.println("\nsayý 1:"+a[j-1]+"\tindexi:"+index1+"\nsayý 2:"+a[j]+"\tindex 2:"+index2);}
			else continue;
	}
	}
	
}
public static void printArray(int r[]){
	for(int i=0;i<r.length;i++){
		System.out.print(r[i]);
		if(i<r.length-1){System.out.print(",");}
	}
	System.out.print("\n");
}
}

