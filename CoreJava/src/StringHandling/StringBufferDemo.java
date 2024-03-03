package StringHandling;
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Ajay");
	    System.out.print(sb.capacity());
		System.out.println(sb.append("java"));

		System.out.println(sb.delete(2, 5));
	}
    
}