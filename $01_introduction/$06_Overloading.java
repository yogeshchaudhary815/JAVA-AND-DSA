package $01_introduction;

public class $06_Overloading {
    public static void main(String[] agrs){
       long minutes = 561600;
       printYearsAndDays(minutes);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes <= 0){
            System.out.println("invalid value of minute");
        } else {
            long hours = minutes/60;
            long days = hours/24;
            long years = days/365;
            days = days%365;
            System.out.println(minutes +" min" + " = "+ years +"y and "+ days + "d" );
        }
    }
    
}
