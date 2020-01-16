package com.gmall.gamlluser.controller;

import com.gmall.gmalluser.bean.UmsMember;
import com.gmall.gmalluser.bean.UmsReceiveAddress;
import com.gmall.gmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsReceiveAddress> umsReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);
        return umsReceiveAddresses;
    }


    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMembers = userService.getAllUser();
        return umsMembers;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }



}
