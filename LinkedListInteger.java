import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.List;

import static java.lang.Integer.parseInt;

class LinkedListInteger {
    private List<Integer> listNumber;
    private List<Integer> inputNumber;
    private List<Integer> reversedListNumber;
    private Boolean isNegative;
    private Node headA;
    private Node headB;
    private Node tail;


    public LinkedListInteger() {
        listNumber = new LinkedList<>();
        inputNumber = new LinkedList<>();
        reversedListNumber = new LinkedList<>();
        isNegative = null;
    }


    public LinkedListInteger(final String number) {
        //converts the given string number into a LinkedListInteger
        //negative number is possible
        //ex: input to constructor is "543"
        // listNumber should be 5 -> 4 -> 3 -> null with isNegative set to false
        //ex: input to constructor is "-543"
        // listNumber should be 5 -> 4 -> 3 -> null with isNegative set to true

        //Check if constructor String only contains digits
        if (number.matches("[0-9]+") || number.contains("-")) {
            listNumber = new LinkedList<>();
            int temp = parseInt(number);
            if (temp < 0) {

                isNegative = true;
            } else {
                isNegative = false;
            }

            temp = reverseInt(temp);

            do {
                listNumber.add(temp % 10);
                temp /= 10;
            } while (temp > 0);

            for (Integer i : listNumber) {
                System.out.print(i + " --> ");
            }
            if (tail == null) {
                System.out.print(" null");
            }
            System.out.println(" ");
            System.out.println(isNegative);
        } else {
            System.out.println("Invalid input!");
        }
    }


    public LinkedListInteger(final int number) {
        //converts the given int number into a LinkedListInteger
        //negative number is possible
        //ex: input to constructor is 543
        // listNumber should be 5 -> 4 -> 3 -> null with isNegative set to false
        //ex: input to constructor is -543
        // listNumber should be 5 -> 4 -> 3 -> null with isNegative set to true
        listNumber = new LinkedList<>();
        int temp = number;

        if (temp < 0) {
            isNegative = true;
        } else {
            isNegative = false;
        }
        temp = reverseInt(temp);
        // Let's first reverse this integer number so when I break down it will be added properly to linked list

        // First check for negative inputs
        if (temp < 0) {
            temp = Math.abs(temp);
        }
        // Check for positive inputs
        else {
        }
        do {
            listNumber.add(temp % 10);
            temp /= 10;
        } while (temp > 0);

        for (Integer i : listNumber) {
            System.out.print(i + " --> ");
        }
        if (tail == null) {
            System.out.print(" null");
        }
        System.out.println(" ");
        System.out.println(isNegative);
    }



    // Created a method so I could flip the integers before I start adding them to listNumber, this way they will be in proper order
    public int reverseInt(int x) {
        int reverse = 0;
        int remainder = 0;
        if (x < 0) {
            x = Math.abs(x);
        }
        while (x > 0) {
            remainder = x % 10;
            reverse = (reverse * 10) + remainder;
            x = x / 10;
        }
        return reverse;
    }


    public void getNumber() {
        //returns number as a whole, if the list is empty this return 0
        //ex. listNumber is 5 -> 4 -> 3 -> null with isNegative set to false
        //this should return 543
        //ex. listNumber is 5 -> 4 -> 3 -> null with isNegative set to true
        //this should return -543
        if (listNumber.isEmpty()) {
            int zero = 0;
            System.out.println(zero);
        } else if (isNegative == false) {
            for (Integer i : listNumber) {
                System.out.print(i);
            }
        } else if (isNegative == true) {
            System.out.print("-");
            for (Integer i : listNumber) {
                System.out.print(i);
            }
        }





    }


    public void reverseNumber() {
        //reverse the number and retaining its sign
        //ex. for example (5 -> 4 -> 3 -> null) 543 becomes (3 -> 4 -> 5 -> null) 345
        reversedListNumber = new LinkedList<>();
        for (int i = listNumber.size() - 1; i >= 0; i--) {
            reversedListNumber.add(listNumber.get(i));
        }
        for (Integer i : reversedListNumber) {
            System.out.print(i + " --> ");
        }
        if (tail == null) {
            System.out.print(" null");
        }
    }


    public String toString() {
        //returns the string version of this number, if negative return with "-" sign
        //ex. for example (5 -> 4 -> 3 -> null) return "543"
        //ex. for example (5 -> 4 -> 3 -> null) and isNegative is true return "-543"

        StringBuffer stringListNumber = new StringBuffer();
        for (Integer i : listNumber) {
            stringListNumber.append(i).append("");
        }
        if (isNegative) {
            System.out.println("-" + stringListNumber);
        } else if (isNegative == false) {
            System.out.println(stringListNumber);
        }
        return " ";
    }



    public void compareTo(final LinkedListInteger inputNumber) {



        if(isNegative==true){
            int[] tempArray = listNumber.stream().mapToInt(Integer::intValue).toArray();
            int[] tempArrayB = inputNumber.listNumber.stream().mapToInt(Integer::intValue).toArray();


            // Let's convert these int arrays into normal integers
            int intTempArray = 0;
            int intTempArrayB = 0;

            for(int i=0; i < tempArray.length; i++){
                intTempArray = 10 * intTempArray + tempArray[i];
            }


            for(int i=0; i < tempArrayB.length; i++){
                intTempArrayB = 10 * intTempArrayB + tempArrayB[i];
            }


            if(intTempArray < intTempArrayB){
                //System.out.println(listNumber + " is greater than " + inputNumber.listNumber);
                System.out.println("listNumber is greater than inputNumber");
            }else if(intTempArrayB < intTempArray){
                //System.out.println(listNumber + " is less than " + inputNumber.listNumber);
                System.out.println("listNumber is less than inputNumber");
            }else if(inputNumber.listNumber.equals(this.listNumber)){
                System.out.println("Your numbers are equal!");
            }
        }
        else if(isNegative==false){

            // Let's convert these LinkedListIntegers into int arrays

            int[] tempArray = listNumber.stream().mapToInt(Integer::intValue).toArray();
            int[] tempArrayB = inputNumber.listNumber.stream().mapToInt(Integer::intValue).toArray();


            // Let's convert these int arrays into normal integers
            int intTempArray = 0;
            int intTempArrayB = 0;

            for(int i=0; i < tempArray.length; i++){
                intTempArray = 10 * intTempArray + tempArray[i];
            }


            for(int i=0; i < tempArrayB.length; i++){
                intTempArrayB = 10 * intTempArrayB + tempArrayB[i];
            }


       /*   Now: intTempArray will store the integer version of listNumber
            intTempArrayB will store the integer version of inputNumber
        */


            if(intTempArray < intTempArrayB){
                // System.out.println(listNumber + " is less than " + inputNumber.listNumber);
                System.out.println("listNumber is less than inputNumber");
            }else if(intTempArrayB < intTempArray){
                // System.out.println(listNumber + " is greater than " + inputNumber.listNumber);
                System.out.println("listNumber is greater than inputNumber");
            }else if(inputNumber.listNumber.equals(this.listNumber)){
                System.out.println("Your numbers are equal!");
            }

        }

    }



    public Integer add(final LinkedListInteger inputNumber) {
        //Sums listNumber and inputNumber and return the resulting Integer
        //negative values are possible
        //ex. listNumber: 5 -> 4 -> 1 -> null
        //    inputNumber.listNumber : 3 -> 3 -> null
        // resulting number should be  574






        int sum;

        if(isNegative==true){
            int[] tempArray = listNumber.stream().mapToInt(Integer::intValue).toArray();
            char signA = '-';
            int[] tempArrayB = inputNumber.listNumber.stream().mapToInt(Integer::intValue).toArray();
            char signB = '-';

            int intTempArray = 0;
            int intTempArrayB = 0;


            for(int i=0; i < tempArray.length; i++){
                intTempArray = 10 * intTempArray + tempArray[i];
            }

            for(int i=0; i < tempArrayB.length; i++){
                intTempArrayB = 10 * intTempArrayB + tempArrayB[i];
            }

            String s1 = Integer.toString(intTempArray);
            s1 = signA + s1;

            String s2 = Integer.toString(intTempArrayB);
            s2 = signB + s2;

            int newIntTemp = Integer.parseInt(s1);
            int newIntTempB = Integer.parseInt(s2);

            sum = newIntTemp + newIntTempB;
            System.out.println(sum);

        }else if(isNegative == false){
            int[] tempArray = listNumber.stream().mapToInt(Integer::intValue).toArray();
            int[] tempArrayB = inputNumber.listNumber.stream().mapToInt(Integer::intValue).toArray();




            int intTempArray = 0;
            int intTempArrayB = 0;


            for(int i=0; i < tempArray.length; i++){
                intTempArray = 10 * intTempArray + tempArray[i];
            }


            for(int i=0; i < tempArrayB.length; i++){
                intTempArrayB = 10 * intTempArrayB + tempArrayB[i];
            }
            sum = intTempArray + intTempArrayB;

            System.out.println(sum);
        }

        return -1;

    }



    public static void main(String[] args){

        //Test String constructor input
        System.out.println("Linked List is: ");
        LinkedListInteger myListA = new LinkedListInteger("238");

        System.out.println(" ");

        //Test integer constructor input
        System.out.println("Linked List is: ");
        LinkedListInteger myListB = new LinkedListInteger(342);

        System.out.println(" ");
        //Tests invalid constructor input
        LinkedListInteger myListC = new LinkedListInteger("123a100cda9");
        System.out.println(" ");

        //Tests getNumber() method
        myListA.getNumber(); // Should give us: 238
        System.out.println(" ");

        myListB.getNumber(); // Should give us: 342
        System.out.println(" ");


        //Test reverseNumber();
        myListA.reverseNumber(); // should give 8 -> 3 -> 2
        System.out.println(" ");

        myListB.reverseNumber(); // should give 2 -> 4 -> 3
        System.out.println(" ");

        //Test toString method()
        System.out.println(myListB.toString()); // should give 342


        //Test the toCompare method

        myListB.compareTo(new LinkedListInteger(123)); // Should give listNumber is greater than inputNumber, because 342 > 123
        myListA.compareTo(new LinkedListInteger(238)); // Should give listNumber is equal to inputNumber, because 238 = 238


        //Test the add() method
        myListA.add(new LinkedListInteger(156)); // Should return 394 because 238+156=394





    }



}
