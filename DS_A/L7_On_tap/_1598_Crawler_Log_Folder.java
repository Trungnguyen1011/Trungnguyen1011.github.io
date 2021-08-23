public class _1598_Crawler_Log_Folder {
    public static void main(String[] args) {

    }

    public int minOperations(String[] logs) {
        int min = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                if (min == 0) {
                    continue;
                } else {
                    min--;
                }
            } else if (log.equals("./")) {
                continue;
            } else {
                min++;
            }
        }
        return min;
    }
}
