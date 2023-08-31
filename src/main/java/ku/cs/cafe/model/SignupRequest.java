package ku.cs.cafe.model;

import lombok.Data;

@Data
public class SignupRequest {
    private String username;
    private String password;
    private String name;
}
