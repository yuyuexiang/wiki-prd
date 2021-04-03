package com.yyx.wiki;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class WikiApplication {
    private static  final Logger LOG = LoggerFactory.getLogger(WikiApplication.class);

    public static void main(String[] args) {
        SpringApplication sa=new SpringApplication(WikiApplication.class);
        Environment em = sa.run(args).getEnvironment();
        LOG.info("--------------启动okokokokokokokokok！！！--------------");
        LOG.info("地址：\thttp://127.0.0.1:{}",em.getProperty("server.port"));
    }

}
