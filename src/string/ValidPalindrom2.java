package string;

public class ValidPalindrom2 {

    public static void main(String[] args) {
        System.out.println(isValidPalindrom("cbbcc"));
    }
    public static boolean isValidPalindrom(String s){
        boolean isValid=true;
        int l=0;
        int r=s.length()-1;
        while(l<r){
          if(s.charAt(l) != s.charAt(r)){

               return subPalindrom(s,l+1,r) || subPalindrom(s,l,r-1);
          }
          l++;
          r--;
        }
        return isValid;
    }
    public static boolean subPalindrom(String s, int l, int r){
        while(l<r){
            if(s.charAt(l++) != s.charAt(r--)){
                return false;
            }
        }
        return true;
    }
}
