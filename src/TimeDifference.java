public class TimeDifference {
    public static int uhour;
   // public static int uminute;
    public static int uhourfinal;
    public static int uminutefinal;

//    TimeDifference timeDifference = new TimeDifference(int now,int then){

    public static int TestTimeDifference(int firsthour, int firstminute, int secondhour, int secondminute){
       firsthour = firsthour * 60 + firstminute;
       secondhour = secondhour * 60 + secondminute;
       //add code for determining differece here and then print out difference to screen.
       if (secondhour > firsthour) {
        uhour = secondhour - firsthour;
        uhourfinal = uhour / 60;
        uminutefinal = uhour % 60;
       }
        if (firsthour > secondhour) {
            uhour = firsthour - secondhour;
            uhourfinal = uhour / 60;
            uminutefinal = uhour % 60;
        }
       System.out.println("Difference: " + uhourfinal +" hours" + " " + uminutefinal +" minutes");
       // System.out.println("testing print from timedifference " + firsthour + " " + firstminute + " " + secondhour + " " + secondminute);




    return firsthour;
    //System.out.println(now);
    }




}
