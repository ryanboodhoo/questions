
public class Main {

    public static void printNumbers(){
        for(int e = 45; e >=1; e--){
            if (e% 3 == 0 && e % 5 == 0) {
                System.out.println("YearUP");
            }else if (e % 3 == 0) {
                System.out.println("Year");
            } else if (e % 5 == 0){
                System.out.println("UP");
            } else {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {

        printNumbers();













                    //Perform the following calculations on the array below named arrayOfNumbers.

                    int[] numbersArray = {2, 34, 7, 48, 0, 13, 24, 35};


                    // Calculations to perform
                    // - Use a for-loop to print out all the elements in the array.
                    // - Also print out the sum of all the elements in the array.
                    // - Also print out the average of this array.
                    int sum = 0;

        for (int i : numbersArray) {
            System.out.println(i);

            sum += i;

            // sum = sum + numbersArray[index]

            // int total= 2+34+7+48+0+13+24;
            System.out.println(sum);

            // System.out.println(sum/7);
        }



//                    int grade = 72;
//
//                    if (grade >= 90 && grade <= 100) {
//                        System.out.println("You got an A");
//                    } else if (grade >= 80 && grade <= 89) {
//                        System.out.println("You got a B");
//                    } else if (grade >= 70 && grade <= 79) {
//                        System.out.println("You got a C");
//                    } else if (grade >= 60 && grade <= 69) {
//                        System.out.println("You got a D");
//                    } else if (grade >= 0 && grade <= 59) {
//                        System.out.println("You got an F");
//                    }









                    //7  //for (int z = 1; z<= 20; z+= 2) {
                    // z % 2 // == 1
                    // System.out.println(z + " ");

                    // - Create a static method that that accepts a number as an argument/parameter then prints from 0 to that number`
                    //- eg: if number passed as argument to method is five then print 0 1 2 3 4 5

                    //5  // printNumbers(5);
                }
                // public static void printNumbers(int number) {
                //    for (int x = 0; x <= number; x++) {
                // System.out.print(x + " ");


                //6 // for (int i = 13; i<= 19; i++) {
                // System.out.println(i + " ");



            }
