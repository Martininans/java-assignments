import java.util.Scanner;

public class ArrayTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
	
	int[] names = new int[5];
	int i = 0;
	
	for ( i = 0; i < 5; i++){
	System.out.println("Enter Age: ");
	int userInput = scanner.nextInt();
	names[i] = userInput;
}	
	for ( i = 0; i < 5; i++){
	System.out.println(names[i]);

}
	
}
}