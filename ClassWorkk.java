import java.util.Arrays;

public class ClassWorkk {
    public static void main(String[] args) {
        int[] array ={2, 9, 5, 3, 1,6};

        for (int i = 0; i < array.length-1; i++) {
	 for (int j = i+1; j < array.length; j++) {
	if(array[i] > array[j]){
	array[i] = array[i] + array[j];
	array[j] = array[i] - array[j];
	array[i] = array[j] - array[i];
}
}
}System.out.print (array.toString(array));
}
}