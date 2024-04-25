// Exercise 4.25: Mystery2.java
2 public class Mystery2 {
3 public static void main(String[] args) {
4 int count = 1;
5
6 while (count <= 20) {
7 System.out.println(count % 3 == 1 ? "########" : "++++++++");
8 ++count;
9 } // end while
10 } // end main
11 } // end class Mystery2