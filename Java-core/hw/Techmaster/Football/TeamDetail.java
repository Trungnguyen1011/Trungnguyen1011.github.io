import java.util.Arrays;
import java.util.List;

public class TeamDetail {
    public void manUtd() {
        Team manU = new Team("Manchester United", "Old Traford", "Ole Gunnar Solskjær", 1878);
        System.out.println(manU);
        Player[] players = new Player[11];
        players[0] = new Player("David de Gea", 1, Position.GOALKEEPER);
        players[1] = new Player("Victor Lindelof", 2, Position.DEFENDER);
        players[2] = new Player("Harry Maguire", 5, Position.DEFENDER);
        players[3] = new Player("Luke Shaw", 23, Position.DEFENDER);
        players[4] = new Player("Phil Jones", 4, Position.DEFENDER);
        players[5] = new Player("Juan Mata", 8, Position.MIDFIELDER);
        players[6] = new Player("Paul Pogba", 6, Position.MIDFIELDER);
        players[7] = new Player("Nemanja Matic", 31, Position.MIDFIELDER);
        players[8] = new Player("Marcus Rashford", 10, Position.FORWARDER);
        players[9] = new Player("Edison Cavani", 7, Position.FORWARDER);
        players[10] = new Player("Anthony Martial", 11, Position.FORWARDER);

        List<Player> list = Arrays.asList(players);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("");

    }

    public void bayern() {
        Team bayern = new Team("Bayern München", "Allianz Arena", "Hans-Dieter Flick", 1900);
        System.out.println(bayern);
        Player[] players = new Player[11];
        players[0] = new Player("Manuel Neuer", 1, Position.GOALKEEPER);
        players[1] = new Player("Jerome Boateng", 17, Position.DEFENDER);
        players[2] = new Player("Javi Martinez", 8, Position.DEFENDER);
        players[3] = new Player("David Alaba", 27, Position.DEFENDER);
        players[4] = new Player("Kingsley Coman", 29, Position.MIDFIELDER);
        players[5] = new Player("Serge Gnabry", 7, Position.MIDFIELDER);
        players[6] = new Player("Leroy Sane", 10, Position.MIDFIELDER);
        players[7] = new Player("Douglas Costa", 11, Position.MIDFIELDER);
        players[8] = new Player("Alphonso Davies", 19, Position.FORWARDER);
        players[9] = new Player("Thomas Muller", 25, Position.FORWARDER);
        players[10] = new Player("Robert Lewandowski", 9, Position.FORWARDER);

        List<Player> list = Arrays.asList(players);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("");
    }

    public void real() {
        Team real = new Team("Real Madrid", "Santiago Bernabéu", "Zinédine Zidane", 1902);
        System.out.println(real);
        Player[] players = new Player[11];
        players[0] = new Player("Thibaut Courtois", 1, Position.GOALKEEPER);
        players[1] = new Player("Marcelo", 12, Position.DEFENDER);
        players[2] = new Player("Raphael Varane", 5, Position.DEFENDER);
        players[3] = new Player("Sergio Ramos", 4, Position.DEFENDER);
        players[4] = new Player("Eden Hazrad", 7, Position.MIDFIELDER);
        players[5] = new Player("Isco", 22, Position.MIDFIELDER);
        players[6] = new Player("Luka Modric", 10, Position.MIDFIELDER);
        players[7] = new Player("Toni Kroos", 8, Position.MIDFIELDER);
        players[8] = new Player("Marco Asensio", 11, Position.MIDFIELDER);
        players[9] = new Player("Lucas Vazquez", 17, Position.FORWARDER);
        players[10] = new Player("Karim Benzema", 9, Position.FORWARDER);

        List<Player> list = Arrays.asList(players);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("");
    }

    public void liverpool() {
        Team liverpool = new Team("Liverpool", "Anfield", "Jürgen Klopp", 1892);
        System.out.println(liverpool);
        Player[] players = new Player[11];
        players[0] = new Player("Alisson Becker", 1, Position.GOALKEEPER);
        players[1] = new Player("Virgil van Dijk", 4, Position.DEFENDER);
        players[2] = new Player("Alexander-Arnold", 66, Position.DEFENDER);
        players[3] = new Player("Andrew Robertson", 26, Position.DEFENDER);
        players[4] = new Player("Joel Matip", 32, Position.DEFENDER);
        players[5] = new Player("Jordan Henderson", 14, Position.MIDFIELDER);
        players[6] = new Player("Alex Chamberlain", 15, Position.MIDFIELDER);
        players[7] = new Player("Xherdan Shaqiri", 23, Position.MIDFIELDER);
        players[8] = new Player("Mohamed Salah", 11, Position.FORWARDER);
        players[9] = new Player("Sadio Mane", 10, Position.FORWARDER);
        players[10] = new Player("Thiago Alcantara", 6, Position.FORWARDER);

        List<Player> list = Arrays.asList(players);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("");
    }

    public void barca() {
        Team barca = new Team("Barcelona", "Camp Nou", "Ronald Koeman", 1899);
        System.out.println(barca);
        Player[] players = new Player[11];
        players[0] = new Player("Marc-Andre ter Stegen", 1, Position.GOALKEEPER);
        players[1] = new Player("Gerard Pique", 3, Position.DEFENDER);
        players[2] = new Player("Samuel Umtiti", 23, Position.DEFENDER);
        players[3] = new Player("Jordi Alba", 18, Position.DEFENDER);
        players[4] = new Player("Sergio Busquets", 5, Position.MIDFIELDER);
        players[5] = new Player("Miralem Pjanic", 8, Position.MIDFIELDER);
        players[6] = new Player("Philippe Coutinho", 14, Position.MIDFIELDER);
        players[7] = new Player("Antoine Griezmann", 7, Position.FORWARDER);
        players[8] = new Player("Ansu Fati", 22, Position.FORWARDER);
        players[9] = new Player("Ousmane Dembele", 11, Position.FORWARDER);
        players[10] = new Player("Lionel Messi", 10, Position.FORWARDER);

        List<Player> list = Arrays.asList(players);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("");
    }
}
