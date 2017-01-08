

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

  public static void main(String args[]) {
    sumOneThroughN(1000);
    printNStrings(-3,"hello");
    fibonacciSumN(4);

  }

  public static void printNumbers() {
    int count = 1;
    while (count <= 10) {
      System.out.println(count);
      count++;
    }
  }

  public static void printNumbers2() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
  }

  public static void printN(int n) {
    for (int i = 0; i <= n; i++) {
      System.out.println(i);

    }
  }

  public static void printEvenNumbersThroughN(int n) {
    for (int i = 2; i <= n; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }

    }
  }

  public static void sumOneThroughTen() {
    int count = 0;
    for (int i = 1; i <= 10; i++) {
      count += i;
    }
    System.out.println(count);
  }

  public static void sumOneThroughN(int n) {
    int count = 0;
    for (int i = 1; i <= n; i++) {
      count += i;
    }
    System.out.println(count);
  }

  public static void printNStrings(int n, String s) {
    if (n < 0) {
      System.out.println("");
    } else {
      for (int i = 0; i < n; i++) {
        System.out.println(s);
      }

    }
  }

  public static void printNStringsSameLine(int n, String s) {
    if (n < 0) {
      System.out.println("");
    } else {
      for (int i = 0; i < n; i++) {
        System.out.print(s);
      }

    }
  }

  public static void fibonacci(){
    int fibNumber1 = 1;
    int fibNumber2 = 1;
    for (int i = 0; i < 10 ; i++) {
      if( i < 2){
        System.out.println(fibNumber1);
      }
      else {
        int newNumb = fibNumber1 + fibNumber2;
        System.out.println(newNumb);
        fibNumber1 = fibNumber2;
        fibNumber2 = newNumb;
      }
    }
  }

  public static void fibonacciSum(){
    int fibNumber1 = 1;
    int fibNumber2 = 1;
    int fibCount = 0;
    for (int i = 0; i < 10 ; i++) {
      if( i < 2){
        fibCount += fibNumber1;
      }
      else {
        int newNumb = fibNumber1 + fibNumber2;
        fibCount += newNumb;
        fibNumber1 = fibNumber2;
        fibNumber2 = newNumb;
      }
    }
    System.out.println(fibCount);
  }

  public static void fibonacciSumN(int n){
    int fibNumber1 = 1;
    int fibNumber2 = 1;
    int fibCount = 0;
    for (int i = 0; i < n ; i++) {
      if( i < 2){
        fibCount += fibNumber1;
      }
      else {
        int newNumb = fibNumber1 + fibNumber2;
        fibCount += newNumb;
        fibNumber1 = fibNumber2;
        fibNumber2 = newNumb;
      }
    }
    System.out.println(fibCount);
  }




}


