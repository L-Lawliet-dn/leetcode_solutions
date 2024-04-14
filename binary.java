// class Solution {
//     public String addBinary(String a, String b) {
//         // convert the strings to integers, add them, then convert to binary and string

//         long a1 = 0;
//         long b1 = 0;

//         for (int i = 0; i < a.length(); i++) {

//             a1 = a1 + (long)Integer.parseInt(String.valueOf(a.charAt(i))) * (long) Math.pow(2, a.length() - i - 1);

//         }
//         for (int j = 0; j < b.length(); j++) {

//             b1 = b1 + (long)Integer.parseInt(String.valueOf(b.charAt(j))) * (long) Math.pow(2, b.length() - j - 1);

//         }

//         long ans = a1 + b1;

//         System.out.println(ans);

//         StringBuilder answer = new StringBuilder();

//         while (ans > 0) {

//             long rem = ans % 2;
//             ans = ans / 2;
//             answer.append(rem);
//         }
//         if (answer.toString().equals(""))
//             return "0";
//         return answer.reverse().toString();
//     }
// }

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0)
                carry += a.charAt(i--) - '0';
            if (j >= 0)
                carry += b.charAt(j--) - '0';
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }
}
