package Lession7;

import java.util.ArrayList;
import java.util.List;

public class PetManager<T> {
	private List<T> pets;
	
	public void setPets(List<T> pets) {
		this.pets = pets;
	}
	public List<T> getPets(){
		if(pets == null) {
			pets = new ArrayList<>();
		}
		return this.pets;
	}

}
