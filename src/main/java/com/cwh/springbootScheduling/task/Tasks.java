package com.cwh.springbootScheduling.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Tasks {

	private static final Logger log = LoggerFactory.getLogger(Tasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    /*
     *  @Scheduled(fixedRate = 1000) ：上一次开始执行时间点之后1秒再执行
		@Scheduled(fixedDelay = 1000) ：上一次执行完毕时间点之后1秒再执行
		@Scheduled(initialDelay=1000, fixedRate=5000) ：第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
     */
    @Scheduled(fixedRate = 1000)
    public void reportCurrentTime() {
        log.info("北京时间： {}", dateFormat.format(new Date()));
    }
}
