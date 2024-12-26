
public class MyLibrary
{
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