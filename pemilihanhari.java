import java.util.Scanner;

public class pemilihanhari{

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String dayName, dayType;
    System.out.print("Input day name: ");
    dayName = sc.nextLine();
    switch (dayName.toLowerCase()) {
    case "monday":
    case "tuesday":
    case "wenesday":
    case "thursday":
    case "friday":
        dayType = "weekday";
        break;
    case "saturday":
        dayType = "weekend";
        break;
    default:
        dayType = "invalid day name";
    System.out.println(dayName + "is a" + dayType);

    }




    }


}