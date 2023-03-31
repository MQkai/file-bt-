package kk.soft.co.jp.sys.service;

import java.util.List;

import kk.soft.co.jp.sys.model.UserModel;

public interface UserService {

    /**
     * 新規作成
     */
    public Object insert(UserModel userModel);
    public List<UserModel> takeData(UserModel userModel);
	public  UserModel checkAccount(UserModel userModel);
	public  UserModel checkLogin(UserModel userModel);
	public UserModel takeAll(UserModel userModel);
	public UserModel update(UserModel userModel);
	public UserModel selectPass(UserModel userModel);
//	public Object insert(UserModel userModel);
//	 static final Logger logger = LoggerFactory.getLogger(UserService.class);
//	  public default void hello() {
//	    logger.info("debug enabled: {}", logger.isDebugEnabled());
//	    logger.trace("trace");
//	    logger.debug("debug");
//	    logger.info("info");
//	    logger.warn("warn");
//	    logger.error("error");
//	  }

}

