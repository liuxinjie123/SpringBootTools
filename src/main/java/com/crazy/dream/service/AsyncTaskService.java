package com.crazy.dream.service;

import org.springframework.stereotype.Service;

@Service
public interface AsyncTaskService {
    public void executeAsyncTask(Integer i);

    public void execcuteAsyncTaskPlus(Integer i);
}
