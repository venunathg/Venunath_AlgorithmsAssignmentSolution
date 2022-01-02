package com.gl.algorithmassignment.service;

public class LinearSearch {
	
	public int search(double value,double[] arr) {
		
			for(int i=0; i<arr.length;i++)
			{
				if(arr[i] == value)
				return i;
			}
			return -1;

		}
}