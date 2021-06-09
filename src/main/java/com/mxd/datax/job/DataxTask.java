package com.mxd.datax.job;

import com.mxd.datax.service.DataSyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DataxTask {
    @Autowired
    private DataSyncService dataSyncService;
    /**
     * 每5分钟执行一次同步任务
     */
    @Scheduled(cron = "0 0/5 * * * ?")
    private void oaUserIncr() {
        dataSyncService.execute("demo.json");
    }
}
