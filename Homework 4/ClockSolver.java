import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
public class ClockSolver {
    public static void main( String[] args ) {
      Scanner reader = new Scanner(System.in);
      System.out.println("Enter an angle: ");
      double userangle = reader.nextDouble();
      if (userangle < 0 || userangle > 180){
        System.out.println("Enter a valid angle");
      }
      reader = new Scanner(System.in);
      System.out.println("Enter a time split (enter 0 if you don't have a time split): ");
      double timeSplit = reader.nextDouble();
      if (timeSplit == 0){
        System.out.println("Setting time split to 60 seconds.");
        timeSplit = 60;
      }
      if (timeSplit < 0 || timeSplit > 1800){
        System.out.println("Enter a valid time split");
      }
      double time = 0;
      Clock a = new Clock(0,0,0);
      System.out.println("The clock's hands are at " + userangle + " degrees at these times:" );
      while (time <= 43200){
        if ( (a.getangle(a.gethoursAngle(), a.getminutesAngle()) > (userangle - a.getdelta(timeSplit)) ) && (a.getangle(a.gethoursAngle(), a.getminutesAngle()) < (userangle + a.getdelta(timeSplit)))){
          System.out.println((a.hours) + ":" + (a.minutes) + ":" + (a.seconds));
          a.tick(timeSplit);
          time = time + timeSplit;
        }
        if (userangle < 0 || userangle > 180 || timeSplit < 0 || timeSplit > 1800){
          System.out.println("Either the angle or time split or both is incorrect.");
          break;
        }
        else{
          a.tick(timeSplit);
          time = time + timeSplit;
        }
      }
    }
  }
