import java.util.List;

public class Logic {
    public void nameNormalize(List<String> fullNames) {
        for (int i = 0; i < fullNames.size(); i++) {
            String name = "";
            String temp = fullNames.get(i);
            temp = temp.trim().toLowerCase();

            for (int j = 0; j < temp.length(); j++) {
                if (j == 0 || temp.charAt(j-1) == ' ') {
                    if (temp.charAt(j) == ' ') { continue; } else {name += Character.toUpperCase(temp.charAt(j));}
                    
                } else {name += temp.charAt(j);}
            
            }
            System.out.println(name);
        }
    }
}