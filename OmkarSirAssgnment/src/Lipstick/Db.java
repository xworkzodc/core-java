package Lipstick;

public enum Db {
URL("jdbc:mysql://localhost:3306/lipstick"),USERNAME("root"),PASSWORD("Arjunxwork");

private String value;
	
	private Db(String value) {
	this.value=value;	
	}
			
	public String getValue() {
		return value;
	}
	
}
