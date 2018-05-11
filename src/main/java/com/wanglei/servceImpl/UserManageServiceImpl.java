package com.wanglei.servceImpl;

import com.wanglei.dao.UserInfoMapper;
import com.wanglei.model.UserInfo;
import com.wanglei.servcie.UserManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.io.Serializable;

/**
 * Created by yuhao.wang on 2017/6/19.
 */
@Service
@Transactional(readOnly = true)
public class UserManageServiceImpl  extends  BaseService implements UserManageService,Serializable  {
    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public void addUser(UserInfo userinfo) {
        //获取序列
        String   id =   getSequencesNumByClazz(userinfo.getClass());
        userinfo.setId(id);
        userInfoMapper.insert(userinfo);
    }


}