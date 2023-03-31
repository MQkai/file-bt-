package kk.soft.co.jp.sys.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kk.soft.co.jp.sys.mapper.UserMapper;
import kk.soft.co.jp.sys.model.UserModel;
import kk.soft.co.jp.sys.service.UserService;

@Service
public  class UserServiceImpl implements UserService {

    @Resource
    private UserMapper mapper;

    /**
     * 新規作成
     *
     * @param messageInfoMst
     * @return 
     */
    @Override
    public Object insert(UserModel userModel) {
        return mapper.insert(userModel);
    }
//    @Override
	public UserModel checkAccount(UserModel userModel) {
		return mapper.checkAccount(userModel);
	}
	@Override
	public UserModel checkLogin(UserModel userModel) {
		return mapper.checkLogin(userModel);
	}
	@Override
	public UserModel takeAll(UserModel userModel) {
		return mapper.takeAll(userModel);
	}
	@Override
	public List<UserModel> takeData(UserModel userModel) {
		return mapper.takeData(userModel);
	}
	@Override
	public UserModel selectPass(UserModel userModel) {
		return mapper.selectPass(userModel);
	}
	@Override
	public UserModel update(UserModel userModel) {
		return mapper.update(userModel);
	}

}
