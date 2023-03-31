package kk.soft.co.jp.sys.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kk.soft.co.jp.sys.mapper.MessageInfoMstMapper;
import kk.soft.co.jp.sys.model.MessageInfoMstModel;
import kk.soft.co.jp.sys.model.UserModel;
import kk.soft.co.jp.sys.service.MessageInfoMstService;

@Service
public class MessageInfoMstServiceImpl implements MessageInfoMstService {

    @Resource
    private MessageInfoMstMapper mapper;

    /**
     * 新規作成
     *
     * @param messageInfoMst
     */
    @Override
    public Object insert(MessageInfoMstModel messageInfoMst) {

        return mapper.insert(messageInfoMst);
    }

	@Override
	public void insert(UserModel userModel) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
