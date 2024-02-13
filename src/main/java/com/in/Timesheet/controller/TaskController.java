package com.in.Timesheet.controller;

import com.in.Timesheet.dto.TaskDto;
import com.in.Timesheet.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("nextpage")
    public TaskDto saveTaskDto(@RequestBody TaskDto taskDto) {
    return taskService.saveTaskDto(taskDto);
    }

}
