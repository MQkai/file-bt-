package kk.soft.co.jp.sys.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class MessageInfoMstModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private int id;
    private int age;

    /**
     * msg
     */
    private String msg;
    private String userName;
    private String furigana;
    private String job;
    private String sex;


    /**
     * sender
     */
    private String sender;
    
    public MessageInfoMstModel() {
    }


}
