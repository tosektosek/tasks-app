package com.tosektosek.service;

import com.tosektosek.domain.Task;
import com.tosektosek.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> list() {
        return taskRepository.findAll();
    }

    public Task save(Task task) {
         return taskRepository.saveAndFlush(task);
    }
}
