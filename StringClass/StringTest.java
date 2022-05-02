package StringClass;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("abc".concat("def"));
		System.out.println("substring".substring(3,9));
		
		String color="red, blue, white";
		String[] arr=color.split(",");
		String string = new String();
		
		System.out.println("      trim() test:    ".trim());
		System.out.println("toLowerCase() test : ".toLowerCase());
		System.out.println("toUpperCase() test;".toUpperCase());
		
		System.out.println("abcdefghijk".indexOf("def"));
		System.out.println("abcdefghijk1".lastIndexOf("a"));
		
		System.out.println("on Air".contains("on"));
		
		System.out.println("abcdefg".compareTo("abcdefg"));
		System.out.println("abcdefg".compareTo("abcdefgh"));
		System.out.println("abcdefgh".compareTo("abcdefg"));
		System.out.println("abc".equals("abc"));

	}

}
