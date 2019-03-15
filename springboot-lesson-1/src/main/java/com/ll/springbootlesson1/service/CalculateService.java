package com.ll.springbootlesson1.service;

import org.springframework.stereotype.Service;

/**
 * 计算服务
 */
@Service
public interface CalculateService {

    /**
     * 从多个整数Sum求和
     * @param values    多个整数
     * @return sum 累加值
     */
    Integer sum(Integer... values);


}
