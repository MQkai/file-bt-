package kk.soft.co.jp.sys.service;

import kk.soft.co.jp.sys.model.MessageInfoMstModel;
import kk.soft.co.jp.sys.model.UserModel;

public interface MessageInfoMstService {

    /**
     * 新規作成
     */
    public Object insert(MessageInfoMstModel messageInfoMstModel);

	public void insert(UserModel userModel);


}
