package elementary.string;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder statement = new StringBuilder();
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='0'&&s.charAt(i)<='9')){
                statement.append(s.charAt(i));
            }
        }
        int i = 0, j = statement.length() - 1;
        while(i < statement.length()){
            if(statement.charAt(i) == statement.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsPalindrome isPalindrome = new IsPalindrome();
        isPalindrome.isPalindrome("Pxsuf,98");
    }
}
