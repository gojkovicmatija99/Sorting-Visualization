package model;

import java.util.ArrayList;
import java.util.List;

public class MergeSort extends Algorithm {

	public MergeSort(List<Integer> nums) {
		super(nums);
	}

	@Override
	public void sort() {
		mergeSort(0,n-1);
	}

	private void mergeSort(int low, int high) {
		if(low>=high)
			return;
		
		int mid=low+(high-low)/2;
		mergeSort(low,mid);
		mergeSort(mid+1,high);
		merge(low,mid,high);
	}

	private void merge(int low, int mid, int high) {
		int lowStart=low;
		int lowEnd=mid;
		int highStart=mid+1;
		int highEnd=high;
		List<Integer> numsTemp=new ArrayList<Integer>();
		
		while(lowStart<=lowEnd && highStart<=highEnd) {
			if(nums.get(lowStart)<nums.get(highStart)) {
				numsTemp.add(nums.get(lowStart));
				lowStart++;
			}
			else {
				numsTemp.add(nums.get(highStart));
				highStart++;
			}
			updateView(sub, -1, lowStart, highStart);
		}
		
		while(lowStart<=lowEnd) {
			numsTemp.add(nums.get(lowStart));
			lowStart++;
			updateView(sub, -1, lowStart, highStart);
		}
		
		while(highStart<=highEnd) {
			numsTemp.add(nums.get(highStart));
			highStart++;
			updateView(sub, -1, lowStart, highStart);
		}
		
		int nTemp=nums.size();
		for(int i=low;i<=high;i++) {
			nums.set(i, numsTemp.get(i-low));
			updateView(sub, i, -1,-1);
		}
			
	}

}
