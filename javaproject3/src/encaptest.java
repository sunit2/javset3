class setcap {
	private int age;
	private String name;
	
	public String getname () {
		return name;
	}
	
	public int getage () {
		return age;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void setage (int age) {
		this.age = age;
	}
}
public class encaptest {

	public static void main(String[] args) {
		setcap setcap1 = new setcap ();
		setcap1.setname ("Anil");
		setcap1.setage(20);
		System.out.println("Name is " +  setcap1.getname() + " & age is " + setcap1.getage());

	}

}
