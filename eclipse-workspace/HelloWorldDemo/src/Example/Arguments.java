package Example;

public class Arguments {

	public static void main(String[] args) {
		Arguments arg  = new Arguments();
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
				
		switch (args[2]) {
		case "+": int add = a+b;
			   System.out.println(add);
			   break;
		case "*": int mul = a*b;
			   System.out.println(mul);
			   break;
		case "-": int sub = a-b;
			   System.out.println(sub);
			   break;
		case "/": int div = a/b;
		       System.out.println(div);
		       break;
		case "%": int mod = a%b;
			System.out.println(mod);
				 break;
		default :
		 System.out.println("invalid operater");
		}
		
	}
}
