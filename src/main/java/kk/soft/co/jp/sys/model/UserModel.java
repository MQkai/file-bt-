package kk.soft.co.jp.sys.model;

import java.io.Serializable;

import lombok.Data;
 @Data
public class UserModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    public  String userName;
    private String furigana;
    private String birthday;
    private String job;
    private String sex;
    private String email;
    private String pass;
//    private String newpass;
    
//    public UserModel() {
//    }


}
