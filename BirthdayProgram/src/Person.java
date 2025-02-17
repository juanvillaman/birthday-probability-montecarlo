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

  public int getMonth(){
    return month;
  }

  public int getDay(){
    return day;
  }

  public static boolean containsSharedBirthday(int personCount){
    ArrayList<String> birthdays = new ArrayList<String>();

    for(int i = 0; i < personCount; i++){
      Person person = new Person();
      String birthday = person.getMonth() + "/" + person.getDay();

      if (birthdays.contains(birthday)){
        return true;
      }

      birthdays.add(birthday);
    }
    return false;
  }

  public double calculateBirthdayProbability(int personCount, int simulationAmount){
    int count = 0;

    for (int i = 0; i < simulationAmount; i++){
      if(containsSharedBirthday(personCount)){
        count++;
      }
    }
    
    return (double) count / simulationAmount * 100;
  }
  
}
