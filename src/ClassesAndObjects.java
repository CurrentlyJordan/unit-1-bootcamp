/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

  public static void main(String args[]) {
    Cat garfield = new Cat();
    Cat pinkPanther = new Cat();
    Cat catWoman = new Cat();

    garfield.setFavoriteFood("Lasagna");
    pinkPanther.setFavoriteFood("croissant");
    catWoman.setFavoriteFood("ham");

    garfield.setAge(10);
    pinkPanther.setAge(20);
    catWoman.setAge(15);


  }

  public static Cat isOlder(Cat cat1, Cat cat2) {
    if (cat1.getAge() > cat2.getAge()) {
      return cat1;
    } else {
      return cat2;
    }
  }

  public static Cat makeKitten(Cat cat1, Cat cat2){
    Cat kitten = new Cat(cat1.getName() + cat2.getName());
    kitten.setAge(0);
    return kitten;
  }

  public static void makeBestFriends(Cat cat1, Cat cat2){
    cat1.setFavoriteFood("pizza");
    cat2.setFavoriteFood("Pizza");
  }

  public static void adoption(Cat cat, Person person){
    cat.setOwner(person);
  }


}
