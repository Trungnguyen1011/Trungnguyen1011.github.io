

public class _394_Decode_String {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        String s2 = "3[z]2[2[y]pq4[2[jk]e1[f]]]ef";
        String result = decodeString(s2);
        System.out.println(result);
        System.out.println("zzzyypqjkjkefjkjkefjkjkefjkjkefyypqjkjkefjkjkefjkjkefjkjkefef");
    }

    public static String decodeString(String s) {
        return decoding(s, 0).getResult();
    }

   
    public static Pair<Integer,String> decoding(String s, int i) {

        String result = "";
        String k = "";
        String repeatS = "";

        while (i < s.length()) {
            if (s.charAt(i) < 97) {
                while (s.charAt(i) != '[' && s.charAt(i) != ']') {
                    k += s.charAt(i);
                    i++;
                }
                if (s.charAt(i) == '[') {
                    i++;
                }
                Pair<Integer,String> temp = decoding(s, i);
                repeatS += temp.getResult();
                i =  temp.getIndex();
               
                
                if (s.charAt(i) == ']') {
                    i++;
                }
                if (k != "") {
                    for (int j = 1; j <= Integer.parseInt(k); j++) {
                        result += repeatS;
                    }
                }
               
            } else {
                result += s.charAt(i);
                i++;
            }
            if (i > s.length() - 1) {
                return new Pair<Integer,String>(i,result);
            } else if (s.charAt(i) == ']') {
                return new Pair<Integer,String>(i,result);
            }
            k = "";
            repeatS = "";
        }
      
        return new Pair<Integer,String>(i,result);
    }
    static class Pair<Integer,String> {
        private final int index;
        private final String result;
    
        public Pair(int i, String s) {
            this.index = i;
            this.result = s;
        }
    
        public int getIndex() {
            return index;
        }
    
        public String getResult() {
            return result;
        }
    }
   
}
