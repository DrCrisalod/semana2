public class Test{
	
	public static void main(String[] args) {
		byte b1 = 2;
		//b1 = b1 + 10;
		// aqui hay un error la forma correcta
		b1 +=  + 10;
		byte b2 = 2;
		b2 += 10;
		
		System.out.println(b1 + " " + b2);
	}
}