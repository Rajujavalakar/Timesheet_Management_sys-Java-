package com.in.Timesheet.dto;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="webapp")
public class TimesheetDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer serial_no;
    private String email;
    private String password;

    public Integer getSerial_no() {
        return serial_no;
    }
    public void setSerial_no(Integer serial_no) {
        this.serial_no = serial_no;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
