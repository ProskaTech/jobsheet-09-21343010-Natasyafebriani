/*
 Created By 21343010-Natasya febriani
 */
package jobsheet9;

public class TestPastByValue {
    public static void main(String[] args) {
    int i = 10;
    System.out.println (i);
    
    test(i);
    System.out.println (i);
}

public static void test(int j) {
  j = 33;
  
  }
}