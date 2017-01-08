
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

  public static void main(String args[]) {
    List<Cat> catsList = new ArrayList<>();

    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    Cat cat3 = new Cat();
    Cat cat4 = new Cat();
    Cat cat5 = new Cat();

    List<Integer> intList = new ArrayList<>();
    intList.add(1);
    intList.add(2);
    intList.add(4);
    intList.add(92);
    intList.add(92);
    intList.add(92);
    intList.add(3);
    intList.add(3);
    intList.add(3);
    intList.add(3);
    intList.add(3);

    mostFrequentElement(intList);

    Map<String,Integer> accessCode = new HashMap<>();
    accessCode.put("Jordan", 12);
    accessCode.put("Mila", 12);
    accessCode.put("Jose", 223);

    printAccessCode(accessCode);
    System.out.println(canRentCar(accessCode));



  }

  public static void printCats(List<Cat> catList) {
    for (int i = 0; i < catList.size(); i++) {
      System.out.println(catList.get(i));
    }
  }

  public static void mostFrequentElement(List<Integer> inputList) {
    Map<Integer, Integer> intMap = new HashMap<>();
    Integer mostFrequent = null;
    Integer occurrence = 0;
    for (Integer number : inputList) {
      if (intMap.containsKey(number)) {
        intMap.put(number, intMap.get(number) + 1);
      } else {
        intMap.put(number, 1);
      }
    }
    for (Integer key : intMap.keySet()) {
      if (intMap.get(key) > occurrence) {
        mostFrequent = key;
        occurrence = intMap.get(key);
      }
    }
    System.out.println(mostFrequent + " is the most common element with " + occurrence + " occurrences");
  }

  public static void printAccessCode(Map<String,Integer> inputMap){
    for (String key: inputMap.keySet()){
      System.out.println(key);
      System.out.println(inputMap.get(key));
    }

  }

  public static boolean canRentCar(Map<String,Integer> inputMap){
    boolean isAnyoneOver25 = false;
    for (String key: inputMap.keySet()){
      if(inputMap.get(key) > 25){
        isAnyoneOver25 = true;
      }
    }
    return isAnyoneOver25;
  }




}
