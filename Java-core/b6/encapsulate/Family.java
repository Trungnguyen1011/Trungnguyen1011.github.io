package encapsulate;

public class Family {
    public void simulate() {
        Mother mother = new Mother();
        Son son = new Son();
        // System.out.println(mother.fatherOfSon);
        System.out.println(son.savingMoney);
        System.out.println(son.herSon);
    }
}