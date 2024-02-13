package com.in.Timesheet.repository;

import com.in.Timesheet.dto.TimesheetDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimesheetRepository extends JpaRepository<TimesheetDto, Integer> {
}
