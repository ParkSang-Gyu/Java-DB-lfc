package day18;

public class Enum {
	
	public static void main (String []args){
		for (Kind k : Kind.values()){
			System.out.println(k.name()+" = "+k.getValue());
		}
		
	}
}
enum Kind{
	SPACE(1),CLOVER(2),HEART(3),DIA(4);
	private final int value;
	Kind (int value) {this.value=value;}
	public int getValue(){return value;}
}
