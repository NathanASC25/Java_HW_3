import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class InOut {
    public static void main(String[] args) throws Exception {
	File inputFile = new File("./TextFiles/inputs.txt");
	File sumFile = new File("./TextFiles/sum.txt");
	PrintWriter inputWrite = new PrintWriter(inputFile);
	PrintWriter sumWrite = new PrintWriter(sumFile);
	Scanner takeNums = new Scanner(System.in);
	for (int i = 0; i < 2; i++) {
	    System.out.println("Enter an integer value: ");
	    int num = takeNums.nextInt();
	    inputWrite.println(num);
	}
	takeNums.close();
	inputWrite.close();
	Scanner readNums = new Scanner(inputFile);
	int total = 0;
	while (readNums.hasNext()) {
	    total += readNums.nextInt();
	}
	sumWrite.printf("Sum: %d", total);
	readNums.close();
	sumWrite.close();
    }
}
