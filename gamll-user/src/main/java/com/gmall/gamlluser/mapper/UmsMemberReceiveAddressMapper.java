package com.gmall.gamlluser.mapper;

import com.gmall.gmalluser.bean.UmsReceiveAddress;
import java.util.List;

public interface UmsMemberReceiveAddressMapper {
    List<UmsReceiveAddress> selectByMemberId(String memberId);
}
