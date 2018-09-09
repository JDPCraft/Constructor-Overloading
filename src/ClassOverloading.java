import java.util.Scanner;

public class ClassOverloading {
    public TimeOfDay now;
    public TimeOfDay then;
    public int testv;

    public static void main(String[] args) {
        ClassOverloading classOverloading = new ClassOverloading();
        classOverloading.init();
    }



    public void init () {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a time. (Separate the hour and minutes with a space)");
        now = setTimeOfDay(keyboard, now);
        then = setTimeOfDay(keyboard, then);

        if (now.getM_Minutes() == 10) {
        System.out.println("First time entered: " + now.getM_Hour() + ":" + now.getM_Minutes());
    }
        if (now.getM_Minutes() > 10) {
        System.out.println("First time entered: " + now.getM_Hour() + ":" + now.getM_Minutes());
    }
        if (now.getM_Minutes() < 10) {
        System.out.println("First time entered: " + now.getM_Hour() + ":0" + now.getM_Minutes());
    }
        if (then.getM_Minutes() == 10) {
        System.out.println("Second time entered: " + then.getM_Hour() + ":" + then.getM_Minutes());
    }
        if (then.getM_Minutes() > 10) {
        System.out.println("Second time entered: " + then.getM_Hour() + ":" + then.getM_Minutes());
    }
        if (then.getM_Minutes() < 10) {
        System.out.println("Second time entered: " + then.getM_Hour() + ":0" + then.getM_Minutes());
    }

        TimeDifference.TestTimeDifference(now.getM_Hour(),now.getM_Minutes(),then.getM_Hour(),then.getM_Minutes() );

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
                then = new TimeOfDay(pHour,pMinutes);
                valid = true;
                System.out.println();
                return now;
                //return then;
            }
            else {
                System.out.println("You have entered invalid time:" + pHour + ":" + pMinutes +"\nPlease enter the " +
                        "desired time again.");
            }

        }
        return null;
    }

   /* private TimeOfDay compareTime(int pHour,int pMinute) {
        int finalHour;
        if(then.getM_Hour()>now.getM_Hour()) {
           // then.getM_Hour()-now.getM_Hour() = finalHour;
           then.getM_Hour()*60+then.getM_Minutes() =
        }

    } */


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
