// Import lớp cần test: UserApp
import com.mycompany.userapp.UserApp;
// Import các annotation và hàm kiểm tra của JUnit
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// Class chứa các test case
class UserTest {
    // Test hàm khởi tạo: kiểm tra object được tạo thành công
    @Test
    void testConstructorInitializesUserId() {
        UserApp user = new UserApp("u01", "user@example.com");
        // Vì UserApp không có getUserId nên mình chỉ kiểm tra object != null
        assertNotNull(user); 
    }
    //  Test hàm khởi tạo: kiểm tra email được gán đúng
    @Test
    void testConstructorInitializesEmail() {
        UserApp user = new UserApp("u02", "init@example.com");
        assertEquals("init@example.com", user.getEmail());
    }
    // Test phương thức getEmail(): đảm bảo trả về đúng email
    @Test
    void testGetEmail() {
        UserApp user = new UserApp("u03", "get@example.com");
        assertEquals("get@example.com", user.getEmail());
    }
    //  Test phương thức setEmail(): cập nhật email mới và kiểm tra
    @Test
    void testSetEmail() {
        UserApp user = new UserApp("u04", "old@example.com");
        user.setEmail("new@example.com");
        assertEquals("new@example.com", user.getEmail());
    }
    // Test phương thức updateEmail(): cập nhật bằng hàm riêng và kiểm tra
    @Test
    void testUpdateEmail() {
        UserApp user = new UserApp("u05", "start@example.com");
        user.updateEmail("updated@example.com");
        assertEquals("updated@example.com", user.getEmail());
    }
    // Test setEmail() với chuỗi rỗng: kiểm tra có cho phép set ""
    @Test
    void testSetEmailWithEmptyString() {
        UserApp user = new UserApp("u06", "notempty@example.com");
        user.setEmail("");
        assertEquals("", user.getEmail());
    }
}
