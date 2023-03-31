package kk.soft.co.jp.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import kk.soft.co.jp.sys.model.UserModel;

@Repository
@Mapper
public interface UserMapper {
	List<UserModel> selectAll();
    int insert(UserModel userModel);

	UserModel checkAccount(UserModel userModel);

	UserModel checkLogin(UserModel userModel);

	UserModel takeAll(UserModel userModel);
	List<UserModel> takeData(UserModel userModel);
	UserModel update(UserModel userModel);
	UserModel selectPass(UserModel userModel);
}