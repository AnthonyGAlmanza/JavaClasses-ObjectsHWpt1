package objectsJavaHW;

public class Main {

	public static void main(String[] args) {
		
		Guitar newGuitar = new Guitar();
		newGuitar.brand = "Gibson";
		newGuitar.type = "electric";
		newGuitar.color = "black";
		newGuitar.numberOfStrings = 6;
		
		System.out.println(newGuitar.hasInputForAmp());
		
		Guitar anotherGuitar = new Guitar("Taylor", "acoustic", "rosewood", 12);
		
		System.out.println(anotherGuitar.hasInputForAmp());
		
		System.out.println(anotherGuitar.toString());
		
		

	}

}
