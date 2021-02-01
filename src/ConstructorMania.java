public class ConstructorMania {
    public static void main(String[] args) {
        Time breakfast = new Time(); //Default Constructor 
        Time ryanslunch = new Time(10,30,0); //Argument Constructor
   Time olegsLunch = new Time(ryanslunch); //Copy Constructor
//
    Time brunch = new Time();
    Time liner = new Time(4,30,0);
        System.out.println(brunch);

    }


}
