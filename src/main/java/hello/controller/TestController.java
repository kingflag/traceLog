package hello.controller;

import hello.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kingflag
 *         Created by kingflag on 2019/6/4.
 */
@RestController
@RequestMapping("/testController")
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @RequestMapping("/testMethod")
    public String testMethod(String entity) {
        String result = testService.test(entity + "------->Controller");
        logger.info("TestController");
        return result;
    }
}
