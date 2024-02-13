package com.in.Timesheet.dao;

import com.in.Timesheet.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TaskDao {

    @Autowired
    TaskRepository taskRepository;


}
