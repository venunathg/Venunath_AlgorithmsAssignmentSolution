package com.gl.algorithmassignment.service;


public class MergeSort {
	
	
	public void sort(double[] arr, int left, int right,int flag)
	{
		if(left < right) {
		int mid = (left+right)/2;
		sort(arr,left,mid,flag);
		sort(arr,mid+1,right,flag);
		
		merge(arr,left,mid,right,flag);
		}
	}
	
	
	public void merge(double[] arr, int left, int mid,int right,int flag)
	{
		int len1 = mid-left +1;
		int len2 = right-mid;
		
		double[] leftarr = new double[len1];
		double[] rightarr = new double[len2];
		for(int i =0;i< len1 ; i++)
		{
			leftarr[i] = arr[left+i];
		}
		for(int j =0;j< len2 ; j++)
		{
			rightarr[j] = arr[mid+1+j];
		}
		
		int i,j,k;
		i = 0;
		j = 0;
		k = left;
		
		while (i <len1 && j <len2)
		{
			if((leftarr[i]<rightarr[j] && flag == 1) || (leftarr[i]>=rightarr[j] && flag == 2))
			{
				arr[k] = leftarr[i];
						i++;
			}
			else
			{
				arr[k] = rightarr[j];
						j++;
			}
			k++;
		}
		while(i <len1)
		{
			arr[k] = leftarr[i];
			i++;
			k++;
		}
		while(j <len2)
		{
			arr[k] = rightarr[j];
			j++;
			k++;
		}
	}
}
