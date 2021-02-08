package objectsJavaHW;

public class Guitar {
	
	public String brand;
	public String type;
	public String color;
	public int numberOfStrings;
	
	
	public Guitar(){}
	
	public Guitar(String brand, String type) {
		this.brand = brand;
		this.type = type;
	}
	
	public Guitar(String brand, String type, String color) {
		this.brand = brand;
		this.type = type;
		this.color = color;
	}
	
	public Guitar(String brand, String type, String color, int numberOfStrings) {
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.numberOfStrings = numberOfStrings;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getType() {
		return type;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getNumberOfStrings() {
		return numberOfStrings;
	}
	
	public void setBrand() {
		this.brand = brand;
	}
	
	public void setType() {
		this.type = type;
	}
	
	public void setColor() {
		this.color = color;
	}
	
	public void setNumberOfStrings() {
		this.numberOfStrings = numberOfStrings;
	}

	public boolean hasInputForAmp() {
		if(this.getType() == "Electric" || this.getType() == "electric") {
			return true;
		} else {
			return false;
		}
	}
	
	
	public String toString() {
		return String.format("This guitar's brand is %s. It is %s and the color is %s",
				this.getBrand(),
				this.getType(),
				this.getColor());
	}
	
	
}
