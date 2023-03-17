// introduce the Scanner tool used for reading User input

import java.util.Scanner;

// Public class sandbox tell us the name of file that contain the name of the source code
public class Sandbox {

    // Public static void main (string[] args) { tell us the start of the program
    public static void main(String[] args) {

        // This the input that comes from the scanner tool from Java.
        Scanner Scanner = new Scanner(System.in);

        // This is line comment.
        //it tells the computer to ignore it when executating.
        System.out.println("Welcome to Programming!!");
        // This tells the program to print "Welcome to Programming" to the output when executated.

        System.out.println("Print word underneath it");
        // This print + ln let us print underneath it so it doesn't go on the same row.

        // This will print the words "print word underneath it" into the output when execuated by the programmer 
        // The semicoln or ";" in java programming is the end of the code which you need if you want to end a code.
        // Comments
        // Single line comment is done like this "//"
        // Mutiple line is done by first starting with this "/*" amd ending with this "*/"
        // Input
        /*
       - Input means text written by the user to read by the program.
       - Input is always read as a string
       - Input comes from Scanner tool that comes from Java
       - Before that we implement command import.java.util.Scanner; before the main program frame (public class)
       - The Tool itself is created with Scanner scanner = new Scanner(system.in)
         */
        String Message = Scanner.nextLine();
        System.out.println(Message);
        /*
       - The input is read from the scanner tool's nextline(); method
       - The Scanner.nextLine wait for the to write something
       - when the user writes something and press enter the string is assigned to string variable which is "message"
       - Then it reference to the print command which system.out.println(Message) which then print Message into the output for the user.
         */

        // Fundamental of Strings
        /* String also called "" which mean text or strings of characters in java.
       - It describe how computers see texts on a fundamental level: as a sequence of individual characters.
         */
        //  A string variable called message that is assign with a text "Hello World" is declared like this.
        String Message1 = "hello World";

        /* When a variable is called a specific container is made avialable with the program of which can be later be referenced.
       -  Variable are referenced by their name. 
       - Creating a string name and reference it to print system is done like this
         */
        String Message2 = "Hello World!";
        System.out.println(Message2);

        // String Literal
        /* A string enclosed in programming language's quotation is called a String literal 
        - It mean it is string for specfied value
         */
        // Concatenation -- Joining Two String together
        // In order to combined two string together to be printed in the outpur you need "+" operator. for example
        System.out.println("Hello" + " " + "World");

        // You can declare a string literal and a value of string variable together like so
        String Message3 = "Hello World!!";
        System.out.println(Message3 + "....and the Universe!");

        // Lastly You can do contentation with many number of string variable 
        String start = "My name is";
        String end = ", James Bond";
        System.out.println(start + " Bond" + end);

        //Reading String
        /* The reader.nextLine(); command reads the user input  and return to string
        - if you want a string in a program you must save it to a string variable.
        - String value = scanner.nextline(); A value saved to a variable that can be used repeatedly. Here is the example below
         */
        String Message4 = Scanner.nextLine();
        System.out.println(Message4);
        System.out.println(Message4);
        System.out.println(Message4);

        // Program Execuation Waits for Input 
        /* When a program execuation comes  as a statement that attempt to read user Input from the User("reader.nextLine()")
        - The execuation stop and wait until the user inputted words in there and press enter then the excuation continues. Here is an example
         */
        System.out.println("Write the First String");
        String UserInput1 = Scanner.nextLine();
        System.out.println("Write the Second String");
        String UserInput2 = Scanner.nextLine();
        System.out.println("Write the Third String");
        String UserInput3 = Scanner.nextLine();

        System.out.println("You wrote:");
        System.out.println(UserInput1);
        System.out.println(UserInput2);
        System.out.println(UserInput3);

        // Variable
        /* Variable are named container that contain information of given type can be stored 
        - Example of these types variable are String  which is a text
        - Int which is a whole number 
        - Double which is floating numbers
        - Boolean which is true or false 
        - Float which is also floating number
        - Below is example of Variable name "month  is assigned to a value which is 12.
         */
        int months = 12;

        /* A variable value can be joined to a string using the + sign
       - Below there will be an example of how it is done.
         */
        String text = "Contain a text";
        int wholeNumbers = 123;
        double floatingPoints = 3.141592653;
        boolean trueorFalse = true;

        System.out.println("Text variable: " + text);
        System.out.println("Integer variable: " + wholeNumbers);
        System.out.println("Double variable: " + floatingPoints);
        System.out.println("Boolean variable: " + trueorFalse);

        // Variable are unique 
        // You cant havetwo variable that have the same name. It will give an error. look at the example below
        double PI = 3.14159653;
        double PI = 3.14159653;
        System.out.println("The value of pi is: " + PI);

        /* A variable type  is stated when the variable is declared.
            - When a mew value is assign to the variable, the type is no longer declared
            - Look at the example below
         */
        int value = 10;
        System.out.println(value);
        value = 4;
        System.out.println(value);

        // Changing a Value assigned to variable
        /* A variable exist from the moment of its declaration and its intial value that is preserved until another value is assign to it
           -   You can change variable value using statement that have the same name of the previous variable name, equal sign and the new value to be assigned.
           - Remember type is only stated during the initial variable declaration.
           - See the example below.
         */
        // when a Variable appears in a program the computer is told the variable type "int" and it's name "number"
        // The computer create container for the variable name then assigned value on the right side of the equal sign is copied to the container           
        int number = 123;

        /* when a variable is reference by it name in a program - here we want to print the string "The value of the variable is" followed by the "number" variable
           - its value is retrived from the container that has the same variable name
         */
        System.out.println("The value of the variable is" + " " + number);

        /* Whenever a value is assigned to the variable(here number = 42) a check is run is run to see whether a container with the given name exist
            -  if one does a new copy is in place of the old value, and the old value dissappears 
         */
        number = 42;

        // The variable is then referenced again by its name in the program- we again want to print the string "The value of the variable is" followed by the value "number" variable
        System.out.println("The value of the variable is" + " " + number);

        // Variable's Type Persist
        /* When a variable type has been declared it can no longer be changed.
            - A Boolean value cannot be assigned to integer type neither can integer be changed assigned to a variable boolean type.
         */
        boolean integerAssignmentWillWork = false;
        integerAssignmentWillWork = 42;
        int wholenumber = 10;
        integerAssignmentWillWork = wholenumber;

        // However excerpt exist: integer can be assigned to a variable of the double type, since java knows how to convert an integer to a double during assignment
        double floatingPoint = 0.42;
        floatingPoint = 1;

        System.out.println(floatingPoint);

        int wholeNumber1 = 10;
        floatingPoint = wholeNumber1;
        System.out.println(wholeNumber1);
        System.out.println(floatingPoint);

        /* floating-point cannot however be assigned to integer variable. 
          - The reason for this is that those who delveloped the language aim to prevent developers from making errors that lead to loss of information.
          - Below is an example
         */
        int point = 4.2;
        double floatingPoint2 = 4.2;
        value = floatingPoint2;

        // Naming Variables
        /* Variables can not contain certain special symbols such as exclamation point "!"
         - Spaces are not allowed either since they are used to sperate a command.
         - instead of spaces You can use camelCase.
         - the first letter of the variable name is always lower-cased
         - Below is an example
         */
        int camelCase = 7;
        // Number can be used within a variable name as long as the name does not begin with a number.
        // Also a name cannot consist of numbers only.
        int 7number = 4;

        // the buttom program works but not a descriptive variable name
        int number7 = 5;

        // Variable that is previously defined in program and command  provided by java cannot be used
        // Below is an example
        int System
        .out.print = 5;
        int System
        .out.println = 7;

        // You can't already use variable type and name twice for different assign value or same value.
        int camelCase2 = 9;
        int camelCase2 = 5;

        // You can't use letters containing diacritics such a letter from a country and into java instead change into non-diacritics.
        // Passable VariableNames
        /* lastDayofMonth = 20
         - firstYear = 1952
         - name = "Essi"
         
         // Not Passiable Variable Name
         /* last Day of Month = 20
         - 1day = 1952
         - beware! = 1910
         - 1920 = 1
         */
        // Types of Variable inform of Possible values
        /* A variable type is specified when it is intially declared.
         - For example a variable type containing the string "text" is declared as String text = "text"
         -  A integer type having value of 42 is declared with a statement of int value = 42
         - A variable type determines the types of value that can be assign to it.
         - A String type hold the value of a text
         - A double type hold the value of a decimal number or floatingPoint
         - A boolean type hold the value of true or false.
         - As such the possible values of a given variable type are limited. For example string cannot contain a integer
         - Nor can a double contain a boolean
         */
        // Reading Integers
        /* The Integer.valueof command convert string into integer. It takes the string containing the value to be converted as a parameter
         - Below is an example
         */
        String valueAsString = "42";
        int People = Integer.valueOf(valueAsString);
        System.out.println(People);
        // it will print 42

        /* When using the scanner object the reading of the value is usally inserted directly into type conversion
        - it will print the string literal "You wrote" and reference what the inputted in text number and print it output which is 42.
         */
        System.out.println("Write a value");
        int value7 = Integer.valueOf(Scanner.nextLine());
        System.out.println("You wrote:" + value7);

        // it can also be done like this
        System.out.println("Write a value");
        int value8 = scanner.nextInt();
        System.out.println("You wrote:" + value8);

        //Reading Double
        /* Double.valueof convert srting to an double. it takes the string conatining the value to be converted as a parameter
          - Example is below
         */
        String valueAsString1 = "42.42";
        double value9 = Double.valueOf(valueAsString1);
        System.out.println(value9);
        // it will print 42.42

        /*As with integers, the reading is nested within the conversion. 
          - Below is an example.
         */
        System.out.println("Write a value ");
        double value10 = Double.valueOf(Scanner.nextLine());
        System.out.println("You Wrote:" + value10);
        // it will print of what the as a text(number) and convert into decimal number into the Ouput

        //Reading Boolean 
        /*
           - Integer.valueOf command converts String to Integer. Double.valueOf convert string to floating points.
           - The valueOf also appears when converting string to boolean- this is done with Boolean.valueOf
           - Boolean variable can either be true or false. When converting string to a boolean, the string must be "true" if we want it to be "true"
           - The case insentive here: both "true" and "TRue" turn the boolean "true". All other strings turn the boolean "false"
         */
        System.out.println("Write a boolean ");
        boolean trueorFalse2 = Boolean.valueOf(Scanner.nextLine());
        System.out.println("You wrote " + trueorFalse);

        // When the user enter i won't! it will print false
        // when the user enter true it will print true
        //Calculating with Numbers
        /*
            - The basic mathematical operator are followed "+" addition, "-" substraction, and "/" division
            - The precendence is also fimilar in Java. Operator are performed from left to right with the parentheses taken into account
            - Expression involving "*" and / are calculated before those including + and - as it is customary in elementary school mathematics
         */
        int first = 2;
        System.out.println(first);
        int second = 4;
        System.out.println(second);

        int sum = first + second;
        System.out.println(sum);
        // It will print out 6 since it added first refernece variable and added second reference variable and store it into the sum

        // Precendence and Parentheses 
        /* You can affect the order of operation by using parentheses. Operations within parentheses are performed before those outside them */
        int calculationWithParentheses = (1 + 1) + 3 * (2 + 5);
        System.out.println(calculationWithParentheses);
        int calculationWithoutParentheses = 1 + 1 + 3 * 2 + 5;
        System.out.println(calculationWithoutParentheses);
        // It will print 13 since it is started off by mutiplying "3*2" the add the result into "5" then add it by 1 and by 1 again, which result in 13 

        // Calculating and Printing
        /* The system.out.println print a value of a variable
            - The string literal to be printed, which is marked by quotation marks can be appended with other contents by using "+" operator.
         */
        int length = 42;
        System.out.println("length" + length);
        // it will print the string literal "length" and it will store the value of the intger variable name length then reference it into the print and into the Output.

        /*
             - If one of the operands of the operator is a string, the other operand will be changed into a string too during program execuation
             - In the example below the integer "2" turned  into a string literal "2" and a string has been appended to it
         */
        // The first coded printed 4 because of the parentheses in between the number 
        System.out.println("four" + (2 + 2));
        System.out.println("But! Twenty-two" + 2 + 2);
        // The second program printed  twenty two "22" because there wasn't  a parenthesis

        // Division
        /* Divison are tricky operation. 
             - The types of variables that are part of the division determine the type of result achieved by excuating the command.
             - if all of the variables in the division expression are intgers. The resulting value is an intger as well.
         */
        int result 3/2;
             System.out.println(result);
        // it will print the result of 6 since it is reference the integer "result" since it is container of the value 3/2

        // The example below print 1 since both 3 and 2 are integer and the division of two integer always produce an integer.
        int firstValue = 3;
        int secondValue = 2;
        double result1 = firstValue / secondValue;
        System.out.println(result1);
        // it will print out one since 3 and 2 are both integers 

        // if the dividend or divisor or both of the division is floating point number the result is a floating point number as well
        double whenDividedIsFloat = 3.0 / 2;
        System.out.println(whenDividedIsFloat);
        // it will print print one point 1.5 becuase one of the number is floating point number even though one numbrt is a integer

        double whenDivisorIsFloat = 3 / 2.0;
        System.out.println(whenDivisorIsFloat);
        // it will print print 1.5 becuase one of the number is floating point number even though one numbrt is a integer

        double whenBothDividedIsFloat = 3.0 / 2.0;
        System.out.println(whenBothDividedIsFloat);
        // it will still print 1.5 because both of the numbers are floating point numbers that being divided

        // Type Casting 
        /* An integer can be converted into a floating point number by placing a type casting operation
             - Below is an example 
         */
        int first1 = 3;
        int second1 = 2;
        double result2 = (double) first1 / second1;
        double result3 = first1 / (double) second1;
        double result4 = first1 / (double) (first1 / second1);
        System.out.println(result2);
        // This will print 1.5 because it converted the container that hold first integer value of 3 and hold the container for the second inetger with a value of "2" and divided them to convert into floating number
        System.out.println(result3) // This will print 1.5 because it converted the container that hold first integer value of 3 and hold the container for the second inetger with a value of "2" and divided them to convert into floating number
        System.out.println(result4);
        // The last one produce incorrect rounded result because the integer division is execuated before tye type casting

        // if the result of a division is assigned to an integer-type variable the result is automatically an integer.
        int integer = 3.0 / 2;
        System.out.println(integer);
        // This will print out 1.

        //The example below print 1.5 ; the dividend is converted into a floating point number by mutiplying it with a floating number prior to execuating the division
        int dividend = 3;
        int divisor = 2;
        double resulting = 1.0 * dividend / divisor;
        System.out.println(resulting);
        // this will print 1.5

        // Conditional Statement/if Statement
        /*
              - A condtional statement begin with keyword if followed by parentheses
              - An expression is placed inside the parentheses which is evaluated when the condition is reached 
              - The result of the evaluation is a boolean value
              - No evaluation occured above.
              - Instead a boolean value was explicitly used in the conditional statement 
              - The parentheses are followed by a block which is defined inside the { and closing bracket} curly brackets.
              - The source code  inside the block is executed if the expression inside the parentheses evaluates to true 
              - Below is an example of using conditional Statement
         */
        System.out.println("Hello World!");
        // this will print "Hello World into the Output
        if (true) {
            System.out.println("the code is unaviodable");
            // This will print unaviodable because it saying if it is true then print the code is unaviodable 
        }

        /* if the  expression in the condtional statement evaluates to true the excuation of the program progress to the block defined by the conditional statement 
              - In the example below, the conditional is if the number in the variable is greater than 10.
              - On the othe hand, if the expression evaluate the execuation moves on to the statement after the closing curly bracket of the current conditional statement.
         */
        int number = 11;
        if (number > 11) {
            System.out.println("The number was greater than 10");
            // This will print"The number was greater than 10" because it create a integer name number container that has the value of 11 and preference the  integer name container into if statement and if that integer name container with the value of 11 is greater than then then print "The number was greater than 10" into the output 
        }

        // Compareision Operators 
        /*
            - > greater than
            - >= greater than or equal to
            - < less than 
            - <= less than or equal to
            - == equals to
            - != not equal to
         */
        // Below is an example
        int age = 55;
        if (age > 60) {
            System.out.println("The number is greater than 55");
        }
        if (age >= 58) {
            System.out.println("The number is greater than or equal to 58");

        }
        if (age < 54) {
            System.out.println("The nnumber is less than 54");
        }
        if (age <= 30  {
            System.out.println("The number is less than or equal to 30 ");
        }
        if (age != 0) {
            System.out.println("The number is not euqal to 0");
        }

        // Else 
        /*
            - if the expression inside the condiditonal statement evaluate to false then the execution of the code moves to the statement following the closing bracket of the current conditional statement.
            - This is not always desired and usually we want to create an alternative option when the conditionl expression to evaluates to false.
            - This can be done with the help of the else command which is together with the if command.
            - Below is an example.
         */
        int numbe8 = 4;
        if (number > 10) {
            System.out.println("number is greater than 10");
        } else {
            System.out.println("number is less than 10");
            // This will print "number is less than 10" into the output because number is 4 is less than 10.
        }
        // if an else branch has been specified for a conditonal statement the block defined by the else branch run in the case that the conditonal is false.
        // The else command is placed on the same line as the closing bracket of the block defined by the if command 

        // More Conditonal: else if
        /*
              - In case of mutiple contionals we use the "else if" command.
              - The "else if" command like else but with an additonal condtion.
              - else if follows the "if" conditon and they may be mutiply
         */
        int number9 = 3;
        if (number == 1) {
            System.out.println("The number is equal to 1");
        } else if (number9 == 2) {
            System.out.println("The number is equal to 2");
        } else if (number9 == 3) {
            System.out.println("The number is equal to 3")
        }
        // This will print "The number is equal to 3" into the output because 3 is equal 3 

        // Order of Execution for Comparision
        /* The compariso are executed  top to  buttom. 
        - When execution reaches a condtional statement who condtion is true its block is executed and the comparison stops
        - Below is an example
         */
        int number11 = 10;
        if (number == 0) {
            System.out.println("The number is zero");
        } else if (number > 0) {
            System.out.println("The number greater than zero")
        } else if (number > 3) {
            System.out.println("The number is greater than three");
        } else {
            System.out.println("The number is greater than 0");
        }// This will print the number is greater than 0 even if the condition number > 3 is true. The comaprision stops at the first condition that evaluate to true

        // Conditonal Statement Expression and the Boolean Variable
        /*
        - The value that goes between the parentheses of the conditional statement should be of type boolean after the evaluation.
        - boolean type of variables are either "true" or "false"
       - Below is an example of it
         */
        boolean isItTrue = true;
        System.out.println("The value of the boolean is " + isItTrue);
        // This will print the string literal"The value of the boolean is " and true; 

        // The conditional statement can also be done as follows
        boolean isItTrue1 = true;
        if (isItTrue1) {
            System.out.println("{Pretty wild!"); 
            // this will print pretty wild!
        }
                    
        /* Comaprison operators can also be used outside of the conditionals.
         -  In those cases, the boolean value resulting from the comparison is stored in the boolean variable for later use.
         - Below is an example
         */
          int first3 = 1;
          int second2 = 2;
          boolean isGreater = first > second; 
          
          int first4 = 1;
          int second3 = 3;
          boolean islessThan = first4 < second3;
          if(islessThan){
              System.out.println("1 is less than 3");
              // this will print the string literal "1 is less than 3" into the output because 1 is less than 3
          }
              // Conditional Statements and Comparing strings
              /* Even though we can compare integers floating points and boolean values using two equal sings(variable1 == variable2), we canot comapre the equality of strings using two equals signs
              - Below is an example
              */
               System.out.println("Enter the first string");
               String firstString = Scanner.nextLine();
               System.out.println("Enter the second string");
               String secondString = Scanner.nextLine();
                if(firstString == secondString){
                   System.out.println("The strings were the same");
                }else{
                   System.out.println("The strings were different ");
                   // This will print the string literal "The string are different" because the you can't compare two string with double equal sign
               }
               /* This has to do with the internal workings with strings as well as how variable comparison is implemented in java
               - In practice the comparision is affected by how much information a variable can hold 
               - Strings can hold limitess amount of characters 
               - Whereas Integers, floating point number and boolean values always contain signal number or a value only
               - Variables that contain only one number or a value can be compared using an equals sign whereas this doesn't work for variables containing more information
               - We will return to this topic later in the course.
               */
               
               /* When comparing strings we use the "equals" command which is related to strings variables.
               - Below is an example
               */
              System.out.println("Enter a string");
              String input = Scanner.nextLine();
              if(input.equals("a string")){
                  System.out.println("Great! You read the instructions correctly.");
              } else{
                  System.out.println("Missed the mark!");
                  // this will print string literal "Great! you read the instruction." if the what the user inputted match the string literal "a string" if not it will print the string literal "Missed the Mark!"
                                
              }
              // Logic Operators
              /* The expression of a conditional statement may consist of mutiply parts, in which the logical operators and "&&" or "||" and not "!" are used
              - An expression consisting of two expression combined using the and operator "&&" is true if and only if both of the combined expressions evaluate to true
              - An expression consiting of two expression combined using the or operator "||" is true if either one or both of the combined expression evaluates to true
              - logical operator are used for changing the boolean value from true to false or false to true
              */
              
              /* In the example below we combine two individual condition "&&" the or operator.
              - The code used to check if the number is in the variable is greater than or equal to equal to 5 and less than 10. In other words whether it is with the range of 5-10
              */
              System.out.println("Is the number within the range 5-10: ");
              int number12= 7;
              if(number >=5 && number <=10){
                  System.out.println("It is! :)");
              }else {
                  System.out.println("It is not :(");
                  
            } // it will print the string literal it is because 7 is greater than or equal to 5 and number is less than 10
               
              /*Below is an example of providing two condition "||" the or operator: is the number less than zero or greater than 100
              - The condition is fulfilled if the number fulfills either one of the two conditions:
              */
              System.out.println("Is the number less than 0 or greater than 100");
              int number13 = 145;
              if (number < 0 || number >100){
                   System.out.println("It is! :)");
              }else{
                  System.out.println("it is not :(");
                 
              }// The number print "it is! :)" because 145 is not less than zero but it is greater than 100.
              
              // Reading Functionality
             /* A computer processor, which specializes in executing commands, is capcable of executing in a modern computer-over billion(machine code)commands in seconds
              - In thisection  we'll get used writing often-repeated program code with the help of loops
              - let's  motivate ourself with loops. Below you'll find an example of a prgram that ask the user for five numbers and calculate the su
              */
             int sum1 =0;
             sum1 = sum1 + Integer.valueOf(Scanner.nextLine());
             sum1 = sum1 + Integer.valueOf(Scanner.nextLine());
             sum1 = sum1 + Integer.valueOf(Scanner.nextLine());
             sum1 = sum1 + Integer.valueOf(Scanner.nextLine());
             sum1 = sum1 + Integer.valueOf(Scanner.nextLine());
             System.out.println("The number of sum: " + sum);
             // This will print add what the user inputted number is plus 0 and store it into the sum and print that sum
             
             /* It does the job but not elegantly. What if the prgram had to read hundred or perhaps a thousand numbers and print his sum? what if the program  had to read three numbers only?
             - The problem can be solved with loops which keep track of both the sum and the number  of times input has been read. T
             - The program that prints the sum of five numbers now look as follows 
             */
             int numberRead = 0;
             int sum2 =0;
             while (true){
                 if(number ==5){
                     break;
                 }
                 System.out.println("Input Number");
                 sum2 = sum2 + Integer.valueOf(Scanner.nextLine());
                 numberRead = numberRead + 1;
                 System.out.println("The sum of the numbers is " + sum2);
                 
                 // Loops and infinite Loops 
                 /* A loop consist of an expression that determine whether  or not the code within the code should be repeated along the with the block conatining the source code should be repeated.
                 -  A loop takes the following form 
                 - Below is an example
                 */
                 while(_expression_){
                     // The content of the block wrapped in curly bracket
                     // // The block can have an unlimited amount of content.
                 }
                 
                 /* We'll use the "true" as the loop expression for now. This way, the loop execution is always continued when the prgram arrives at the point that decide whether it should be repeated or not.
                 - This happen when the execution of the program first arrives at the loop expression for the first time, and also when it reaches the end of the loop's block
                 - The loop execution proceed line by line. the following program outputs i can program an infinite number of times.
                 - Below is an exmaple of it
                 */
                 while (true){
                     System.out.println("i can program ");
                     // This will print the string literal "i can program" infinite number of times in the output
                 }
                 
                 // A program that run infinitely does not end on its own. In netbeans, it can shut down by clicking the red buttom located on the left side of the output
                 
                 // Ending a loop
                 /*
                 - The loop can be broken out with the command "break". When a computer executes the command "break" the program execution moves onto the next command following the loop block
                 - The example below is a program that prints numbers from one to five. Note how the variable that;s used with the loop is defined before the loop 
                 - This way the variable can be incremented inside the loop and change the sticks bettween mutiple iteration of the loop
                 - Below is an example
                 */
                 int number4 =1;
                 while (true){
                     if(number <=5){
                         break;
                     }
                 }
                 number4 = number4+1;
                 System.out.println("Ready!");
                 // This will print from 1  to 5 and ready into the output becaue 1 <=5 and number is being added together until it reache by then stops
                         
                /*
                 - A loop consist of an expression that determines whether or not the code within the loop should be repeated along with the block containing the source code to be repeated a loop takes the following form
                 - Below is an example
                 */
                while(_expression){
                 // The content of the block wrapped in curly brackets
                 // The block can have an unlimited amount of content
                }
                
                /*
                - We will use true as the loop expression for now.
                - This way, the loop execution is always continued when the program  arrives at point that decides whether it should be repeated or not.
                - This is happens when the execution of the program first arrives at the loop expression for the first time and also when it reaches the end of the loop's block
                - The loop execution proceed line by line. The following program outputs i can program an infinite number of times 
                - Below is an example
                */
                while(true){
                    System.out.println("i can program");
                    // this will print the string literal i can program forever
                }
                  // A program that runs infinitely does not end on its own
                  
                  // Ending a loop 
                  /* The loop can be broken out of with command "break".
                  - When a computer executes the command break the program execution moves onto the next command following the loop block
                  - The example below is a program that print numbers from one to five. 
                  - Note how the variable that's used within the loop is defined before the loop. 
                  - This  way the variable can be incremented inside the loop and change sticks between multiple iteration of the loop 
                  - Below is an example
                  */
                  int number14 = 1;
                  while (true) {
                      System.out.println(number14);
                      if(number>=5){
                          break;
                      }
                      number = number + 1;
                  }
                    System.out.println("Ready!");
             }
        }
    }
