package array;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            digits[i] = digits[i] + 1;
            if(digits[i] >= 10){
                digits[i] -= 10;
                if(i == 0){
                    int[] a = new int[digits.length + 1];
                    a[0] = 1;
                    for(int j = 1; j < a.length; j++){
                        a[j] = digits[j - 1];
                    }
                    return a;
                }
            }
            else{
                return digits;
            }
        }
        return digits;
    }
}
