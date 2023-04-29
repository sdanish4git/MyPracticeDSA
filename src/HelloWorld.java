import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
       /* System.out.println("Test");

        int a[]={1,2,4,5,6};

        for(int i=1;i<=a.length;i++){
            if(a[i-1] != i){
                System.out.println("Missing Number is "+(i));
                break;
            }
        }*/
        String s="aab##c#";
        String t="aaz##c#";
        System.out.println(s.charAt(40));
        List<Character> s1=new ArrayList<>();
        List<Character> s2=new ArrayList<>();

        for(int i=0;i<s.length();i++){
            if(s.equals("#") && !s1.isEmpty()){
                s1.remove(s.charAt(i-1));
            }else{
                s1.add(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++){
            if(t.equals("#") && !s2.isEmpty()){
                s2.remove(s.charAt(i-1));
            }else{
                s2.add(s.charAt(i));
            }
        }
        if(s1.equals(s2)){
            System.out.println("both are equal");
        }else{
            System.out.println("both are not equal");
        }

    }
}
