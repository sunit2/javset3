

public class exception1 {

	public static void main(String[] args) {
		try {
			int a[] = new int [3];
		    a[2] = 50;
			System.out.println("Number is " + a[2]);
			System.out.println("Number is " + a[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception thrown " + e);
		} 
		System.out.println("out of block");

	}

}
