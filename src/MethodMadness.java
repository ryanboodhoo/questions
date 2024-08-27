public class MethodMadness {

    //Question 1:
    //create a static method named printName.
    //The method does not accept any parameters and does not return a value.
    //It should just print your full name.
    public static void printName() {
        System.out.println("Ryan Boodhoo");
    }


    //Question 2:
//create a static method named greetUser.
//The method accepts only one parameter named username and returns a value.
//The value returned should be a concatenation of the string "Welcome to my website" plus the user's name
//Call or invoke your method.

    public static String greetUser(String username) {
        return "Welcome to my website " + username;
    }
    //Question 3:
    //create a static method named buyCoffee.
    //The method accepts only one parameter named dollars.
    //The price of coffee NEVER changes and is ALWAYS $1
    //The value returned should be the change left after buying coffee
    //Call or invoke your method twice inside main with two different argument (values)

    public static int buyCoffee(int dollars) {
        final int coffeePrice = 1;
        return dollars - coffeePrice;
    }


    //Question 4:
    //create a static method named myHobbies.
    //The method accepts only one parameter which is an array of your hobbies.
    //The method does not return any values. It should just print out your hobbies when invoked
    //Call or invoke your method.

    public static void myHobbies(String[] hobbies) {

        for (int i = 0; i < hobbies.length; i++) {
            System.out.println(hobbies[i]);
            // code block to be executed
        }
    }

//    //Question 5:
//    //create a static method named checkWeather.
//    The method accepts two parameters String weatherCondition and an int temperature.
//    The method will RETURN one of the values below based on the weather condition
//
//  - if weatherCondition is hot and temperature is greater than 80 - " Wear shorts "
//            - if weatherCondition is cool and temperature is greater than 50  - " Wear wind-breakers "
//            - if weatherCondition is cold and temperature is below 50 - " Wear a jacket "
//            - if weatherCondition is anything else -  " No such weather condition "
//
//    Call or invoke your method.

    public static String checkWeather(String weatherCondition, int temperature) {
        if ("hot".equalsIgnoreCase(weatherCondition) && temperature > 80) {
            return "Wear shorts";
        } else if ("cool".equalsIgnoreCase(weatherCondition) && temperature > 50) {
            return "Wear wind breakers";
        } else if ("cold".equalsIgnoreCase(weatherCondition) && temperature < 50) {
            return "Wear a jacket";
        } else {
            return "No such weather condition";
        }
    }

    {
        // Example invocations of the checkWeather method
        System.out.println(checkWeather("hot", 85)); // Output: Wear shorts
        System.out.println(checkWeather("cool", 60)); // Output: Wear wind breakers
        System.out.println(checkWeather("cold", 45)); // Output: Wear a jacket
        System.out.println(checkWeather("rainy", 70)); // Output: No such weather condition
    }

//    Question 6:
//    create a static method named areaOfTriangle.
//    The method accepts two parameters (base and height)
//    The method should just return the computed area of the triangle
//    Call or invoke your method.
//public static double areaOfTriangle(double base, double height) {
//    return 0.5 * base * height; // Area calculation
//}
//
//    public static void main(String[] args) {
//        // Example values for base and height
//        double base = 5.0;
//        double height = 10.0;
//
//        // Invoking the areaOfTriangle method
//        double area = areaOfTriangle(base, height);
//
//        // Displaying the result
//        System.out.println("The area of the triangle is: " + area);
//    }
//}

//    Question 7:
//    Randomly generate a number between 1 and 6
//    Create a switch statement with different cases to print out the random number generated
//    eg: case 1 -  you rolled a one ..etc

    int number = 4;
switch(number)

    {
        case 1:
            System.out.println("you rolled a 1");
            break;
        case 2:
            System.out.println("you rolled a 2");
            break;
        case 3:
            System.out.println("you rolled a 3");
            break;
        case 4:
            System.out.println("you rolled a 4");
            break;
        case 5:
            System.out.println("you rolled a 5");
            break;
        case 6:
            System.out.println("you rolled a 6");
            break;
    }
}







//                    public static void main (String[]args){
//
//                        printName();
//
//                        greetUser("john");
//
//                        System.out.println("Change after buying coffee: $" + buyCoffee(5));
//                        System.out.println("Change after buying coffee: $" + buyCoffee(2));
//
//                        myHobbies(new String[]{"Fishing", "Basketball", "Playing video-games"});
//
//                        // import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
//
//                        public class Main {
//                            public static void main(String[] args) {
//
//
//                                printNumbers(){
//                                    for(int e = 45; e >=1; e--){
//                                        if (e% 3 == 0 && e) % 5 == 0);
//                                        System.out.println("YearUP");
//          else if (e % 3 == 0);
//                                        System.out.println("Year");
//          else if (e % 5 == 0){
//                                            System.out.println("UP");
//                                        } else {
//                                            System.out.println(e);










//                                            //Perform the following calculations on the array below named arrayOfNumbers.
//
//                                            int[] numbersArray = {2, 34, 7, 48, 0, 13, 24, 35};
//
//
////                                            // Calculations to perform
////                                            // - Use a for-loop to print out all the elements in the array.
////                                            // - Also print out the sum of all the elements in the array.
////                                            // - Also print out the average of this array.
////                                            int sum = 0;
////
////                                            for (int q = 0; q < numbersArray.length; q++){
////                                                System.out.println(numbersArray[q]);
////
////                                                sum += numbersArray[q];
////                                                // int total= 2+34+7+48+0+13+24;
////                                                System.out.println(sum);
////
//                                                System.out.println(sum/7);
//                                            }



//                                            int grade = 72;
//
//                                            if (grade >= 90 && grade <= 100) {
//                                                System.out.println("You got an A");
//                                            } else if (grade >= 80 && grade <= 89) {
//                                                System.out.println("You got a B");
//                                            } else if (grade >= 70 && grade <= 79) {
//                                                System.out.println("You got a C");
//                                            } else if (grade >= 60 && grade <= 69) {
//                                                System.out.println("You got a D");
//                                            } else if (grade >= 0 && grade <= 59) {
//                                                System.out.println("You got an F");
//                                            }









                                            //7  for (int z = 1; z<= 20; z+= 2) {
                                            // z % 2 // == 1
                                             //System.out.println(z + " ");

                                            // - Create a static method that that accepts a number as an argument/parameter then prints from 0 to that number`
                                            //- eg: if number passed as argument to method is five then print 0 1 2 3 4 5

                                            //5  // printNumbers(5);

                                        // public static void printNumbers(int number) {
                                        //    for (int x = 0; x <= number; x++) {
                                        // System.out.print(x + " ");


                                        //6 // for (int i = 13; i<= 19; i++) {
                                        // System.out.println(i + " ");


