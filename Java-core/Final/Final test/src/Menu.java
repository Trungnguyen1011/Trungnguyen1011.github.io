public class Menu {
    
    public static void mainMenu(){
        System.out.println("Lựa chọn: ");
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.println("0 - Thoát chương trình ");
        System.out.println("Lựa chọn của bạn là: ");
    }

    
    public static void loginMenu(){
        
        System.out.println("Mời chọn tiện ích: ");
        System.out.println("1 - Thay đổi username  ");
        System.out.println("2 - Thay đổi email ");
        System.out.println("3 - Thay đổi mật khẩu ");
        System.out.println("4 - Đăng xuất");
        System.out.println("0 - Thoát chương trình ");

    }
    
    public static void loginFailMenu(){ 
        System.out.println("Nhập sai password:");
        System.out.println("1 - Đăng nhập lại ");
        System.out.println("2 - Quên mật khẩu ");

       

    }

}
