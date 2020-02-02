package com.wonoder4work.ad.service;


import com.wonder4work.ad.exception.AdException;
import com.wonoder4work.ad.vo.CreateUserRequest;
import com.wonoder4work.ad.vo.CreateUserResponse;

public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * */
    CreateUserResponse createUser(CreateUserRequest request)
            throws AdException;
}
