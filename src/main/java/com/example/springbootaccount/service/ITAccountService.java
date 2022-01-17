package com.example.springbootaccount.service;

import com.example.springbootcommonservice.dto.AccountDTO;
import com.example.springbootcommonservice.response.ObjectResponse;


/**
 * <p>
 * 服务类
 * </p>
 *
 * * @author lidong
 *
 * @since 2019-09-04
 */
public interface ITAccountService {

    /**
     * 扣用户钱
     */
    ObjectResponse decreaseAccount(AccountDTO accountDTO);
}
