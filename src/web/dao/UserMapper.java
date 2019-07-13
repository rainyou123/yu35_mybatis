package web.dao;

import web.pojo.User;
import web.vo.QueryVo;

import java.util.List;

public interface UserMapper {
    User getUserById(int id);

    void insertUser(User user);

    User getUserByQueryVo(QueryVo vo);

    int getCountForUser();

    List<User> getUsersByNameAndSex(User user);

//    List<User> getUsersByIds(List<Integer> ids);
    List<User> getUsersByIds(Integer[] ids);

    List<User> getUsersByQueryVo(QueryVo vo);
}
//mybatis 规定只能是接口
//一个接口要有一个与名相同的xml  必须放在一个目录中 例如UserMapper 和 他的xml 在dao层中
