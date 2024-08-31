package questions;

public class IntToStringWithoutParseInt {
    public static void main(String[] args) {

        String sample = "1234";

        int number =0;

        for(int i=0; i < sample.length() ;i++){

            number = 10 * number + sample.charAt(i) - '0';

        }

        System.out.println("Converted number: "+number);

    }
}
