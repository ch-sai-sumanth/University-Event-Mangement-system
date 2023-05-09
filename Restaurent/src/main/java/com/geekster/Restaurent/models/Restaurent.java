package com.geekster.Restaurent.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Restaurent {

    private int restaurentId;

    private String restaurentName;

    private String restaurentAddress;

    private String phoneNumber;

    private String speciality;

    private int totalStaff;


}
