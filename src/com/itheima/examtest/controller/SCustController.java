package com.itheima.examtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itheima.examtest.pojo.SCust;
import com.itheima.examtest.service.SCustService;

/**  
 * ClassName:SCustController <br/>  
 * Function:  <br/>  
 * Date:     2018年4月13日 下午7:57:27 <br/>       
 */
@RequestMapping("Scust")
@Controller
public class SCustController {
	@Autowired
	private SCustService sCustService;
	@RequestMapping("center")
	public String center(Model model,SCust sCust){
		if (sCust.getCustName() != null && sCust.getCustName() != "") {
			model.addAttribute("cust_username", sCust.getCustName());
		}
		if (sCust.getCustType() != null && sCust.getCustType() != "") {
			model.addAttribute("cust_type", sCust.getCustType());
		}
		
		List<SCust> list=sCustService.selectByExample(sCust);
		model.addAttribute("list", list);
		return "center";
	}
	@RequestMapping("delete")
	public String delete(Integer cid){
		sCustService.deleteById(cid);
		return "redirect:center.action";//forward:itemList.action
	}
	
	@RequestMapping("save")
	public String save(SCust sCust){
		sCustService.save(sCust);
		return "redirect:center.action";
	}

}
  
