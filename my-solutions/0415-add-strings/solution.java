        class Solution {
        public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            // Get digit from num1, if available
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            // Get digit from num2, if available
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            
            // Calculate the sum of current digits and carry
            int sum = digit1 + digit2 + carry;
            
            // Update carry for the next iteration
            carry = sum / 10;
            
            // Append the last digit of the sum to the result
            res.append(sum % 10);
            
            // Move to the next digits
            i--;
            j--;
        }
        
        // The result is built in reverse order, so reverse it before returning
        return res.reverse().toString();
    }
}

