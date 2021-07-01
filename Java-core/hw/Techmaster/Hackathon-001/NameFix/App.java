import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Logic logic = new Logic();
        List<String> fullNames = new ArrayList<String>();
        fullNames.add("Nguyễn  hữu tiến ");
        fullNames.add("  Lê vĂn tốt ");
        fullNames.add("nguyễn việt ANh");
        fullNames.add("  Hoàng trọng  kHoa");
        fullNames.add(" ĐàO việt phong");
        fullNames.add("Nguyễn  minh an ");
        fullNames.add("  Nguyễn tHành trung ");
        fullNames.add("chử văn LOng");
        fullNames.add("  Dương văn  tHắng");
        fullNames.add(" NguyễN công khanh");
        logic.nameNormalize(fullNames);
    }
}