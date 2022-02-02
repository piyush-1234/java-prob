package FirstJava;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "aavvevvak";
        isPalindrome(str);
    }

    static boolean isPalindrome(String str)
    {
        int i =0;
        int start = i;
        int end = str.length() - i - 1;
         while(start<=end)
         {
           if(str.charAt(start) == str.charAt(end))
           {
               start = start+1;
               end= end-1;
           }else
           {
               System.out.println("string is not palindrome");
               return false;
           }
         }
         System.out.println(true);
         return true;
    }
}
