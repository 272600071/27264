package com.itheima.examtest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.examtest.mapper.SUserMapper;
import com.itheima.examtest.pojo.SUser;
import com.itheima.examtest.pojo.SUserExample;
import com.itheima.examtest.pojo.SUserExample.Criteria;
import com.itheima.examtest.service.SUserService;

/**  
 * ClassName:SUserServiceImpl <br/>  
 * Function:  <br/>  
 * Date:     2018年4月13日 下午7:07:18 <br/>       
 */
@Service
public class SUserServiceImpl implements SUserService {
	@Autowired
	private SUserMapper sUserMapper;

	@Override
	public SUser doLogin(SUser sUser) {
		  
		SUserExample example=new SUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(sUser.getUsername());
		criteria.andPasswordEqualTo(sUser.getPassword());
		List<SUser> users = sUserMapper.selectByExample(example);
		if (users.size()>0) {
			return users.get(0);
		}
		return new SUser();
	}
	
	
}
  
