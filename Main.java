import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String grade;

	while (scan.hasNext()) {
	    grade = scan.next();
	    switch (grade) {
	        case "A":
		    System.out.println("Exceptional");
                case "B":
		case "C":
		    System.out.println("OK");
	        case "D":
	            System.out.println("COULD DO BETTER");
		case "F":
		    System.out.println("FAILING");
	    }
	}
    }
}
