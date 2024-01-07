package in.sg.beans;

public class Car {
	
	
	public Car() {
		System.out.println("Car :: Constructor");
	}
	
	private IEngine eng;
	
	public void setEng(IEngine eng) {
		this.eng = eng;
		System.out.println("setEng() method called ....");
		System.out.println("Injected :: "+ eng.getClass().getName());
	}

	public void drive() {
		
		boolean status = eng.start();
		if(status) {
			System.out.println("Journey started...");
		} else {
			System.out.println("Engine fault...");
		}
	}

}
