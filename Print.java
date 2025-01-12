import java.util.Arrays;
/**
 * Class Print to allow to use method p() to print messages instead of System.out...
 * After making changes and compiling, need to create a Jar file names MyLib.jar
 * 
 * The class is automatically use in each new project once it is set as a
 * user library from Tools->preferences for all projects
 *
 * @author (צבי ברק)
 * @version (02.12.2024)
 */
public class Print
{
    public static void p(String s)
    {
        System.out.println(s);
    }
    public static void p(int s)
    {
        p(" " + s);
    }
    public static void p(boolean n)
    {
        p("" + n);
    }
    public static void p(int n1, int n2)
    {
        p("" + n1 + ", " + n2);
    }
    public static void p(int n1, int n2, int n3)
    {
        p("" + n1 + ", " + n2 + ", " + n3);
    }
    public static void p(int n1, int n2, int n3, int n4)
    {
        p("" + n1 + ", " + n2 + ", " + n3 + ", " + n4);
    }
    public static void p(int n1, int n2, int n3, int n4, int n5)
    {
        p("" + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5);
    }
    public static void p(int n1, int n2, int n3, int n4, int n5, int n6)
    {
        p("" + n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ", " + n6);
    }
    public static void p(int[] arr)
    {
        p("", arr);
    }
    public static void p(char[] arr)
    {
        p("", arr);
    }
    public static void p(String s, int[] arr)
    {
        p(s + Arrays.toString(arr));
    }
    public static void p(String s, char[] arr)
    {
        p(s + Arrays.toString(arr));
    }
    public static void p(String s, int n)
    {
        p(s + ", " + n);
    }
    public static void p(int[][] arr)
    {
        // not using Arrays.deepToString(arr)) because print all lines in one row
        for (int i = 0; i < arr.length; i++)
            p(arr[i]);
    }
    public static void p(char[][] arr)
    {
        // not using Arrays.deepToString(arr)) because print all lines in one row
        for (int i = 0; i < arr.length; i++)
            p(arr[i]);
    }
}