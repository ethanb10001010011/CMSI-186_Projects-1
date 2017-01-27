public class CountTheDays extends CalendarStuff{
  public static void main(String[] args){
   if (args.length != 6){
     System.out.println("Enter 6 numbers.");
     System.exit(1);
   }
   long a = Long.parseLong(args[0]);
   long b = Long.parseLong(args[1]);
   long c = Long.parseLong(args[2]);
   long d = Long.parseLong(args[3]);
   long e = Long.parseLong(args[4]);
   long f = Long.parseLong(args[5]);
   if (isValidDate(a, b, c) != true || isValidDate(d, e, f) != true){
     System.out.println("At least one of the dates entered is invalid");
     System.exit(1);
   }
   else {
     System.out.println("Between those two dates, there are " + daysBetween(a, b, c, d, e, f) + " days.");
   }
 }
}
