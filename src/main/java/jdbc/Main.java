package jdbc;

import jdbc.dao.UserDao;


import jdbc.util.Util;
import jdbc.service.UserService;
import jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        Util.getConnection();
       UserService userDao = new UserServiceImpl();
        userDao.createUsersTable();
        userDao.saveUser("Name1", "LastName1", (byte) 20);
        userDao.saveUser("Name2", "LastName2", (byte) 25);
        userDao.saveUser("Name3", "LastName3", (byte) 31);
        userDao.saveUser("Name4", "LastName4", (byte) 38);
       userDao.removeUserById(3);
        System.out.println(userDao.getAllUsers() );
        userDao.cleanUsersTable();
       userDao.dropUsersTable();
    }
}
