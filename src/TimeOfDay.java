public class TimeOfDay {
//creates two variables that can only be accessed by the TimeOfDay class: m_Hour and m_Minutes.
    private int m_Hour;
    private int m_Minutes;
//initializes the two variables m_Hour and m_Minutes with a default value before they get used in the actual code.
    public TimeOfDay() {
        this(0, 0);
    }

    public TimeOfDay(int p_Hour) {
        this(p_Hour, 0);
    }
//failsafe that crashes the program if the user happens to get past the else 'loop' for entering an invalid value for
// hour or minutes to prevent the code from getting messed up.
    public TimeOfDay(int p_Hour, int p_Minutes) {
        if (p_Hour > 23 || p_Hour < 0 || p_Minutes > 59 || p_Minutes < 0) {
            throw new IllegalArgumentException(
                    "Input given was not valid in terms of real world time: Hour: " + p_Hour + " Minutes: " + p_Minutes);
        }
//        if () {
//            p_Minutes = 59;
//        }
//        if () {
//            p_Hour = 0;
//        }
//        if () {
//            p_Minutes = 0;
//        }

            this.m_Hour = p_Hour;
            this.m_Minutes = p_Minutes;
        }

        public int getM_Hour () {
            return m_Hour;
        }

        public int getM_Minutes () {
            return m_Minutes;
        }
//failsafe that crashes the program if the user happens to get past the else 'loop' for entering an invalid hour value
// to prevent the code from getting messed up.
    public void setM_Hour(int p_Hour) {
        if(p_Hour > 23 || p_Hour < 0)
        throw new IllegalArgumentException("Input given is invalid. Hour given: " + p_Hour);
            else {
                    this.m_Hour = p_Hour;
        }

    }
//failsafe that crashes the program if the user happens to get past the else 'loop' for entering an invalid minutes
// value to prevent the code from getting messed up.
    public void setM_Minutes(int p_Minutes) {
        if(p_Minutes > 59 || p_Minutes < 0)
            throw new IllegalArgumentException("Input given is invalid. Minutes given: " + p_Minutes);
        else {
            this.m_Minutes = p_Minutes;
        }

    }

}
