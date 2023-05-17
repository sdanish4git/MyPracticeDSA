package string;

public class CountCharFrequency {
    public static void main(String[] args) {
        String s="sssaaabbbcccc";
        String output=countFrequency(s);
        System.out.println(output);
    }

    private static String countFrequency(String s) {
        StringBuilder output=new StringBuilder();
        char currChar=s.charAt(0);
        int count=0;
        for(int i=1;i<s.length();i++){
            if(currChar == s.charAt(i)){
                count++;
            }else{
                output.append(currChar);
                output.append(count+1);
                currChar=s.charAt(i);
                count=0;
            }
        }
        output.append(currChar);
        output.append(count+1);
    return output.toString();
    }
}
