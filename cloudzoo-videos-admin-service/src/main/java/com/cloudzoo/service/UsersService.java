package com.cloudzoo.service;

import com.cloudzoo.utils.PagedResult;
import com.cloudzoo.pojo.Users;

public interface UsersService {

	public PagedResult queryUsers(Users user, Integer page, Integer pageSize);
	
}
