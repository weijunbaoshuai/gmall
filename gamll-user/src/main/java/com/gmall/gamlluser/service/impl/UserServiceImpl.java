package com.gmall.gamlluser.service.impl;

import com.gmall.gmalluser.bean.UmsMember;
import com.gmall.gmalluser.bean.UmsReceiveAddress;
import com.gmall.gmalluser.mapper.UmsMemberReceiveAddressMapper;
import com.gmall.gmalluser.mapper.UserMapper;
import com.gmall.gmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList = userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public List<UmsReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        List<UmsReceiveAddress> umsMemberReceiveAddresses =umsMemberReceiveAddressMapper.selectByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }
}
