
import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

  public static void main (String args[]) {
    System.out.println(prettyInteger(6));

  }

  public static int calculateSquare(int input){
    return input * input;
  }

  public static double calculateSquareRoot(int input){
    return Math.sqrt(input);
  }

  public static String toLowerCase(String inputString){
    return inputString.toLowerCase();
  }

  public static boolean isMultiple(int first, int second) {
    return first % second == 0;
  }

  public static String prettyInteger (int input){
    String asterixString = "";
    for (int i = 0; i < input ; i++) {
      asterixString += "*";
    }
    return asterixString + " " + input + " " + asterixString;
  }

  public static int random(int start, int end){
    Random random = new Random();
    return random.nextInt(end - start + 1) + start;
  }



}
