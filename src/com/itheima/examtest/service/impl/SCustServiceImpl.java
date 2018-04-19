package com.itheima.examtest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.examtest.mapper.SCustMapper;
import com.itheima.examtest.pojo.SCust;
import com.itheima.examtest.pojo.SCustExample;
import com.itheima.examtest.pojo.SCustExample.Criteria;
import com.itheima.examtest.service.SCustService;

/**
 * ClassName:SCustServiceImpl <br/>
 * Function: <br/>
 * Date: 2018年4月13日 下午7:42:13 <br/>
 */
@Service
public class SCustServiceImpl implements SCustService {
	@Autowired
	private SCustMapper sCustMapper;

	@Override
	public List<SCust> selectByExample() {

		return sCustMapper.selectByExample(null);
	}

	@Override
	public void deleteById(Integer cid) {

		sCustMapper.deleteByPrimaryKey(cid);

	}

	@Override
	public List<SCust> selectByExample(SCust sCust) {
		List<SCust> list = new ArrayList<>();

		list = selectByExample();
		SCustExample example = new SCustExample();
		Criteria criteria = example.createCriteria();
		if (sCust.getCustName() != null && sCust.getCustName() != "") {
			System.out.println(sCust.getCustName()+"+++++++++++++++++");
			criteria.andCustNameLike("%" +sCust.getCustName() + "%");
		}
		if (sCust.getCustType() != null && sCust.getCustType() != "") {
			criteria.andCustTypeLike("%" + sCust.getCustType() + "%");
		}
		if ((sCust.getCustName() != null && sCust.getCustName() != "")
				|| (sCust.getCustType() != null && sCust.getCustType() != "")) {
			list = sCustMapper.selectByExample(example);
		}

		return list;
	}

	@Override
	public void save(SCust sCust) {
		  
		sCustMapper.insert(sCust);
		
	}

}
