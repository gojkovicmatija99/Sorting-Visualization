package model;

import java.util.Collections;
import java.util.List;

import view.MainFrame;

public class QuickSort extends Algorithm {

	public QuickSort(List<Integer> nums) {
		super(nums);
	}

	@Override
	public void sort() {
		quickSort(0,n-1);
	}
	
	private void quickSort(int low,int high) {
		if(low>=high)
			return;
		
		int pivot=partition(low,high);
		quickSort(low,pivot);
		quickSort(pivot+1,high);
	}
	
	private int partition(int low,int high) {
		int pivot=low;
		for(int i=low+1;i<=high;i++) {
			if(nums.get(i)<nums.get(low))
				Collections.swap(nums, ++pivot, i);
			updateView(sub,i,low,pivot);
		}
		Collections.swap(nums, pivot, low);
		updateView(sub,-1,pivot,-1);
		
		return pivot;
	}

}
