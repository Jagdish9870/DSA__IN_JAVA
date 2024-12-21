public class palindromeOrNot {

    static private boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char l=s.charAt(left);
            char r=s.charAt(right);
            if(!Character.isLetterOrDigit(l) )
            left++;
            else if(!Character.isLetterOrDigit(r) )
            right--;
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r))
            return false;
            else{
                left++;
                right--;
            }
        }
        return true;

    }
    public static void main(String[] args) {
       String s="ajjaa";
       boolean ans=isPalindrome(s);

       if(ans==true)
       System.out.println("palindrome");
       else
       System.out.println("not");


    }
    
}
