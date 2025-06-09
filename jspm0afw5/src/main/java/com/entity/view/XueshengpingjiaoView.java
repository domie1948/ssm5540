package com.entity.view;

import com.entity.XueshengpingjiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生评教
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-27 16:45:11
 */
@TableName("xueshengpingjiao")
public class XueshengpingjiaoView  extends XueshengpingjiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengpingjiaoView(){
	}
 
 	public XueshengpingjiaoView(XueshengpingjiaoEntity xueshengpingjiaoEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengpingjiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
