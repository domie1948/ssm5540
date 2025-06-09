package com.dao;

import com.entity.DudaopingjiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DudaopingjiaoVO;
import com.entity.view.DudaopingjiaoView;


/**
 * 督导评教
 * 
 * @author 
 * @email 
 * @date 2021-02-27 16:45:11
 */
public interface DudaopingjiaoDao extends BaseMapper<DudaopingjiaoEntity> {
	
	List<DudaopingjiaoVO> selectListVO(@Param("ew") Wrapper<DudaopingjiaoEntity> wrapper);
	
	DudaopingjiaoVO selectVO(@Param("ew") Wrapper<DudaopingjiaoEntity> wrapper);
	
	List<DudaopingjiaoView> selectListView(@Param("ew") Wrapper<DudaopingjiaoEntity> wrapper);

	List<DudaopingjiaoView> selectListView(Pagination page,@Param("ew") Wrapper<DudaopingjiaoEntity> wrapper);
	
	DudaopingjiaoView selectView(@Param("ew") Wrapper<DudaopingjiaoEntity> wrapper);
	
}
