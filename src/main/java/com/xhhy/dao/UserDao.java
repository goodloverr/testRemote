package com.xhhy.dao;

import java.util.List;

import com.xhhy.domain.UserBean;

public interface UserDao {
	void insertUser(UserBean user);

	List<UserBean> queryAll();

	void deleteUser(int userId);

	void updateUser(UserBean user);
}
