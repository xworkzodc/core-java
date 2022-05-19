class Nestedforprintnumber4{
	public static void main(String[] args) {
    int k=5;
		for(int i=1; i<=5; i++){
            for (int j=5; j>=i; j--) {
            	System.out.print(" ");
             // System.out.println();
              //System.out.print(k+i);
            	}
            	System.out.println(i);
            //	System.out.print();
            }
	}
}
/*1
  12
  123
  1234
  12345*/