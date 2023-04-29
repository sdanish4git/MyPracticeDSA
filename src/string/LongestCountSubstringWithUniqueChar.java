package string;

public class LongestCountSubstringWithUniqueChar {
    public static void main(String[] args) {
        String s="abcadeafga";
       int count= substringCount(s);
        System.out.println(count);
    }

    public static int substringCount(String input){
        int count=0;
        StringBuilder subStr=new StringBuilder();
        for(int i=0;i<input.length();i++){
            subStr.append(input.charAt(i));
            for(int j=0;j<input.length();j++){
                if(subStr.indexOf(String.valueOf(input.charAt(j))) != -1){
                    count=Math.max(count,subStr.length());
                    subStr=new StringBuilder();
                }else{
                    subStr.append(input.charAt(j));
                }
            }
            subStr=new StringBuilder();
        }
        return count;
    }
}
