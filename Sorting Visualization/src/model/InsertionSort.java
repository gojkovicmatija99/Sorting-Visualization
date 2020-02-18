package model;

import java.util.Collections;
import java.util.List;

public class InsertionSort extends Algorithm {

	public InsertionSort(List<Integer> nums) {
		super(nums);
	}

	@Override
	public void sort() {
		for(int i=1;i<n;i++) {
			int key=nums.get(i);
			int j=i-1;
			updateView(sub, j+1, i, -1);
			
			while(j>=0 && nums.get(j)>key)
			{
				Collections.swap(nums, j, j+1);
				j--;
				updateView(sub, j+1, i, -1);
			}
		}
	}

}
