package kk.soft.co.jp.sys.controller;


import java.util.List;

import javax.annotation.Resource;

//
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kk.soft.co.jp.sys.model.UserModel;
import kk.soft.co.jp.sys.service.UserService;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class MainController {
//	static protected Logger logger = LogManager.getLogger(MainController.class);
	  public static void main(String[] args) {
//	    ApplicationContext applicationContext = (ApplicationContext) SpringApplication.run(MainController.class, args);
	    log.info("");
	    log.trace("");
	    log.warn("");
	    log.error("");
	    
//	    UserService demoService = applicationContext.getBean(UserService.class);
//	    demoService.hello();
	  }

    @Resource
    UserService userService;
    @GetMapping("/UserAccount")
    public String UserAcount() {
    	return "UserAccount";
    }
       
    @GetMapping("/userData")
    public String userData() {
        return "userData";
    }

    @GetMapping
    public String login() {
        return "login";
    }
    
    @GetMapping("/signUp")
    public String signUp() {
        return "signUp";
    }
    @GetMapping("/passChange")
    public String passChange() {
    	return "passChange";
    }
    
    @PostMapping("/backHome")
    public String backHome(UserModel userModel,Model model) {
    	return "login";
    }
    @PostMapping("/userData")
    public String userData(UserModel userModel, Model model){  
    	List<UserModel> a =  userService.takeData(userModel);
    	model.addAttribute("a", a);
    	
    	
            	return "userData";
            	
        	
    	}
    
    @PostMapping("/UserAccount")
    public String UserAccount(UserModel userModel, Model model){
    	UserModel u = userService.takeAll(userModel);
    	UserModel login = userService.checkLogin(userModel);
    	if(login != null) {
//    	log.info("{}", userModel);
    	model.addAttribute("msg1", u.getUserName() +"様ようこそへ" );
    	model.addAttribute("UserName", u.getUserName() );
    	model.addAttribute("furigana", u.getFurigana() );
    	model.addAttribute("birthday", u.getBirthday() );
    	model.addAttribute("sex", u.getSex() );
    	model.addAttribute("job", u.getJob() );
    	model.addAttribute("email", u.getEmail() );
    	model.addAttribute("pass", u.getPass() );
       return "UserAccount";
    }else {
    	model.addAttribute("msg","エラー発生しました。もう一度入力してください");
    	return "login";
    }
   }
   @PostMapping("/passChange")
   public String passChange(UserModel userModel,Model model) {
	   UserModel checkAcc = userService.checkLogin(userModel);
	   UserModel SetPass = userService.selectPass(userModel);
	   if(checkAcc == null) {
		   model.addAttribute("msg", "Eメールあるいはパスワード間違いました。");
	   }else if (userModel.getEmail()== ""||userModel.getPass()=="") {
		   model.addAttribute("msg", "全て入力してください。");
	   }else if(checkAcc != null) {
		   
	   }
		   SetPass.setPass(userModel.getPass());
		   userService.update(userModel);
		   model.addAttribute("msg", "パスワード変更できました！.もう一度ログインしてください！");
		return "login";
   }
    
    @PostMapping("/login")
    public String login(UserModel userModel, Model model){
    	if(checkSignUp(userModel,model)==true) {
    		userService.insert(userModel);
    		return "login";
    	}else {
    		return "signUp";
    	}
    }
    
    
    @PostMapping("/signUp")
    public String signUp(UserModel userModel, Model model){   	
//    	log.info("{}", userModel);
    		return "signUp";
    	}
    
//    @PostMapping("/save")
//    public String save(UserModel userModel, Model model){
//        model.addAttribute("msg","登録OK");
//       return "index";
//    }
//    private boolean CheckAccInDb(UserModel userModel,Model model) {
//    	boolean isAllInput = true;
//    	boolean AccountHave = true;
//    	UserModel checkAcc = userService.checkLogin(userModel);
//    	if(checkAcc == null) {
//    		model.addAttribute("msg1", "アカウントが存在しないです。");
//    		AccountHave = false;
//    	}
//    	if(userModel.getEmail()=="" || userModel.getPass()=="") {
//    		model.addAttribute("msg1", "全部入力してください。");
//    		isAllInput=false;
//    	}if(isAllInput == true && AccountHave == true) {
//    		userModel.setPass(userModel.getNewpass());
//    		userService.update(userModel);
//    		model.addAttribute("msg1", "パスワード変更できました！");
//			return true;
//    	}else return false;
//    }
    	
    
    private boolean checkSignUp(UserModel userModel,Model model) {
    	boolean isAllInput = true;
    	boolean isAccountCorrect = true;
    	UserModel checkAcc = userService.checkAccount(userModel);
    	if(userModel.getUserName() == "" ||userModel.getFurigana() == "" 
    			||userModel.getBirthday() == "" ||userModel.getSex() == "" ||userModel.getEmail() == "" 
    			||userModel.getPass() == "" ) {
    		model.addAttribute("msg", "全部入力してください。");
    		isAllInput=false;
    	}
    	if(checkAcc != null) {
    		model.addAttribute("msg", "アカウントは既に存在しました。");
			isAccountCorrect = false;
    	}
    	if(isAllInput == true && isAccountCorrect == true) {
			model.addAttribute("msg", "登録完了！");
			return true;
    	}else return false;
    }
    
}

  
  

 

