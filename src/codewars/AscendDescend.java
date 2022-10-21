package codewars;

public class AscendDescend {

    private int length;
    private int minimum;
    private int maximum;

    public static String ascendDescend(int length, int minimum, int maximum) {
        length();
        try {
            while (length > 0) {
                if (maximum < minimum || length == 0) {
                    System.out.println(" ");
                } else {

                }
            }
        }
        catch (IllegalArgumentException ex) {
            if (length < 0) {
                System.out.println("Value cannot be negative");
            }
        }
        return "";
    }

    public int length() {
        return length;
    }

    public int minimum() {
        return minimum;
    }

    public int maximum() {
        return maximum;
    }
}




//        Starts at minimum
//        Ascends one at a time until reaching the maximum, then
//        Descends one at a time until reaching the minimum
//        repeat until the string is the appropriate length
//        Examples:
//
//        length: 5, minimum: 1, maximum: 3   ==>  "12321"
//        length: 14, minimum: 0, maximum: 2  ==>  "01210121012101"
//        length: 11, minimum: 5, maximum: 9  ==>  "56789876567"
//        Notes:
//
//        length will always be non-negative
//        negative numbers can appear for minimum and maximum values
//        hyphens/dashes ("-") for negative numbers do count towards the length
//        the resulting string must be truncated to the exact length provided
//        return an empty string if maximum < minimum or length == 0
//        minimum and maximum can equal one another and result in a single number repeated for the length of the string