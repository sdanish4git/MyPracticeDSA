package string;

public class PalindromCheck {
    public static void main(String[] args) {
        System.out.println(isPalindrom("mooo"));
    }

    public static boolean isPalindrom(String s){
        int l=0;
        int r=s.length()-1;
        while(l<=r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
