
public class Card {

	private String color;
	private String value;
	 
	

	//getters and setters for private attributes
	public String getColor() {
		return color;
	}
	
	public String getValue() {
		return value;
	}
	public Card (String color, String value){
		this.color = color;
		this.value = value;
	}
	public String toString () {
		return this.color + "-" + this.value;
		
	}
	
			
	}
