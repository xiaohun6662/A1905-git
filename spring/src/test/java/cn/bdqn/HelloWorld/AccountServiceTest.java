package cn.bdqn.HelloWorld;

import cn.bdqn.domain.Pig;
import cn.bdqn.service.AccountService;
import cn.bdqn.service.PigService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:beans.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;
    @Test
    public void testT() throws Exception{
        Integer srcid=1;
        Integer destid=2;
        Integer money=200;
        accountService.transfer(srcid,destid,money);
    }
    @Test
    public void testUpdate() throws Exception{

    }
}

