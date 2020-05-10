package com.wzy.shop.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wzy.shop.bean.UmsMember;
import com.wzy.shop.bean.UmsMemberReceiveAddress;
import com.wzy.shop.service.UserService;

import com.wzy.shop.user.mapper.UmsMemberReceiveAddressMapper;
import com.wzy.shop.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author shkstart
 * @creats 2020-05-05-16:39
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
//        return userMapper.selectAllUser();
        List<UmsMember> umsMemberList = userMapper.selectAll();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(e);
        return umsMemberReceiveAddresses;
    }

}
