import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingaRule {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("phone");
        str.add("blue");
        str.add("pixel");
        List<String> str1 = new ArrayList<>();
        str1.add("computer");
        str1.add("silver");
        str1.add("lenovo");
        List<String> str2 = new ArrayList<>();
        str2.add("phone");
        str2.add("gold");
        str2.add("iphone");
        List<List<String>> item = new ArrayList<>();
        item.add(str);
        item.add(str1);
        item.add(str2);


        String ruleKey = "color";
        String ruleValue = "silver";
        countMatches(item, ruleKey,ruleValue);
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
             
        
        int sum=0;
        for(int i=0; i<items.size(); i++)
        {
            int ele =0;
            int s = items.get(i).size();
                //    System.out.println(s);

            for(int j=0; j<s; j++)
            {
                String f = items.get(i).get(j);
                 System.out.println(f);
                System.out.println(ruleValue);
                String a=ruleValue.toLowerCase();
                String b=f.toLowerCase();
               boolean x = a==b;
                System.out.println(x);
                if(x)
                {
                  ele = ele+1;
                }
            }
            sum +=ele;
        }
        System.out.println(sum);
        return sum;
    }
}
