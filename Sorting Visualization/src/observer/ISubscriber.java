package observer;

public interface ISubscriber {
	public void update(int red, int blue,int green);
	public void setControls(boolean val);
}
