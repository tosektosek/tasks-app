package com.tosektosek.service;

import com.tosektosek.domain.Task;

import java.util.List;

public interface TaskService {

    List<Task> list();

    Task save(Task task);
}
