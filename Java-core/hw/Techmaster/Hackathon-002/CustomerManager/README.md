Câu 1: Viết chương trình cho phép nhập số bất kỳ và kiểm tra xem số đó có là số nguyên tố hay không. Mỗi lần nhập một số sẽ thông báo kết quả ngay lập tức. Việc nhập sẽ thực hiện liên tục đến khi nhập Q hoặc X thì thoát chương trình

Câu 2: Viết chương trình quản lý thông tin khách hàng biết thông tin khách hàng bao gồm: Mã khách hàng (Số cmt hoặc cccd), tên, ngày sinh, giới tính (Sử dụng enum), quê quán, số điện thoại, email
Tạo menu thực hiện các công việc:
1: Xem thông tin toàn bộ khách hàng (Thông tin khách hàng có thể lấy từ đọc file)
2: Xem thông tin khách hàng nữ hoặc xem thông tin khách hàng nam
3: Thêm thông tin 1 khách hàng vào danh sách. Lưu ý: mã khách hàng thêm mới phải không được trùng với những mã khách hàng đã có trong danh sách. Nếu mã khách hàng bị trùng, dừng việc thêm thông tin khách hàng
4: Tìm kiếm thông tin khách hàng dựa vào mã. Nếu tìm được thông tin khách hàng có thể tiến hành sửa thông tin của khách hàng đó hoặc xoá thông tin khách hàng, hoặc không làm gì cả. Nếu không thấy thông tin khách hàng thông báo không có khách hàng này
0: Thoát chương trình

Điểm cộng: Có Class Validate để thực hiện check mã khách hàng có đúng không (mã khách hàng có 9 hoặc 12 số), số điện thoại có 10 hoặc 11 số, email chuẩn (sử dụng regex)