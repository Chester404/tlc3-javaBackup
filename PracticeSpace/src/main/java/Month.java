public class Month {

    public enum Months {
        January,February, March,April, May, June,
        July, August,September, October, November, December
    }

    public enum Days {
        monday, tuesday, wednesday, thursday,
        friday, saturday, sunday
    }

    public static void main(String []args){

        Months m = Months.April;
        Days output = Days.saturday;

        System.out.println("Month : "+ m);
        System.out.println("today is :"+ output);

        for(Months i: Months.values()){
            System.out.println(i + " ");
        }

        switch (output){
            case monday:
            case tuesday:
            case wednesday:
            case thursday:
            case friday:
                System.out.println("Weekday");
                break;

            case saturday:
            case sunday:
                System.out.println("weekend");
                break;
        }

        System.out.println(output.monday);
    }
}
