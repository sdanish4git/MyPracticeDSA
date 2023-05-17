package string;

public class ConvertStrToNumber {

    public static void main(String[] args) {
        String s="123";
        int num=convertStrToNumber(s);
        System.out.println(num);
    }

    public static int convertStrToNumber(String s){
        int num=0;
        for(int i=0;i<s.length();i++){
            int ascii=(s.charAt(i)-'1'+1);
            num=num*10+ascii;
        }
        return num;
    }
}
