import java.util.Random;
import java.util.ArrayList;

public class Person {
  
  private int month;
  private int day;

  Random rand = new Random();

  public Person(){
    generateBirthdays();
  }

  public void generateBirthdays(){
    month = rand.nextInt(12) + 1;

    if (month == 2){
      day = rand.nextInt(28) + 1;
    }
    else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
      day = rand.nextInt(31) + 1;
    }
    else {
      day = rand.nextInt(30) + 1;
    }
  }
}


