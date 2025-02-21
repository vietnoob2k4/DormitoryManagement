package com.example.DorminatoryManagement.utils.responsecode;

import java.time.LocalDate;

public enum ErrorCode implements ResponseCode{
    BAD_CREDENTIAL(1000, "Tài khoản hoặc mật khẩu không hợp lệ"),
    USER_NOT_FOUND(1001, "Không tìm thấy người dùng"),
    USERNAME_ALREADY_EXISTS(1002, "Tên tài khoản đã tồn tại"),
    CCCD_IN_USE(1003, "Cccd đã đuợc sử dụng"),
    INVALID_OLD_PASSWORD(1005, "Sai mật khẩu cũ"),
    INVALID_EMAIL(1006, "Email không đúng định dạng"),
    ADMIN_REQUIRED(1007, "Bạn đang cố gắng cập nhật một số trường cần quyền Admin!"),
    ADMIN_USERNAE_CANT_CHANGE(1008, "Admin không thể sửa username"),
    INVALID_DOB(1009, "Năm sinh phải nằm giữa " + LocalDate.now().minusYears(50).getYear() + " và " + LocalDate.now().minusYears(18).getYear() + " (tối thiểu 18 tuổi)"),
    INACTIVE_ACCOUNT(1010, "Tài khoản đã bị khoá"),
    MULTIPLE_LOGIN(1011, "Tài khoản của bạn đã được đăng nhập từ một nơi khác"),
    NO_DEPARTMENT(1012, "Bạn chưa được phân vào phòng ban nào"),
    MULTIPLE_LOGIN_CONFIRMATION(1013, "Tài khoản đang được sử dụng, bạn có chắc chắn muốn đăng nhập vào?"),

    NOT_FOUND_ID(1016,"Không tìm thấy Id"),
    INVALID_EMAIL_ADDRESS(1017, "Không tìm thấy địa chỉ email"),
    EMAIL_AUTHENTICATION_FAILED(1018, "Lỗi xác thực với máy chủ email"),
    UNVERIFIED_EMAIL(1019, "Email chưa được xác thực"),
    INVALID_DATA_TYPE(1020,"Nhập sai kiểu dữ liệu"),
    INVALID_WORKDAY(1023,"Nhập sai dữ liệu ngày công"),
    INTERNAL_SERVER_ERROR(3016,"Lỗi"),
    EXISTED(1022,"Đối tượng đã tồn tại"),
    INVALID_PROPERTY_VALUE(1024,"Đối tượng không tồn tại"),
    SALARY_NOT_FOUND(1025,"không tìm thấy salary"),
    SALARY_PERIOD_NOT_FOUND(1026,"không tìm thấy kỳ lương"),
    WORKDAY_INVALID(1027,"Chưa có ngày công"),
    INVALID_PERIOD(1028, "Lỗi kỳ lương"),
    INVALID_TOKEN(2001, "Token không hợp lệ"),
    EXPIRED_TOKEN(2002, "Hết phiên đăng nhập"),
    INVALID_SIGNATURE(2003, "Token không an toàn"),
    DEPARTMENT_NOT_FOUND(3001, "Không tìm thấy department"),
    UNSUCCESSFUL(400, "Không thành công"),
    INVALID_NAME(4001,"Tên không hợp lệ"),
    INVALID_BUDGET(4002,"Lương phải là số nguyên dương"),
    EMPLOYEE_NOTFOUND(4004,"không tìm tấy nhân viên"),
    INVALID_DEPARTMENT(4005,"bộ phận không hợp lệ"),
    INVALID_SALARY(4006,"Bảng Lương không hợp lệ"),
    SALARY_DETAILS_NOT_FOUND(4007,"không tìm thấy chi tiết bảng lương"),
    DUPLICATED(4008,"nhân viên này đã tồn tại trong bảng lương"),
    EMAIL_DUPLICATED(4011,"email naỳ đã được sử dụng"),
    EMPLOYEE_ALREADY_HAVE_A_DEPARTMENT(4012,"Nhân viên đã được đăng kí bộ phận"),
    EXPORT_ERROR(4013,"Lỗi khi xuất file excel"),
    IMPORT_ERROR(4014,"Lỗi khi nhập file excel"),
    CCCD_IS_USED(4015,"căn cước công dân này  đã được sử dụng"),
    INVALID_CCCD(4014,"căn cước công dân không hợp lệ"),
    INVALID_REQUEST(4015,"request không hợp lệ")
    ;
    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
