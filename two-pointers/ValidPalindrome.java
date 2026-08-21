class ValidPalindrome{
    public boolean validPalindrome(String s){

        int i = 0, j = s.length()-1;

        while(i<j){
            while(i < j && !isAlphaNum(s.charAt(i))) {
                i++;
            }
            while(j > i && !isAlphaNum(s.charAt(j))) {
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;

    }

    public boolean isAlphaNum(char c){
        return (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9');
    }
}