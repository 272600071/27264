package com.itheima.examtest.service;

import java.util.List;

import com.itheima.examtest.pojo.SCust;

/**  
 * ClassName:SCustService <br/>  
 * Function:  <br/>  
 * Date:     2018年4月13日 下午7:40:27 <br/>       
 */
public interface SCustService {

	List<SCust> selectByExample(SCust sCust);

	void deleteById(Integer cid);

	List<SCust> selectByExample();

	void save(SCust sCust);

}
  
