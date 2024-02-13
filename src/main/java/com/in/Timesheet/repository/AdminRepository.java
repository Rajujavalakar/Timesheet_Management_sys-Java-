package com.in.Timesheet.repository;

import com.in.Timesheet.dto.AdminDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminDto, Long> {
}
