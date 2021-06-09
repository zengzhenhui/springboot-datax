package com.mxd.datax;

import com.mxd.datax.service.DataSyncService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSyncServiceTest {
    @Autowired
    DataSyncService dataSyncService;

    @Test
    public void dataxTest() {
        dataSyncService.execute("demo.json");
    }
}

