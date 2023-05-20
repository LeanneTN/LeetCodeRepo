package elementary.string;

public class MyAtoI {
    public int myAtoi(String s) {
        s = s.trim();
        boolean isPos = true;
        int i = 0;
        if(s.charAt(0) == '-') {
            isPos = false;
            i = 1;
        }
        int sum = 0;
        for(; i < s.length(); i++){
            int a = s.charAt(i) - '0';
            sum = sum * 10 + a;
        }
        if(!isPos)
            sum = -sum;
        if(sum > Math.pow(2,31) - 1)
            return (int)Math.pow(2,31) - 1;
        else if(sum < -Math.pow(2,31) && sum < 0){
            return -(int)Math.pow(2,31);
        }
        return sum;
    }
}
