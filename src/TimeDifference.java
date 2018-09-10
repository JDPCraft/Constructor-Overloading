public class TimeDifference {
    //initializes three variables: uhour, uhourfinal, and uminutefinal, which are used when calculating the difference
    // between the two times that the user inputted.
    public static int uhour;
   // public static int uminute;
    public static int uhourfinal;
    public static int uminutefinal;

//    TimeDifference timeDifference = new TimeDifference(int now,int then){
//initializes four parameters which are also used in calculating the difference of the two times that the user inputted.
    public static int TestTimeDifference(int firsthour, int firstminute, int secondhour, int secondminute){
        //the following two lines convert the hour value of both times to minutes.
       firsthour = firsthour * 60 + firstminute;
       secondhour = secondhour * 60 + secondminute;
       //if the value of the now converted to minutes secondhour is greater than firsthour, then this if statement
        // calculates the difference between the times, dividing by 60 to get the hour value of the difference, and
        // then the same value is then modulused by 60 to get the minute value of the difference.
       if (secondhour > firsthour) {
        uhour = secondhour - firsthour;
        uhourfinal = uhour / 60;
        uminutefinal = uhour % 60;
       }
        //if the value of the now converted to minutes firsthour is greater than secondhour, then this if statement
        // calculates the difference between the times, dividing by 60 to get the hour value of the difference, and
        // then the same value is then modulused by 60 to get the minute value of the difference.
        if (firsthour > secondhour) {
            uhour = firsthour - secondhour;
            uhourfinal = uhour / 60;
            uminutefinal = uhour % 60;
        }
        //prints out the difference between the two time values inputted by the user.
       System.out.println("Difference: " + uhourfinal +" hours" + " " + uminutefinal +" minutes");
       // System.out.println("testing print from timedifference " + firsthour + " " + firstminute + " " + secondhour + " " + secondminute);




    return firsthour;
    //System.out.println(now);
    }




}
