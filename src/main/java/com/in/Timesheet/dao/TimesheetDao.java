package com.in.Timesheet.dao;

import com.in.Timesheet.dto.TimesheetDto;
import com.in.Timesheet.repository.TimesheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TimesheetDao {

    private final TimesheetRepository timesheetRepository;

    @Autowired
    public TimesheetDao(TimesheetRepository timesheetRepository) {
        this.timesheetRepository = timesheetRepository;
    }

    public TimesheetDto saveTimesheet(TimesheetDto timesheetDto) {
        return timesheetRepository.save(timesheetDto);
    }
}