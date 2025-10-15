package StreamQuestion;

public class PangramEx {
    public static boolean Ispangram(String s){
        if(s==null || s.isBlank()){
            return false;
        }
        long distinctAlphabetCount=s.toLowerCase().chars().filter(c->Character.isLetter(c)).distinct().count();
        return distinctAlphabetCount==26;
    }
    public static void main(String[] args) {
        String s="jack is dorsey";
        System.out.println(Ispangram(s));
    }
    
}
