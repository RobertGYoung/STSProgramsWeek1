
public class AutoBoxing {

	public static void main(String[] args) {
		int i = 10;
		
		Integer i2 = i;
		
		System.out.println("Integer Value: "+i2);
		
		Integer j = new Integer(500);
		
		int j2 = j;
		
		System.out.println("Int value is: " + j2);
		System.out.println(j.SIZE+" bytes or "+(j.SIZE)*8+" bits");
		//the benefit of this is type conversion
	}
}
