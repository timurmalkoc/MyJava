package Day_23Encapsulation_Inheritance;

public class MainClass {
	public static void main(String[] args) {
	encmpsolation encp = new encmpsolation();
	System.out.println("Account value = " + encp.getAccount());
	System.out.println("Initial value = " + encp.getInitial());
	System.out.println("Male status = " + encp.isMale());
//-------------------- SETTERS -------------------------
	encp.setAccount(250);
	encp.setInitial('B');
	encp.setMale(false);
	
	System.out.println("Account value = " + encp.getAccount());
	System.out.println("Initial value = " + encp.getInitial());
	System.out.println("Male status = " + encp.isMale());	
	
	}
}
