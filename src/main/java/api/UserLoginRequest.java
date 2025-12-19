package api;
//импортирую плагин lombok для уменьшения кода
import lombok.AllArgsConstructor;
import lombok.Data;
import org.openqa.selenium.WebDriver;

@Data
@AllArgsConstructor
public class UserLoginRequest {
    public String email;
    public String password;

//    public UserLoginRequest(String email, String password) {
//        this.email = email;
//        this.password = password;
//    }

}
