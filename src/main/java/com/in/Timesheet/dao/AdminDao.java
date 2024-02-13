package com.in.Timesheet.dao;

import com.in.Timesheet.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDao {

    @Autowired
    AdminRepository adminRepository;
}
