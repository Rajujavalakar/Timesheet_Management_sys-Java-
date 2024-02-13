package com.in.Timesheet.service;

import com.in.Timesheet.dto.TaskDto;
import com.in.Timesheet.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public TaskDto saveTaskDto(TaskDto taskDto)
    {
        return taskRepository.save(taskDto);
    }

}

