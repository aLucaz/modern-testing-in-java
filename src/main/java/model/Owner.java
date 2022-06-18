package model;

import lombok.Data;

@Data
public class Owner {
    private Long id;
    private String firstName;
    private String lastName;
    private String dni;
    private String phone;
    private String alternativePhone;
}
