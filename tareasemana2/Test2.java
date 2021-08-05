public class Test{
	
	public static void main(String[] args) {
		boolean b1 = true, b2 = false, b3 = true;
		System.out.println( b1&&b2&&!b3 );
	}
}

// tener en cuenta la tabla de condiciones para && false

//{\displaystyle {\begin{array}{|c|c|c|}\hline A&B&A\land B\\\hline V&V&V\\V&F&F\\F&V&F\\F&F&F\\\hline \end{array}}}
//{\displaystyle {\begin{array}{|c|c|c|}\hline A&B&A\lor B\\\hline V&V&V\\V&F&V\\F&V&V\\F&F&F\\\hline \end{array}}}