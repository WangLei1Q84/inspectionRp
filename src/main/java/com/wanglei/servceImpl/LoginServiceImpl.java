package com.wanglei.servceImpl;
import com.wanglei.dao.UserInfoMapper;
import com.wanglei.model.UserInfo;
import com.wanglei.servcie.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;


import java.io.Serializable;

/**
 * Created by yuhao.wang on 2017/6/19.
 */
@Service
@Transactional(readOnly = true)
public class LoginServiceImpl implements LoginService,Serializable  {
    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public UserInfo hasPass(UserInfo userinfo) {
        if(userinfo!= null ){
            String password = userinfo.getUserPassword();
            String userId = userinfo.getUserId();
            UserInfo user =   userInfoMapper.selectByPrimaryKey(userId);
            if(!StringUtils.isEmpty(password) && password.equals(user.getUserPassword())){
                return user;
            }
        }
        return  null;
    }
}