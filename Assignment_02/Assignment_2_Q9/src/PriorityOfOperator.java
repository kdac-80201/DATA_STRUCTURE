import java.util.Scanner;

public class PriorityOfOperator {
	static Scanner sc = new Scanner(System.in);
	
	static int prio(char opr) {
		switch (opr) {
		case '+': return 10;
		case '-': return 10;
		case '*': return 20;
		case '/': return 20;
		case '%': return 20;
		}
		return 0;
	}
	
	static int menu() {
		int choice;
		System.out.println("|----------------------------------|");
		System.out.println("Check respective operators priority ");
		System.out.println("0. EXIT");
		System.out.println("1. + ");
		System.out.println("2. - ");
		System.out.println("3. * ");
		System.out.println("4. / ");
		System.out.println("5. % ");
		System.out.println("Enter your choice ");
		choice = sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		int choice;
		while((choice = menu())!=0) {
			switch (choice) {
			case 1:
				System.out.println("Priority is "+prio('+'));
				break;
			case 2:
				System.out.println("Priority is "+prio('-'));
				break;
			case 3:
				System.out.println("Priority is "+prio('*'));
			break;
			case 4:
				System.out.println("Priority is "+prio('/'));
				break;
			case 5:
				System.out.println("Priority is "+prio('%'));
			break;
			
			default:
				System.out.println("Invalid Entry ");
				break;
			}
			
		}
	}

}
