class Solution {
    public int addDigits(int num) {
        int dr = 0;
        while (num > 0) {
            dr += num % 10;
            num = num / 10;
            
            if (num == 0 && dr > 9) {
                num = dr;
                dr = 0;  
            }    
        }     
        return dr;
    }
}