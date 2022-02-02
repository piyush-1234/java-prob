public class CheckiftheSentenceIsPangram {
    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        checkIfPangram(str);
    }

    static boolean checkIfPangram(String sentence) {
        char ch = 65;
        int sum = 0;
        for(int i=0; i<26; i++)
        {
            int ele = 0;
            for(int j=0; j<sentence.length(); j++)
            {
                boolean x=sentence.charAt(j) == Character.toLowerCase(ch);
                System.out.println(x);
                if(x)
                {
                    if(ele == 0)
                    {
                       ele = ele+1;
                    }
                }
            }
          System.out.println(ele);
            ch=(char) (ch+1);
            sum += ele;
        }
       System.out.println(sum);
        if(sum == 26)
        {
             return true;
        }
        return false;
    }
}
