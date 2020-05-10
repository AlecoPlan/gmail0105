package com.wzy.shop.service;

import com.wzy.shop.bean.UmsMember;
import com.wzy.shop.bean.UmsMemberReceiveAddress;


import java.util.List;

/**
 * @author shkstart
 * @creats 2020-05-05-16:39
 */
public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

}
