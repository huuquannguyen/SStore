package q.tiger.sstore.model;

import lombok.Data;

@Data
public class User {
    private String name;
    private String phone;
    private String address;
    private Account account;
}
