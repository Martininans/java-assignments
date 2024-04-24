import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
	
	String[] names = new String[5];
	int i = 0;
	
	for ( i = 0; i <= 5; i++){
	System.out.println("Enter name: ");
	String userInput = scanner.nextLine();
	names[i] = userInput;
		
	for ( i = 0; i <= 5; i++){
	System.out.println(names[i]);
}
}
	
}
}