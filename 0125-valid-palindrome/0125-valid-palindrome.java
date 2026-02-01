class Solution {

        public boolean isPalindrome(String s) {
         int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            // skip non-alphanumeric (left)
            if (!isAlphaNumeric(l)) {
                left++;
                continue;
            }

            // skip non-alphanumeric (right)
            if (!isAlphaNumeric(r)) {
                right--;
                continue;
            }

            // normalize case (ASCII)
            if (l >= 65 && l <= 90) l = (char)(l + 32);
            if (r >= 65 && r <= 90) r = (char)(r + 32);

            // compare
            if (l != r) return false;

            left++;
            right--;
        }
        return true;
    }

    private boolean isAlphaNumeric(char c) {
        return (c >= 48 && c <= 57) ||   // digits
               (c >= 65 && c <= 90) ||   // uppercase
               (c >= 97 && c <= 122);    // lowercase
    }
        
        
        
}