package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DudaopingjiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DudaopingjiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DudaopingjiaoView;


/**
 * 督导评教
 *
 * @author 
 * @email 
 * @date 2021-02-27 16:45:11
 */
public interface DudaopingjiaoService extends IService<DudaopingjiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DudaopingjiaoVO> selectListVO(Wrapper<DudaopingjiaoEntity> wrapper);
   	
   	DudaopingjiaoVO selectVO(@Param("ew") Wrapper<DudaopingjiaoEntity> wrapper);
   	
   	List<DudaopingjiaoView> selectListView(Wrapper<DudaopingjiaoEntity> wrapper);
   	
   	DudaopingjiaoView selectView(@Param("ew") Wrapper<DudaopingjiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DudaopingjiaoEntity> wrapper);
   	
}

