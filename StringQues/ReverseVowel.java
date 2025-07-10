package StringQues;

public class ReverseVowel {
    public static void reverseVowels(String s){
        char[] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            while(arr[i]!='a' && arr[i]!='e' && arr[i]!='i' && arr[i]!='o' && arr[i]!='u' && arr[i]!='A' && arr[i]!='E' && arr[i]!='I' && arr[i]!='O' && arr[i]!='U'){
                i++;
            }
            while(arr[j]!='a' && arr[j]!='e' && arr[j]!='i' && arr[j]!='o' && arr[j]!='u' && arr[j]!='A' && arr[j]!='E' && arr[j]!='I' && arr[j]!='O' && arr[j]!='U'){
                j--;
            }
            if(i>=j){
                break;
            }
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
        for(char ch: arr){
            System.out.print(ch);
        }

    }
    public static void main(String[] args) {
        String s = "hello";
        reverseVowels(s);
    }
    
}
