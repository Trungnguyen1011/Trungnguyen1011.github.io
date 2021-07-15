public class App {
    // Long id, String name, String age, String phone, String email, String salary,
    // Long overWorkTime
    public static void main(String[] args) {
        Database db = new Database();
        db.coders.add(new Coder(1L, "PVD", "19", "0123456789", "Pvd@vnindex.hose", "3900", 50L));
        db.coders.add(new Coder(2L, "CTG", "34", "0456789123", "Ctg@vnindex.hose", "13000", 10L));
        db.qCers.add(new QualityChecker(3L,"PVT","18","0789456123","Pvt@vnindex.hose","2250",100L));
        db.qCers.add(new QualityChecker(4L,"PVS","25","0321654978","Pvs@vnindex.hnx","9330",200L));

        db.coders.getAll();
        db.qCers.getAll();
    }

}