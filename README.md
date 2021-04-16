PROJECT DETAILS:

Implement the class LinkedListInteger. You do not need to implement all the methods, just enough to gain 10 points. The MAX grade you can recieve is 10 points. Even if you implement more than 10 points worth of methods, your max grade is 10. There is no partial credit for each method. If it works, full points. If it does not then 0 points. You will not be provided a main method. You will need to create your own for testing.

You must supply a main method, if the main is not supplied in your final submission, there will be a 1 point deduction.

You MUST implement the constructors. If their not implemented, you will receive a 0.

Here is a break down of each methods worth: (Required) public LinkedListInteger(final String number) - 0.5 point (Required) public LinkedListInteger(final int number) - 0.5 point public Integer getNumber() - 2 point public void reverseNumber() - 2 point public String toString() - 1 point public Integer add(final LinkedListInteger inputNumber) - 6 point public Integer subtract(final LinkedListInteger inputNumber) - 6 point public Integer compareTo(final LinkedListInteger inputNumber) - 3 point

Assumptions you must take:

The class should only account for Integers, no Decimals
Integers can be either negative or positive
A negative input will be something like this "-123"
A positive input will be something like this "123". There will be no "+" symbol.
You must check the input for the constructor for garbage input ie "hcdsa123..f3"
There should be a exception thrown for garbage inputs with the message "Invalid input"
No white spaces allowed in the inputs
