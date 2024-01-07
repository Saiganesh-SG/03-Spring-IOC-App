package in.sg.beans;

public class PetrolEng implements IEngine {
	
	public PetrolEng() {
		System.out.println("PetrolEng :: Constructor");
	}


	@Override
	public boolean start() {
		System.out.println("Petrol Engine starting ......");
		return true;
	}

}
