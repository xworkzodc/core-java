package Perfume;

public enum EnumDb {
URL("jdbc:mysql://localhost:3306/perfume"),USERNAME("root"),PASSWORD("Arjunxwork");
	private String value;
	
	private EnumDb(String value) {
		this.value=value;
		
	}
   public String getvalue() {
	   return value;
   }
	
}

