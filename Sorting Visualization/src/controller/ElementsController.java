package controller;

import java.util.List;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import view.MainFrame;

public class ElementsController implements ChangeListener {

	@Override
	public void stateChanged(ChangeEvent arg0) {
		int elements=MainFrame.getInstance().getJsElements();
		MainFrame.getInstance().setElements(elements);
		List<Integer> nums=MainFrame.getInstance().generateList();
		MainFrame.getInstance().setNums(nums);
		MainFrame.getInstance().getRect().setNums(nums);
	}

}
