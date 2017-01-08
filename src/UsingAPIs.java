import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class UsingAPIs {

    public static void main(String[] args) {
      Set<String> novelSet = new HashSet<>();

      // An abstract representation of a File
      File file = new File("/Users/jordansmith/Desktop/accesscode/unit-1-bootcamp/src/tale_of_two_cities.txt");

      try {
        Scanner sc = new Scanner(file);
        while(sc.hasNext()){
          String newString = sc.next();
          if(!novelSet.contains(newString)){
            novelSet.add(newString);
          }
        }
        System.out.println(novelSet);

      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }
    }
  }