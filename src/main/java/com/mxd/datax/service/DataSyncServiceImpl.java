package com.mxd.datax.service;

import com.alibaba.datax.core.Engine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class DataSyncServiceImpl implements DataSyncService {
    @Value("${datax.home}")
    private String dataxHome;

    @Override
    public void execute(String jobConfig) {
        System.setProperty("datax.home", dataxHome);
        System.setProperty("now", LocalTime.now().toString());
        String[] dataxArgs = {"-job", dataxHome + "/job/" + jobConfig, "-mode", "standalone", "-jobid", "-1"};
        try {
            Engine.entry(dataxArgs);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
