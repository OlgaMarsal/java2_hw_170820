package enums;

public class TestEnums {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.Monday;
        DayOfWeek dayOfWeek2 = DayOfWeek.Tuesday;
        System.out.println(dayOfWeek == dayOfWeek2);
        System.out.println(dayOfWeek.ordinal());

        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
            System.out.println(day.getHours());
            
        }

        System.out.println(DayOfWeek.Monday.compareTo(DayOfWeek.Saturday));
    }

}
