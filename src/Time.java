import javax.swing.*;
import java.util.ArrayList;

public class Time {
    private int hour;
    private int second;
    private int minute;
//
    private ArrayList<Integer> myTime;


    public Time() {
        //This is a constructor
        //A constructor will never have a return
        //It is a method. Has same name as class, but doesn't have return type.
        myTime = new ArrayList<Integer>();

        this(12,0,0);




        setHour(12);
        minute =  0;
        second = 0;
    }
    //Default Constructor
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        System.out.println("OIK");
    }
    //Argument Constructor
    public Time(Time object) {
        this(object.hour, object.minute, object.second);



        this.hour = object.hour;
        this.minute = object.minute;
        this.second = object.second;
    } //Copy Constructor

    public void setHour(int hour) {
        if (hour > 0 && hour <= 12 ) {
            this.hour = hour;
        } else {
            this.hour = 12;
        }
    }

    public void setSecond(int second) {

        this.second = second;

    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }

}
