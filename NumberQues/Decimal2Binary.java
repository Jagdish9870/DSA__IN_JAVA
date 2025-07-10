package NumberQues;
public class Decimal2Binary {
	public String findDigitsInBinary(int A) {
	    
	    String binary = "";
	    
	    if (A == 0)
	        return "0";
	    
	    while (A != 0) {
	        int dig = A % 2;
	        binary = (dig == 1 ? "1" : "0") + binary;
	        A /= 2;
	    }
	    
	    return binary;
	    
	}
}

// or 
//public class Solution {
//     public String findDigitsInBinary(int A) {
        
//         return Integer.toBinaryString(A);
//     }
// }
