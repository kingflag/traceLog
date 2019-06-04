package hello.dao;

import hello.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author kingflag
 * Created by kingflag.wang on 2019/6/4.
 */
@Component
public class TestDao {

    private static final Logger logger = LoggerFactory.getLogger(TestDao.class);
    public String dao(String entity){
        logger.info("TestDao");
        return entity;
    }
}
