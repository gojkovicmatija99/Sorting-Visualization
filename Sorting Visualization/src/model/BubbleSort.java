package model;

import java.util.Collections;
import java.util.List;

import view.MainFrame;

public class BubbleSort extends Algorithm {

	public BubbleSort(List<Integer> nums) {
		super(nums);
	}

	@Override
	public void sort(){	
		for(int i=0;i<n;i++) {
			Boolean isSwapped=false;
			for(int j=0;j<n-i-1;j++) {
				if(nums.get(j)>nums.get(j+1)) {
					Collections.swap(nums, j, j+1);
					isSwapped=true;
				}	
				updateView(sub,j,j+1,-1);
			}
			if(!isSwapped)
				break;
		}
	}

}
