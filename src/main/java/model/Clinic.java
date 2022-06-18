package model;

import lombok.Data;

import java.util.List;

@Data
public class Clinic {
    private Long id;
    private String name;
    private List<Pet> patients;
    private List<Owner> owners;
}
