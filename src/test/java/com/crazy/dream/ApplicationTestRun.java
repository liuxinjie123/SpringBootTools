package com.crazy.dream;

import com.crazy.dream.config.TestConfig;
import com.crazy.dream.dto.test.TestBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = TestConfig.class)
//@SpringBootTest
@ActiveProfiles("dev")
public class ApplicationTestRun {
    @Autowired
    private TestBean testBean;

    @Test
    public void devBeanShouldInject() {
        String expected = " test from development profile.";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
    }
}
