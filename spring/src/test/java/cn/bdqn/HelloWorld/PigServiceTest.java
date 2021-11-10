package cn.bdqn.HelloWorld;

import cn.bdqn.domain.Pig;
import cn.bdqn.service.PigService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:beans.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class PigServiceTest {
    @Autowired
    private PigService pigService;
    @Test
    public void testSave() throws Exception{
        pigService.save(new Pig("东北虎"));
    }
    @Test
    public void testUpdate() throws Exception{
        pigService.update(new Pig());
    }
}

