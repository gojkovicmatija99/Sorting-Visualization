package model;

import java.util.List;

import observer.IPublisher;
import observer.ISubscriber;
import view.MainFrame;

public abstract class Algorithm extends Thread implements IPublisher {
	protected List<Integer> numbers;
	protected int numSize;
	protected ISubscriber sub;
	
	public Algorithm(List<Integer> nums) {
		this.numbers = nums;
		this.numSize=nums.size();
	}

	@Override
	public void run() {
		sub.setControls(false);		
		sort();		
		sub.setControls(true);
	}
	
	public abstract void sort();
	
	@Override
	public void addSubscriber(ISubscriber sub) {
		this.sub=sub;
	}
	
	@Override
	public void updateView(ISubscriber sub,int red,int blue,int green) {
		sub.update(red,blue,green);
	}
}
