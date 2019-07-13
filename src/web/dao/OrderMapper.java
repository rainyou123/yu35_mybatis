package web.dao;

import web.pojo.Order;
import web.pojo.OrderUser;
import web.pojo.User;
import web.vo.QueryVo;

import java.util.List;

public interface OrderMapper {

    List<Order> getAllOrders();

    List<OrderUser> getOrderAndUser();

    List<Order> getOrdersByOBO();

}

