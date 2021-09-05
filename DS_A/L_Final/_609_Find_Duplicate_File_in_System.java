import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _609_Find_Duplicate_File_in_System {
    public static void main(String[] args) {
        String[] path = { "root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)",
                "root 4.txt(efgh)" };

        System.out.println(Solution.findDuplicate(path));
        System.out.println("Done!");
    }

    public class Solution {
        public static List<List<String>> findDuplicate(String[] paths) {
            Map<String, List<String>> duplicatedValue = new HashMap<>();
            List<List<String>> result = new ArrayList<List<String>>();
            for (int i = 0; i < paths.length; i++) {
                String[] getFileName = paths[i].split(" ");
                String root = getFileName[0] + "/";
                for (int j = 1; j < getFileName.length; j++) {
                    String[] getValues = getFileName[j].split("\\(");
                    getValues[1] = getValues[1].replace(")", "");

                    if (duplicatedValue.get(getValues[1]) == null) {
                        List<String> list = new ArrayList<>();
                        list.add(root + getValues[0]);
                        duplicatedValue.put(getValues[1], list);
                        // System.out.println("Debug!");
                    } else {
                        List<String> list = duplicatedValue.get(getValues[1]);
                        list.add(root + getValues[0]);
                        duplicatedValue.put(getValues[1], list);

                    }
                }

            }
            for (List<String> i : duplicatedValue.values()) {
                if (i.size() != 1) {
                    result.add(i);
                }

            }

            return result;
        }
    }
}
