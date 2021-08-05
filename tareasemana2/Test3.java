public class Test{
	
	public static void main(String[] args) {
		int i = 10, j = 12, k = 1;
		k += i++ - --j;
		System.out.println(k);
	}
}