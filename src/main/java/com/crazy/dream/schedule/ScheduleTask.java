package com.crazy.dream.schedule;

import com.crazy.dream.ApplicationRun;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduleTask {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationRun.class);

    @Scheduled(fixedDelay = 10000)
    public void fixedDelayTask() {
        logger.info(" This is fixed Delay task.");
    }

    @Scheduled(fixedRate = 30000)
    public void fixedRateTask() {
        logger.info(" This is fixed Rate task.");
    }

    @Scheduled(cron = "0 50 11 ? * *")
    public void cronTask() {
        logger.info(" This is cron Task.");
    }
}
