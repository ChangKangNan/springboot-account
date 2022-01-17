package com.example.springbootaccount.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * * @author lidong
 *
 * @since 2019-09-04
 */
@Mapper
public interface TAccountMapper{

    /**
     * 减少账户余额
     *
     * @param userId
     * @param amount
     * @return
     */
    int decreaseAccount(@Param("userId") String userId, @Param("amount") Double amount);
}
