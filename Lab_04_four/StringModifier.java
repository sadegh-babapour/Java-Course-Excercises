import java.util.Scanner;

/**
 * String modifier is an all inclusive java file to question 4 in lab assignment
 * The program takes three input Strings from the user.
 *
 * With the three resulting strings that satisfies the three parts mentioned in question
 * with the use of a nested loop: one iteration for outer loop, and 60 times
 * for the inner loop, with the option of adding extra spaces to fill in the
 * unused elements the final answer is created.
 * to show this 2D array in proper matrix mode another nested for loop is used.

 * @author Sadegh Babapour
 *
 */


public class StringModifier {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // part1-a receiving the First input and printing the result.
        System.out.println("please Enter your First Sentence: ");
        String firstInput = sc.nextLine();
        String firstResult = charReverse(firstInput);
        System.out.println(firstResult);
        System.out.println();

        // part1-b receiving the Second input and printing the result.
        System.out.println("please Enter your Second Sentence: ");
        String secondInput = sc.nextLine();
        String secondResult = wordReverse(secondInput);
        System.out.println(secondResult);
        System.out.println();

        // part1-c receiving the Third input and printing the result.
        System.out.println("please Enter your Third Sentence: ");
        String thirdInput = sc.nextLine();
        String thirdResult = upperCase(thirdInput);
        System.out.println(thirdResult);
        System.out.println();

        // creating the array of characters named sentences and assigning
        // the values obtained by other methods into it.
        char[][] sentences = new char[3][60];
        for (int j = 0; j < 1; j++) {
            for (int i = 0; i < 60; i++) {
                if (i < firstResult.length()) {
                    sentences[j][i] = strngtoChar(firstResult)[i];
                }
                else {
                    sentences[j][i] = ' ';
                }
                if (i < secondResult.length()) {
                    sentences[j + 1][i] = strngtoChar(secondResult)[i];
                }
                else {
                    sentences[j + 1][i] = ' ';
                }
                if (i < thirdResult.length()) {
                    sentences[j + 2][i] = strngtoChar(thirdResult)[i];
                }
                else{
                    sentences[j+2][i] = ' ';
                }

                }
            }

        //print  the 2d array in Matrix mode!
        for (int i = 0; i < 3; i++) {
            System.out.print("[");
            for (int j = 0; j < 60; j++) {
                System.out.print(sentences[i][j]);
            }
            System.out.println("]");
        }
    }

    // This method is similiar to the string function :StringtoChar() Since we were
    // not supposed to use any functions, this is the method with the same function
    public static char[] strngtoChar(String str) {
        int len = str.length();
        char[] charArray = new char[len];
        for (int i = 0; i < len; i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }


    // This method chops the extra characters . string length
    // is equal to or less than 60
    public static String restrictor(String str) {
        String temp = "";
        char[] strChars = strngtoChar(str);
        int check = 0;
        if (str.length() > 60) {
            check = 60;
            char[] tempChar = new char[check];
            for (int i = 0; i < check; i++) {
                tempChar[i] = strChars[i];
            }

            for (int i = 0; i < tempChar.length; i++) {
                temp += tempChar[i];
            }

        } else {
            check = str.length();
            char[] tempChar = new char[check];

            for (int i = 0; i < check; i++) {
                tempChar[i] = strChars[i];
            }

            for (int i = 0; i < tempChar.length; i++) {
                temp += tempChar[i];
            }
        }

        return temp;
    }


    // This method solves the first part, reverses all the characters

    public static String charReverse(String str) {
        // characters in strChars are assigned in reverse order to tempChar.
        String str1 = new String();
        str1 = restrictor(str);
        char[] strChars = strngtoChar(str1);
        char[] tempChar = new char[strChars.length];
        String newString = "";
        for (int i = 0; i < strChars.length; i++) {
            tempChar[i] = strChars[strChars.length - i - 1];
        }

        for (int i = 0; i < tempChar.length; i++) {
            newString += tempChar[i];
        }
        return newString;
    }

    /**
     * this method solves the second part words are reversed:
     * after the parameter String : str length is checked with the restrictor method,
     * (new string is str2 is declared which is the same as str input but with an extra
     * space to make the calculations easier.
     *
     * A temporary String array is created, and with a for loop characters are added to
     * the temp string character by character until a space is reached.
     * then this temp string is added to the array and set to empty for the next iteration
     *
     * in each step, the temp string is added to the array by append method
     * Now we have a string array which contains seperate words
     * last part reverses the order of these elements
     *
     * finally a string named last with "" value is created and elements of the reversed
     * words in that final array are added to the string with the help of " " for
     * seperation.
     *
     * @param str input string
     * @return
     */

    public static String wordReverse(String str) {
        String str2 = new String();
        str2 = restrictor(str);
        str2 += ' ';
        String tempString = "";
        String[] tempArray = new String[0];

        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != ' ' && i != str2.length() - 1) {
                tempString += str2.charAt(i);
            } else {
                tempArray = myAppend(tempArray, tempString);
                tempString = "";
            }
        }
        String[] placeHolder = new String[tempArray.length];
        for (int i = 0; i < tempArray.length; i++) {
            placeHolder[i] = tempArray[tempArray.length - i - 1];
        }
        String last = "";
        for (int i = 0; i < placeHolder.length; i++) {
            last += placeHolder[i] + " ";
        }
        return last;
    }

    // appends the input string to the string array
    // return a new string array
    public static String[] myAppend(String[] strngArr, String strng) {
        String[] temp = new String[strngArr.length + 1];
        for (int i = 0; i < strngArr.length; i++) {
            temp[i] = strngArr[i];
        }
        temp[temp.length - 1] = strng;
        return temp;
    }

    // from index 0 to 59, if i is divisible by 5 i.e., i %5 =0
    // changes the character to upper case by the String.toUppercase()

    public static String upperCase(String str) {
        String str3 = new String();
        str3 = restrictor(str);
        char[] tempChar = new char[str3.length()];
        String newString = "";
        for (int i = 0; i < str3.length(); i++) {
            if (i % 5 == 0) {
                tempChar[i] = str3.toUpperCase().charAt(i);
            } else {
                tempChar[i] = str3.charAt(i);
            }
        }
        for (int i = 0; i < tempChar.length; i++) {
            newString += tempChar[i];
        }
        return newString;
    }
}
