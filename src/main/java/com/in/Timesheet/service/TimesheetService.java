package com.in.Timesheet.service;

import com.in.Timesheet.dto.TaskDto;
import com.in.Timesheet.dto.TimesheetDto;
import com.in.Timesheet.repository.TaskRepository;
import com.in.Timesheet.repository.TimesheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimesheetService {

    @Autowired
    private TimesheetRepository timesheetRepository;

    public TimesheetDto saveTimesheetDto(TimesheetDto timesheetDto)
    {
        return timesheetRepository.save(timesheetDto);
    }

    }