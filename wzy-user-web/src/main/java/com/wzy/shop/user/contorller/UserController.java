package com.wzy.shop.user.contorller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wzy.shop.bean.UmsMember;
import com.wzy.shop.bean.UmsMemberReceiveAddress;
import com.wzy.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author shkstart
 * @creats 2020-05-05-16:38
 */
@Controller
public class UserController {

    //远程协议代理
    @Reference
    UserService userService;

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMember = userService.getAllUser();
        return umsMember;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "helloUser";
    }
}
