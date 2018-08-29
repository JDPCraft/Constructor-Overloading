public class TimeOfDay {

    private int m_Hour;
    private int m_Minutes;

    public TimeOfDay() {
        this( 0, 0);
    }

    public TimeOfDay(int p_Hour) {
        this(p_Hour, 0);
    }

    public TimeOfDay(int p_Hour, int p_Minutes) {
        if (p_Hour > 23) {
            p_Hour = 23;
        }
        if (p_Minutes > 59) {
            p_Minutes = 59;
        }
        if (p_Hour < 0) {
            p_Hour = 0;
        }
        if (p_Minutes < 0) {
            p_Minutes = 0;
        }

        this.m_Hour = p_Hour;
        this.m_Minutes = p_Minutes;
    }

    public int getM_Hour() {
        return m_Hour;
    }

    public int getM_Minutes() {
        return m_Minutes;
    }
}
