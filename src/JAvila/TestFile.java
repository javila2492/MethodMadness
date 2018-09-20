/* Johan Avila 9/20/18 */

package JAvila;

import static JAvila.JAvilaLib.*;

public class TestFile {

    public static void main(String[] args)
    {
        /*in this test, dateStr is used with 6/21/2001. The method splits the date, reorders it, and seperates it with
        dashes, returning 21-6-2001.*/
        System.out.println(dateStr("6/21/2001"));

        /*cutOut is used to cut the phrase "the hell" from a sentence in order to make it PG. Spaces and multiple words
        work with the method too.*/
        System.out.println(cutOut("what the hell are you doing?", " the hell"));

        /*sumUpTo simply sums all of the number leading up to 9 and returning 45 using a loop.*/
        System.out.println(sumUpTo(9));

        /*isFibonacci repeats the fibonacci sequence, checking to see if any of the numbers match with the number given.
        In this case, 5 is a number in the sequence, returning true.*/
        System.out.println(isFibonacci(5));

        /*simply enough, isPalindrome checks to see if if the word is a palindrome by reversing the string and comparing
        it to the original.*/
        System.out.println(isPalindrome("tacocat"));
    }

}