
public class FooCorporation {

	public static void main (String[] args) {
		Employee E1 = new Employee ("John", 7.5, 38);
		Employee E2 = new Employee ("Anabell", 8.2, 42);
		Employee E3 = new Employee ("Graham", 10.5, 41);
		
		System.out.println(E1.salary());
		System.out.println(E2.salary());
		System.out.println(E3.salary());
		
		Manager M1 =new Manager("Arnau", 15.5, 39, "A332");
		Manager M2 =new Manager("Jordi", 18.2, 40, "A415");
		
		System.out.println(M1.salary());
		System.out.println(M2.salary());
		
	}
}
