package com.dsa;
public class MergeSorting {

public void merge(int arr[], int left, int mid, int right) {
        
		//finding size of left and right arrays to be merged
		int n1=mid-left+1;
		
		int n2=right-mid;
		
		int leftArr[]=new int[n1];
		
		int rightArr[]=new int[n2];
		//Copy data to arrays
		for(int i=0;i<n1;i++)
			leftArr[i]=arr[left+i];
		for(int j=0;j<n2;j++)
			rightArr[j]=arr[mid+1+j];
		
         // merging arrays
		
		int i=0,j=0;
		
		int k=left;
		while(i<n1 && j <n2) {
			
	          if(leftArr[i]<rightArr[j]) {
	        	  
	        	  arr[k]=leftArr[i];
	               i++;
	          }   else {
	            	   
	              arr[k]=rightArr[j];
	               j++;
	          }
	          k++;
			
		}
		//copy the remaining elements
		while(i<n1)
		{
		  arr[k]=leftArr[i];
		    i++;
		    k++;
			
		}
		while(j<n2) {	
			
		      arr[k]=rightArr[j];
		       j++;
		       k++;
		}
		
		
		
	}

	public void sort(int arr[], int left, int right) {

		if (left < right) {

			int mid = (left + right) / 2;
			
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			
			merge(arr,left,mid,right);
		}

	}
	
	}
