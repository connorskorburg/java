public class StringManipulator {
    public String trimAndConcat(String val1, String val2) {
        return val1.trim() + val2.trim();
    }
    public Integer getIndexOrNull(String s, char c) {
        Integer result = s.indexOf(c);
        if ( result == -1 ) {
            return null;
        }  
        else {
            return result;
        }
    }
    public Integer getIndexOrNull(String s, String c) {
        Integer result = s.indexOf(c);
        if ( result == -1 ) {
            return null;
        }  
        else {
            return result;
        }
    }
    public String concatSubString(String val1, int a, int b, String val2 ) {
        String new_str = val1.substring(a,b);
        String result = new_str + val2;
        return result;
    }
}