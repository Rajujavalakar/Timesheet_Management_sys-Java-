package com.in.Timesheet.repository;

import com.in.Timesheet.dto.TaskDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskDto,Long> {
}


