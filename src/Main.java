import java.util.Scanner;
import java.util.Dictionary;
import java.util.Hashtable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        // initialising 3 integer variables
//        int num1,num2,num3;
//
//        // creating object s which is an instance of scanner
//        Scanner s = new Scanner(System.in);
//
//        // getting user input for the first number and assigning it to num1
//        System.out.println("Enter number 1?");
//        num1 = s.nextInt();
//
//        // getting user input for the first number and assigning it to num2
//        System.out.println("Enter number 2?");
//        num2 = s.nextInt();
//
//        //System.out.println(Math.max(num1,num2); alternative method for printing maximum
//
//        // initialising integer variable result
//        int result;
//
//
//        // if statement to compare num1 and num2 and prints which is larger also prints a message if both numbers are the same
//        if (num1>num2){
//            result = num1;
//            System.out.println("Number 1 was larger: "+result);
//        }
//        else if (num1 == num2){
//            System.out.println("Error both number are the same size: "+num2);
//        }
//        else{
//            result=num2;
//            System.out.println("Number 2 was larger: "+result);
//        }
//
//
//        // takes another input from the user and assigns to num3
//        System.out.println("Enter a number please?");
//        num3 = s.nextInt();
//
//
//        // if statement to see if number is odd or even and prints the result
//        if (num3%2==0){
//            System.out.println("Number is even");
//        }
//       else {
//            System.out.println("Number is odd");
//       }
//
//
//        // creating a dictionary and declaring the types of data to be stored
//       Dictionary<String, String> dict= new Hashtable<>();
//       //add values to dictionary
//        dict.put("Red", "Red means stop");
//        dict.put("Orange", "Orange means get a move on");
//        dict.put("Green", "Green means go");
//
//        // initiating string variable input and assigning the result2 value
//        String input,result2;
//
//        // flushing- clears all old data out of the buffer
//        s.nextLine();
//
//        // getting a colour input from the user and assigning it to the input variable
//        System.out.println("Enter a traffic light colour.");
//        input = s.nextLine();
//
//        // looking up input colour in dictionary and storing value in result2
//        result2 = dict.get(input);
//
//        // if item  not in dictionary result2 will be null
//        // checking to see if result2 is null
//        // if not print the result
//        if(result2!=null) {
//            System.out.println(result2);
//        }
//        else {
//            System.out.println("Traffic light colour is not stored.");
//        }
         //creating object s which is an instance of scanner
        Scanner s = new Scanner(System.in);


        // getting user input for the first number and assigning it to num1
        System.out.println("Enter number between 1 and 12?");
        int num1 = s.nextInt();
        String season;

        // creating a switch statement that takes num1 and changes it for the relevant season and prints message
        switch (num1){
            case 12, 1, 2:
                season = "winter";
                System.out.println("The seson is " + season);
                break;
            case  3, 4, 5:
                season = "spring";
                System.out.println("The seson is " + season);
                break;

            case  6, 7, 8:
                season = "summer";
                System.out.println("The seson is " + season);
                break;
            case 9, 10, 11 :
                season = "autumn";
                System.out.println("The seson is " + season);
                break;
            default:
                season = "not in year";
                System.out.println(season);
        }


    }
}