import com.wp.sm.beans.User;
import com.wp.sm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserServiceTest {

    @Autowired
    UserService us;

    @Test
    public void selectUserByName() throws Exception {
        User user = new User();
        user.setStudent_id(12);
        user.setName("九九");
        String link = us.selectUserByName(user);
        // 输出报名贴地址
        System.out.println(link);
    }

    @Test
    public void selectUserById() throws Exception {
        User user = us.selectUserById(1);
        // 输出用户信息
        System.out.println(user.toString());
    }

    @Test
    public void selectAllUser() throws Exception {
        List<User> user = us.selectAllUser();
        // 输出用户信息
        System.out.println(user.toString());
    }

    @Test
    public void deleteUser() throws Exception {
        boolean b = us.deleteUser(11);
        if (b == true) {
            System.out.println("删除成功！");
        } else {
            System.out.println("删除失败！");
        }
    }

    @Test
    public void updateUser() throws Exception {
        User user = new User();
        user.setName("万万");
        user.setCreate_at(System.currentTimeMillis());
        user.setUpdate_at(System.currentTimeMillis());
        user.setQq(1197178284);
        user.setJob("java");
        user.setArrive_time(System.currentTimeMillis());
        user.setSchool("黑龙江科技大学");
        user.setStudent_id(121212);
        user.setLink("http://www.jnshu.com/school/39867/daily");
        user.setWish("加油！");
        user.setKnown_ways("朋友介绍");
        user.setBro("张恒");
        user.setId(3);
        boolean b = us.updateUser(user);
        if (b == true) {
            System.out.println("更新成功！");
        } else {
            System.out.println("更新失败！");
        }
    }

    @Test
    public void insertUser() throws Exception {
        User user = new User();
        user.setName("peter");
        user.setCreate_at(System.currentTimeMillis());
        user.setUpdate_at(System.currentTimeMillis());
        user.setQq(1197178284);
        user.setJob("java");
        user.setArrive_time(System.currentTimeMillis());
        user.setSchool("黑龙江科技大学");
        user.setStudent_id(121212);
        user.setLink("http://www.jnshu.com/school/39867/daily");
        user.setWish("加油！");
        user.setKnown_ways("朋友介绍");
        user.setBro("张恒");
        us.insertUser(user);
        System.out.println("id:" + user.getId());
    }
}
