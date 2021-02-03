import java.util.ArrayList;
public class Time2 {
    private ArrayList<Integer> myTime;

    public Time2(Time2 t) {
        myTime = new ArrayList<Integer>();
        setTime(t.myTime.get(0), t.myTime.get(1), t.myTime.get(2));

    }

    public void setTime(int hour, int minute, int second) {
        myTime.add(hour);
        myTime.add(minute);
        myTime.add(second);
    }
    public String toString() {
        return myTime.toString();
    }
}
