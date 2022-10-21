package com.greatlearning.currencydenomination;
import java.util.Arrays;
public class SortingClass {
	//sorting Method
	    int [] sort (int array[]) {
		
	    	if (array.length==1)				//if array has only one value
		    		return array;
		
		int sortarray[] = new int [array.length];
		int midVal =array.length/2;       	   //find middle element
		
		int leftArray [] = new int [array.length/2];
		int rightArray[] = new int [array.length -leftArray.length];
		
			 leftArray= Arrays.copyOfRange(array, 0, midVal);
			 leftArray = sort(leftArray);
		
		     rightArray = Arrays.copyOfRange(array, midVal, array.length);
			 rightArray = sort (rightArray);
		 
		// rightArray =sort (rightArray);
		 return merge (leftArray, rightArray);
	}	

	public int[] merge (int leftArray[], int rightArray[]) 
	{
		int i=0;
		int j=0;
		int k=0;
		int resultArray[] = new int[leftArray.length + rightArray.length];
		while (i<leftArray.length && j<rightArray.length) {
			if(leftArray[i]>=rightArray[j]) {
			resultArray[k] = leftArray[i];
			i++;
		}
		else {
			resultArray[k]=rightArray[j];
			j++;
			}
		k++;
		}
		while(i< leftArray.length)
		{
			resultArray[k] =leftArray[i];
			i++;
			k++;
		}
		while(j<rightArray.length)
		{
			resultArray[k] =rightArray[j];
			j++;
			k++;
						
		}
	return resultArray;
	}
}

