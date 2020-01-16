package com.gmall.gamlluser.service;

import com.gmall.gmalluser.bean.UmsMember;
import com.gmall.gmalluser.bean.UmsReceiveAddress;
import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();
    List<UmsReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
