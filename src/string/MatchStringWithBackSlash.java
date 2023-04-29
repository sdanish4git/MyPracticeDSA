package string;

public class MatchStringWithBackSlash {

    public static void main(String[] args) {
        String s1="ac##a";
        String s2="ac##a";
        //bruteForce(s1,s2);
        System.out.println(twoPointerApproach(s1,s2));
    }

    public static boolean twoPointerApproach(String s1, String s2){
        int p1=s1.length()-1;
        int p2=s2.length()-1;
        int backSlash=0;
        while(p1>=0 || p2>=0){
            if (s1.charAt(p1) == '#') {
                backSlash=backSlash+2;
                while(backSlash>0){
                    p1--;
                    if(p1>0 && s1.charAt(p1)=='#'){ backSlash +=2;}
                    backSlash--;
                }

            }
            if (s2.charAt(p2) == '#') {
                backSlash=backSlash+2;
                while(backSlash>0){
                    p2--;
                    if(p2>0 && s2.charAt(p2)=='#'){ backSlash +=2;}
                    backSlash--;
                }

            }
            if(p1>0 && p2>0 && s1.charAt(p1) != s2.charAt(p2)){
                return false;
            }else{
                p1--;
                p2--;
            }
        }

        return true;
    }

    public static void bruteForce(String s1,String s2){
        //in String # denotes one backslash
        if(buildString(s1).equals(buildString(s2))){
            System.out.println("String is Equal");
        }else{
            System.out.println("String is not Equal");
        }
    }
    public static String buildString(String s){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != '#' && sb.length()!=0){
                sb.deleteCharAt(sb.length()-1);
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
