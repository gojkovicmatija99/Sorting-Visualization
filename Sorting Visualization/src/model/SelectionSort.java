package model;

import java.util.Collections;
import java.util.List;

public class SelectionSort extends Algorithm {

	public SelectionSort(List<Integer> nums) {
		super(nums);
	}

	@Override
	public void sort() {
		for(int i=0;i<n-1;i++) {
			int min=nums.get(i);
			int minInd=i;
			for(int j=i+1;j<n;j++) {
				if(min>nums.get(j)) {
					min=nums.get(j);
					minInd=j;
				}
				updateView(sub, j, minInd,-1);
			}			
			Collections.swap(nums, minInd, i);
		}
	}

}
