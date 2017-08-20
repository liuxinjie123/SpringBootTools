package com.crazy.dream.service.impl;

import com.crazy.dream.service.AsyncTaskService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskServiceImpl implements AsyncTaskService {
    @Async
    public void executeAsyncTask(Integer i) {
        System.out.println("执行异步任务：" + i);
    }

    @Async
    public void execcuteAsyncTaskPlus(Integer i) {
        System.out.println("执行异步任务+1：" + (i+1));
    }
}
