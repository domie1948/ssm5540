package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DudaopingjiaoDao;
import com.entity.DudaopingjiaoEntity;
import com.service.DudaopingjiaoService;
import com.entity.vo.DudaopingjiaoVO;
import com.entity.view.DudaopingjiaoView;

@Service("dudaopingjiaoService")
public class DudaopingjiaoServiceImpl extends ServiceImpl<DudaopingjiaoDao, DudaopingjiaoEntity> implements DudaopingjiaoService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DudaopingjiaoEntity> page = this.selectPage(
                new Query<DudaopingjiaoEntity>(params).getPage(),
                new EntityWrapper<DudaopingjiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DudaopingjiaoEntity> wrapper) {
		  Page<DudaopingjiaoView> page =new Query<DudaopingjiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DudaopingjiaoVO> selectListVO(Wrapper<DudaopingjiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DudaopingjiaoVO selectVO(Wrapper<DudaopingjiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DudaopingjiaoView> selectListView(Wrapper<DudaopingjiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DudaopingjiaoView selectView(Wrapper<DudaopingjiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
