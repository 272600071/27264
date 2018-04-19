package com.itheima.examtest.controller;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.itheima.examtest.pojo.SUser;
import com.itheima.examtest.service.SUserService;

/**  
 * ClassName:SUserController <br/>  
 * Function:  <br/>  
 * Date:     2018年4月13日 下午6:39:40 <br/>       
 */
@RequestMapping("Suser")
@Controller
public class SUserController {
	@RequestMapping("toLogin")
	public String toLogin(){
		
		return "login";
	}
	@Autowired
	private SUserService sUserService;
	@RequestMapping("login")
	public String login(SUser sUser,HttpSession session){
		SUser s=sUserService.doLogin(sUser);
		if (s != null) {
			session.setAttribute("s", s.getUsername());
			return "index";
		}
		return "login";
	}
	
}
 
