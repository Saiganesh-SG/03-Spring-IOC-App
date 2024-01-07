package in.sg.beans;

public class DieselEng implements IEngine {
	
	public DieselEng() {
		System.out.println("DieselEng :: Constructor");
	}

	public boolean start() {
		System.out.println("Diesel Engine starting ......");
		return true;
	}
	
	
}
