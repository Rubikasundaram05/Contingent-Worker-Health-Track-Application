package com.example.demo.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
@Getter 
@Setter 

public class Worker {

    private long workerId;
    private String workerName;
    private String workerEmail;
    private String managerName;
    private String managerEmail;
    private String location;
    private LocalDate joinDate;

}
