package web.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import web.dao.UserMapper;
import web.pojo.User;
import web.vo.QueryVo;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {
    @Test
    public void testFn() throws IOException {
        //配置文件路径
        String resource = "SqlMapConfig.xml";
        //根据路径获取输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //根据输入流获取sql会话工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂对象打开一个sql会话，true : 代表开启事务 ，可操作数据库的改 。false:只能查询
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //从会话中取得一个mapper映射文件
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
    }

    @Test
    public void testFn2() throws IOException {
        //配置文件路径
        String resource = "SqlMapConfig.xml";
        //根据路径获取输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //根据输入流获取sql会话工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂对象打开一个sql会话，true : 代表开启事务 ，可操作数据库的改 。false:只能查询
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //从会话中取得一个mapper映射文件
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setName("lisi");
        user.setEmail("li@163.com");
        user.setSex("2");
        mapper.insertUser(user);
    }

    @Test
    public void testFn3() throws IOException {
        //配置文件路径
        String resource = "SqlMapConfig.xml";
        //根据路径获取输入流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //根据输入流获取sql会话工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //通过工厂对象打开一个sql会话，true : 代表开启事务 ，可操作数据库的改 。false:只能查询
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        //从会话中取得一个mapper映射文件
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        QueryVo vo= new QueryVo();
        User user=new User();
        user.setName("li");
        vo.setUser(user);
        User u=mapper.getUserByQueryVo(vo);
        System.out.println(u);
    }
}
