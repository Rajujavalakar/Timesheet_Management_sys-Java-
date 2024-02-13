package com.in.Timesheet.dto;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name ="Adminpage")
public class AdminDto {

    @Id
    @GeneratedValue
    @Column(name = "MANAGER_ID", unique = true, nullable = false)
private long managerId;
}
