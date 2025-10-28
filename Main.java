public class Main {
    public static void main(String[] args) {
        int sum = 0;
	for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                sum++;
	    }
	}
	System.out.println(sum);
    }
    // Result: 15
}
