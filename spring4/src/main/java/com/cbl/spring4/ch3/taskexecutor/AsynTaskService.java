package com.cbl.spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
//@Async
public class AsynTaskService {
    @Async
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步："+i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1:"+(i+1));
    }
}
