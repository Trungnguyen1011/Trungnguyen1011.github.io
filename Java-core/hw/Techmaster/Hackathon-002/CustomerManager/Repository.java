
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repository {
    List<Customer> customers = new ArrayList<Customer>();
    static boolean isContinue = true;

    public void getAll() {
        if (customers.size() != 0) {
        customers.forEach(customer -> System.out.println(customer)); } else { 
            System.out.println("Hiện chưa có dữ liệu khách hàng nào.");
        }
    }

    public void getFemale() {
        customers.stream().filter(customer -> customer.getGender() == Gender.FEMALE)
                .forEach(customer -> System.out.println(customer));
    }

    public void getMale() {
        customers.stream().filter(customer -> customer.getGender() == Gender.MALE)
                .forEach(customer -> System.out.println(customer));
    }

    public Gender GenderChoice(int i) {
        Gender[] gender = { Gender.MALE, Gender.FEMALE };
        return gender[i - 1];
    }

    public Customer dataInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập id: ");
        String id = input.nextLine();

        System.out.println("Nhập tên: ");
        String name = input.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String birthday = input.nextLine();

        System.out.println("Chọn giới tính:\n 1: Nam - 2: Nữ. ");
        int gd = input.nextInt();
        while (gd != 1 && gd != 2) {
            System.out.println("Mời chọn lại. ");
            gd = input.nextInt();
        }
        Gender gender = GenderChoice(gd);
        String a = input.nextLine();
        System.out.println("Nhập quê quán: ");
        String places = input.nextLine();
        System.out.println("Nhập số điện thoại");
        String mobile = input.nextLine();
        System.out.println("Nhập email: ");
        String email = input.nextLine();
        return new Customer(id, name, birthday, gender, places, mobile, email);
    }

    public void addNew(Customer customer) {
        boolean isExisted = isExisted(customer.getId());
        if (!isExisted)
            customers.add(customer);
    }

    public void remove(Customer customer) {
        customers.remove(customer);
    }

    public boolean isExisted(String id) {
        long count = customers.stream().filter(customer -> customer.getId().equals(id)).count();
        if (count > 0) {
            return true;
        } else {
            return false;
        }

    }

    public void searchById(String id) {
        boolean isExisted = isExisted(id);
        if (isExisted) {
            for (Customer customer : customers) {
                if (customer.getId().equals(id)) {
                    isContinue = true;
                    while (isContinue) {
                        editData(customer);
                    }
                }
            }
        } else {
            System.out.println("Không có khách hàng này.");
        }

    }

    public void editData(Customer customer) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dữ liệu khách hàng hiện tại là: ");
        System.out.println(customer);
        editDataMenu();
        int choice = input.nextInt();
        String a = input.nextLine();
        switch (choice) {
            case 1:
                String id = input.nextLine();
                customer.setId(id);
                break;
            case 2:
                String name = input.nextLine();
                customer.setName(name);
                break;
            case 3:
                String birthday = input.nextLine();
                customer.setBirthday(birthday);
                break;
            case 4:
                System.out.println("Chọn giới tính:\n 1: Nam - 2: Nữ. ");
                int gd = input.nextInt();
                customer.setGender(GenderChoice(gd));
                a = input.nextLine();
                break;
            case 5:
                String places = input.nextLine();
                customer.setPlaces(places);
                break;
            case 6:
                String mobile = input.nextLine();
                customer.setMobile(mobile);
                break;
            case 7:
                String email = input.nextLine();
                customer.setEmail(email);
                break;
            case 8:
                remove(customer);
                break;
            case 9:
                isContinue = false;
                break;
            default:
                break;
        }

    }

    public void editDataMenu() {
        System.out.println("Chọn dữ liệu muốn sửa: ");
        System.out.println("1: id. ");
        System.out.println("2: tên. ");
        System.out.println("3: ngày sinh. ");
        System.out.println("4: giới tính.");
        System.out.println("5: quê quán.");
        System.out.println("6: số điện thoại.");
        System.out.println("7: email.");
        System.out.println("8: Xóa dữ liệu khách hàng.");
        System.out.println("9: Hoàn thành chỉnh sửa.");
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        boolean using = true;
        while (using) {
            System.out.println("1: Xem thông tin toàn bộ khách hàng.");
            System.out.println("2: Xem thông tin khách hàng theo giới tính");
            System.out.println("3: Thêm thông tin 1 khách hàng vào danh sách.");
            System.out.println("4: Tìm kiếm thông tin khách hàng dựa vào mã.");
            System.out.println("0: Thoát chương trình");
            int choice = scanner.nextInt();
            String a = scanner.nextLine();
            switch (choice) {
                case 1:
                    getAll();
                    break;
                case 2:
                    System.out.println("Chọn giới tính:\n 1: Nam - 2: Nữ. ");
                    int chosenGender = scanner.nextInt();
                    switch (chosenGender) {
                        case 1:
                            getMale();
                            break;
                        case 2:
                            getFemale();
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    addNew(dataInput());
                    break;
                case 4:
                    String keyId = scanner.nextLine();
                    searchById(keyId);
                    break;
                case 0:
                    using = false;
                    break;
                default:
                    break;
            }
        }
    }
}
