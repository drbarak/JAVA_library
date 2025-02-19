package Library;

/**
 * Class MyLibrary to have common methods instead of re-writing in each class.
 * After making changes and compiling, need to create a Jar file names MyLib.jar
 * 
 * The class is automatically used in each new project once MyLib.jar is set
 * as a user library from Tools->preferences for all projects
 *
 * @author (צבי ברק)
 * @version (02.12.2024)
 */
public class MyLibrary
{
    public static boolean isValid(int[][] grid, int x, int y)
    {
        return !(x < 0 || y < 0 || x >= grid.length || y >= grid[x].length);
    }
    public static boolean isValid(int n, int x, int y)
    {
        return !(x < 0 || y < 0 || x >= n || y >= n);
    }
    public static boolean isValid(int nX, int x, int nY, int y)
    {
        return !(x < 0 || y < 0 || x >= nX || y >= nY);
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
    public static String swap(String str, int i, int j)
    {
        if (i == j) return str;
        char[] arr = str.toCharArray();
        swap(arr, i, j);
        return new String(arr);
    }
    public static void swap(char[] str, int i, int j)
    {
        if (i == j) return;
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}// MyLibrary