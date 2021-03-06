/* Johan Avila 9/20/18 */

package JAvila;

public class JAvilaLib {

    public static void println(String str)
    {
        System.out.println(str);
    }

    /**
     * splits apart the string based on slashes, stores each part in separate variables, then combines them in
     * a different order while putting dashes in between them.
     * @param str, date in mm/dd/yyyy format
     * @return String date in dd-mm-yyyy format
     */
    public static String dateStr(String str)
    {
        String month = str.split("/")[0];
        String day = str.split("/")[1];
        String year = str.split("/")[2];
        return day + "-" + month + "-" + year;
    }

    /**
     * detects the index of the second word within the first. If the second word is not there, the method returns the
     * entire first word without changing it. If the second word is found in the first, the method pulls it out
     * by working around it using substrings, then returns the result.
     * @param str1, the larger word
     * @param str2, the smaller word that will be removed from the larger
     * @return String with str2 removed from str1
     */
    public static String cutOut(String str1, String str2)
    {
        if(str1.indexOf(str2) == -1)
            return str1;
        int n = str1.indexOf(str2);
        return str1.substring(0, n) + str1.substring(n + str2.length());
    }

    /**
     * this method loops a variable until it reaches the number specified, adding itself with every number total
     * before it.
     * @param num, the number which the method will loop to
     * @return int, the sum of all numbers before it
     */
    public static int sumUpTo(Integer num)
    {
        int total = 0;
        for(int i = 0; i < num + 1; i++)
            total += i;
        return total;
    }

    /**
     * follows the rule of the fibonacci sequence and adds itself with the number before it. If at any point this
     * number matches with the parameter, it returns true. If the number is greater than the parameter, this means the
     * parameter is not in the sequence and returns false.
     * @param num, number which will be checked for within the fibonacci sequence
     * @return boolean, returns true or false depending on whether or not the number is in the sequence
     */
    public static boolean isFibonacci(Integer num)
    {
        int check = 1;
        int check2 = 0;
        for(int check3 = 0;check < num; check = check3)
        {
            check3 = check + check2;
            check2 = check;
            if(check3 == num)
                return true;
        }
        return false;
    }

    /**
     * reverses and lowercases the string given and checks to see if it's equal or not by rebuilding it
     * backwards using a for loop.
     * @param str, which will be reversed and checked
     * @return boolean, states whether the word is a palindrome or not
     */
    public static boolean isPalindrome(String str)
    {
        String str2 = "";
        str = str.toLowerCase();
        for(int i = str.length() - 1; i > -1; i--)
        {
            str2 += str.substring(i, i + 1);
        }
        if (str.equals(str2))
            return true;
        return false;
    }
}
