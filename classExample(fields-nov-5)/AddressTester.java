public class AddressTester{
	public static void main(String[] values){
		System.out.println("JVM invoked Main");
		short door=Address.doorNo;
		System.out.println("door "+door);
		System.out.println("city "+Address.city);
		System.out.println("pin code "+Address.pinCode);
		System.out.println("EXIT:: Main");
	}
}
