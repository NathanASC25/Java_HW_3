public class Ok {
    public static void main(String[] args) {
	int sum = 0;
	for (int i = 0; i < 8; i++) {
	    for (int j = i; j < 8; j++) {
		sum++;
	    }
	}
	// Result: 36
	System.out.println(sum);
    }
}
