package com.entity.view;

import com.entity.DudaopingjiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 督导评教
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-27 16:45:11
 */
@TableName("dudaopingjiao")
public class DudaopingjiaoView  extends DudaopingjiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DudaopingjiaoView(){
	}
 
 	public DudaopingjiaoView(DudaopingjiaoEntity dudaopingjiaoEntity){
 	try {
			BeanUtils.copyProperties(this, dudaopingjiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
