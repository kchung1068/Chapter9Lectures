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
        myTime.add(12);
        myTime.add(0);
        myTime.add(0);




//        setHour(12);
//        minute =  0;
//        second = 0;
    }
    //Default Constructor
    public Time(int hour, int minute, int second){
//        this.hour = hour;
//        this.minute = minute;
//        this.second = second;
//        myTime.add(hour);
//        myTime.add(2,second);
//        myTime.add(1,minute);
        myTime = new ArrayList<Integer>();
        setMyTime(hour,minute,second);
//        System.out.println("OIK");
    }
    //Argument Constructor
    public Time(Time object) {
        this(object.hour, object.minute, object.second);



        this.hour = object.hour;
        this.minute = object.minute;
        this.second = object.second;
    } //Copy Constructor

    public void setMyTime(int hour, int minute, int second) {
        myTime.add(hour);
        myTime.add(2,second);
        myTime.add(1,minute);
    }

//    public void setHour(int hour) {
//        if (hour > 0 && hour <= 12 ) {
//            this.hour = hour;
//        } else {
//            this.hour = 12;
//        }
//    }
//
//    public void setSecond(int second) {
//            if(second > 0 && second < 60) {
//                this.second = second;
//            } else {
//                this.second = 0;
//            }
//
//    }
//
//    public void setMinute(int minute) {
//        if (minute > 0 && minute < 60) {
//            this.minute = minute;
//        } else {
//            minute = 0;
//        }
//    }
    public int getHour() {
//       // return hour;
        return myTime.get(0);
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }
    public String toString() {
        int hour = myTime.get(0);
        int minute = myTime.get(1);
        int second = myTime.get(2);
       return myTime.toString();
       // return hour + ":" + minute + ":" + second;
    }

}
