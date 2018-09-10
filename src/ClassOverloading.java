//comments are added throughout code in order to help explain the code and how it works so I know what to be saying in
// the screencast video.
import java.util.Scanner;

public class ClassOverloading {
    //initializes now and then, and assigns then as instances of the class TimeOfDay.
    public TimeOfDay now;
    public TimeOfDay then;
    public int testv;

    public static void main(String[] args) {
        //creates an instance of the classoverloading class, and calls the init method in classoverloading
        ClassOverloading classOverloading = new ClassOverloading();
        classOverloading.init();
    }



    public void init () {
        //initializes the keyboard as a new scanner, allowing for input from the user.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a time. (Separate the hour and minutes with a space) (Military time is used instead " +
                "of the normal 12-hour am/pm time.)");
        //runs the setTimeOfDay method for now and then afterwords run the exact same setTimeOfDay method for then.
        now = setTimeOfDay(keyboard, now);
        then = setTimeOfDay(keyboard, then);
//the following 6 if statements are what actually print out the times that the user inputted.
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
//this line calls the TimeDifference class which takes the two times the user inputted and then calculates their
// difference then prints out the difference to the user.
        TimeDifference.TestTimeDifference(now.getM_Hour(),now.getM_Minutes(),then.getM_Hour(),then.getM_Minutes() );

         }

//Method that takes input from the user and then saves the inputs as a variable, then runs the validHours and
// validMinutes methods to check if the times entered were valid.
    public TimeOfDay setTimeOfDay(Scanner pKeyboard, TimeOfDay now) {
        //initializes valid with a default value of false.
        boolean valid = false;
        //while valid is not true, run the code inside while (!valid).
        while (!valid) {
            System.out.println("Enter the desired hour.");
            int pHour = pKeyboard.nextInt();
            System.out.println("Enter the desired minutes.");
            int pMinutes = pKeyboard.nextInt();
            //if times entered are valid, set valid to true to prevent the code sending the user back to the part of
            // code where it asks for the user's input, and assigns the values of now and then to the values entered by
            // the user.
            if(validHours(pHour)&&validMinutes(pMinutes)) {
                now = new TimeOfDay(pHour,pMinutes);
                then = new TimeOfDay(pHour,pMinutes);
                valid = true;
                System.out.println();
                return now;
                //return then;
            }
            //the else statement of the if statement will loop the user back to System.out.println("Enter the desired
            // hour."); if they enter a value for hour of minutes that is not valid.
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

//checks for if the hour value inputted is valid.
    private boolean validHours(int pHour) {
        if(pHour<24&&pHour>0) {
            return true;
        }
        else {
            return false;
        }
    }
//checks for if the minutes value inputted is valid.
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
