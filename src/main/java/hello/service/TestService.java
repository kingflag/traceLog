package hello.service;

import hello.dao.TestDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kingflag
 * Created by kingflag on 2019/6/4.
 */
@Service
public class TestService {

    private static final Logger logger = LoggerFactory.getLogger(TestService.class);

    @Autowired
    private TestDao testDao;
    public String test(String entity){

        if (entity == null){
            entity = "entity";
        }
        String result = testDao.dao(entity + "-------->Service");
        logger.info("TestService");
        return result;
    }
}
