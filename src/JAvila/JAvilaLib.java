package JAvila;

public class JAvilaLib {

    public static void println(String str)
    {
        System.out.println(str);
    }

    public static String dateStr(String str)
    {
        String month = str.split("/")[0];
        String day = str.split("/")[1];
        String year = str.split("/")[2];
        return day + "-" + month + "-" + year;
    }

    public static String cutOut(String str1, String str2)
    {
        if(str1.indexOf(str2) == -1)
            return str1;
        int n = str1.indexOf(str2);
        return str1.substring(0, n) + str1.substring(n + str2.length());
    }

    public static int sumUpTo(Integer num)
    {
        int total = 0;
        for(int i = 0; i < num + 1; i++)
            total += i;
        return total;
    }

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

    public static boolean isPalindrome(String str)
    {
        String str2 = "";
        for(int i = str.length() - 1; i > -1; i--)
        {
            str2 += str.substring(i, i + 1);
        }
        if (str.equals(str2))
            return true;
        return false;
    }
}
