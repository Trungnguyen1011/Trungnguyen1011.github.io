
import java.util.ArrayList;

import java.util.List;

public class MatchUp {

    public Long getFactorial(Integer number) {
        Long result = 1L;
        if (number == 0 || number == 1) {
            return result;
        } else {
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }

    // failed
    public void matchUp(String[] team) {
        List<String> temp = new ArrayList<String>();
        Long cnk = (getFactorial(team.length) / (getFactorial(team.length - 2) * getFactorial(2))); // getFactorial(5) =
                                                                                                    // 5!
        System.out.println("Số cặp đấu có thể sắp xếp: " + cnk);
        for (int i = 1; i < team.length; i++) {

            for (int j = 0; j < team.length; j++) {
                if (!temp.contains(team[i]) && !temp.contains(team[j]) && j != i) {

                    temp.add(team[i]);
                    temp.add(team[j]);
                    System.out.print("{" + team[i] + " - " + team[j] + "}");
                    for (int k = 0; k < team.length; k++) {
                        for (int l = 0; l < team.length; l++) {
                            if (!temp.contains(team[l]) && !temp.contains(team[k]) && k != l) {
                                temp.add(team[k]);
                                temp.add(team[l]);
                                System.out.print(" {" + team[l] + " - " + team[k] + "}");

                            } else {
                                continue;
                            }

                        }

                    }

                } else {
                    continue;

                }

            }

            System.out.println("");
            temp.clear();
        }
    }

}