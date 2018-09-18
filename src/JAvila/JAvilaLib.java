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
}
