
public class Logic {
    public String censorBadWords(String para) {
        String[] badWords = { "fuck", "sex", "rape", "shit", "bitch", "damn" };
        String[] theGoodOne = { "f*ck", "s*x", "r**e", "sh*t", "b*tch", "d*mn" };
        for (int i = 0; i < badWords.length; i++) {
            para = para.replace(badWords[i], theGoodOne[i]);

            if (i == badWords.length - 1) {
                break;
            }
        }
        return para;
    }
}