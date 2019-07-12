package web.dao;

import web.pojo.User;

public interface UserMapper {
    User getUserById(int id);
}
//mybatis 规定只能是接口
//一个接口要有一个与名相同的xml  必须放在一个目录中
