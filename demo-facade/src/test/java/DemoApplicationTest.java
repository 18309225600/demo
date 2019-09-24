import com.example.demo.facade.DemoApplication;
import com.lhf.simplespringbootstarter.service.SplitService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/**
 * @author Pirate
 * @desc 测试类
 * @since v1.0.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@AutoConfigureMockMvc
@Slf4j
public class DemoApplicationTest {

    @Autowired
    private SplitService splitService;

    @Test
    public void test1(){
        String[] as = splitService.split("DRS");
        System.out.println(as);
    }
}
