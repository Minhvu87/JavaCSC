package Chapter7;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private List<Observer> observers = new ArrayList<>();
	private double state;
	public double getState() {
		return state;
	}
	public void setState(double state) {
		this.state = state;
		notifyAllObservers();
	}
	public void attach(Observer observer) {
		observers.add(observer);
	}
	public void notifyAllObservers() {
		for(Observer observer : observers) {
			observer.update();
		}
		
	}
	
}
