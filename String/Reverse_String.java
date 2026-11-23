class Solution {
    public void reverseString(char[] s) {
        int right = 0;
        int left = s.length-1;
        while(right<left){
            int temp = s[right];
            s[right] = s[left];
            s[left] = (char)temp;
            right++;
            left--;
        }
        
    }
}