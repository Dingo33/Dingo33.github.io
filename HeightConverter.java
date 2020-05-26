//I worked on the homework assignment alone, using only course materials. (because I'm a strong independent coder... not because I don't know anyone in class)
//Daniel Ingo 5/20/20


public class HeightConverter {
    public static void main(String[] args) {
        double inchHeight = 86.0;
        char shirtSize = 's';

       int feetHeight = (int)inchHeight / 12;
       int inchRemainder = (int) inchHeight % 12;

        double centimeterHeight = inchHeight * (127.0/50);

        System.out.println(inchHeight+" inches is "+feetHeight+" feet, "+inchRemainder+" inches. It's also "+centimeterHeight+" centimeters.");
        System.out.println("The user has a size "+((char)(shirtSize - 32) ));
    }
}
