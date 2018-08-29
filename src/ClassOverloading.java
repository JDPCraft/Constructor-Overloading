import java.util.Scanner;

public class ClassOverloading {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a time. (Separate the hour and minutes with a space)");
        TimeOfDay now=new TimeOfDay(keyboard.nextInt(),keyboard.nextInt());

        if(now.getM_Minutes() == 10) {
            System.out.println(now.getM_Hour() + ":" + now.getM_Minutes());
        }
        if(now.getM_Minutes() > 10) {
            System.out.println(now.getM_Hour() + ":" + now.getM_Minutes());
        }
        if(now.getM_Minutes() < 10) {
            System.out.println(now.getM_Hour() + ":0" + now.getM_Minutes());
        }
    }

}
