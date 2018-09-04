import java.util.Scanner;

public class ClassOverloading {
    private TimeOfDay now;

    public static void main(String[] args) {
        ClassOverloading classOverloading = new ClassOverloading();
        classOverloading.init();
    }

    public void init () {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a time. (Separate the hour and minutes with a space)");
        now = setTimeOfDay(keyboard, now);

        if (now.getM_Minutes() == 10) {
            System.out.println(now.getM_Hour() + ":" + now.getM_Minutes());
        }
        if (now.getM_Minutes() > 10) {
            System.out.println(now.getM_Hour() + ":" + now.getM_Minutes());
        }
        if (now.getM_Minutes() < 10) {
            System.out.println(now.getM_Hour() + ":0" + now.getM_Minutes());
        }

    }
    public TimeOfDay setTimeOfDay(Scanner pKeyboard, TimeOfDay now) {
        boolean valid = false;
        while (!valid) {
            System.out.println("Enter the desired hour.");
            int pHour = pKeyboard.nextInt();
            System.out.println("Enter the desired minutes.");
            int pMinutes = pKeyboard.nextInt();
            if(validHours(pHour)&&validMinutes(pMinutes)) {
                now = new TimeOfDay(pHour,pMinutes);
                valid = true;
                return now;
            }
            else {
                System.out.println("You have entered invalid time:" + pHour + ":" + pMinutes +"\nPlease enter the " +
                        "desired time again.");
            }

        }
        return null;
    }

    private boolean validHours(int pHour) {
        if(pHour<24&&pHour>0) {
            return true;
        }
        else {
            return false;
        }
    }

    private boolean validMinutes(int pMinute) {
        if(pMinute<60&&pMinute>=0) {
            return true;
        }
        else {
            return false;
        }
    }








  /*  private boolean setHours(Scanner pKeyboard) {

    } */
}
