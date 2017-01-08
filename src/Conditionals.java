
/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

  public static void main(String args[]) {

  }

  public static boolean isOdd(int input) {
    return input % 2 == 0;
  }

  public static boolean isMultipleOfThree(int input) {
    return input % 3 == 0;
  }

  public static boolean isOddAndIsMultipleOfThree(int input) {
    return input % 3 == 0 && input % 2 == 0;
  }

  public static boolean isOddAndIsMultipleOfThree2(int input) {
    return isMultipleOfThree(input) && isOdd(input);
  }

  public static void fizzMultipleofThree(int input) {
    if (isMultipleOfThree(input)) {
      System.out.println("Fizz");
    } else {
      System.out.println(input);
    }
  }

  public static boolean isPersonFromLondon(Person person) {
    return person.getCity().equals("London");
  }

  public static void printLongNames(Person person) {
    if (person.getName().length() > 5) {
      System.out.println(person.getName());
    } else {
      System.out.println("name is too short");
    }

  }
}