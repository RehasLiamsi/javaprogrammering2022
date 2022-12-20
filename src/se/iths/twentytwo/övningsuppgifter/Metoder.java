package se.iths.twentytwo.övningsuppgifter;

public class Metoder {

    public static void main(String[] args)
    {
        System.out.println("Question 2a: " + add(1.4,2.5));
        System.out.println("Question 2b: " + multi(2.5,2,5));
        System.out.println("Question 2c: " + unlimitedParameters(2,5,4,6,7));
        System.out.print("Question 3: "); quesThree("Timmy","New York", (byte) 3);
        System.out.print("Question 4 with wrong format: "); quesFour("Tim");
        System.out.print("Question 4 with correct format: "); quesFour("4");
        System.out.println("Question 5: " + quesFive("Wow"));
        System.out.println("Question 6: " + daysInMonth(Month.MARCH));
    }

    //Question 2a
    public static double add(double a, double b){
        return a + b;
    }

    //Question 2b
    public static double multi(double a, double b, double c){
        return a*b*c;
    }

    //Question 2c
    public static double unlimitedParameters(int... a){
        int temp = 1;
        for (int i = 0; i < a.length; i++) {
            temp *= a[i];
        }
        return temp;
    }

    public static void quesThree(String name, String city, byte favoriteNumber) {
        System.out.println("Välkommen " + name + " från " + city + " med favorittal " + favoriteNumber);
    }

    public static void quesFour(String number){
        try {
            System.out.println(Integer.parseInt(number));
        } catch (NumberFormatException e) {
            System.out.println("Fel format!");
        }
    }

    public static String quesFive(String input) {
        return "<p>" + input + "</p>";
    }

    //quesSix
    enum Month {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public static int daysInMonth(Month month) {
        return switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
            case FEBRUARY -> 28;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
        };
    }
}
