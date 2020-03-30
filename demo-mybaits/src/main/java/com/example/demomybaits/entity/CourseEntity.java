package com.example.demomybaits.entity;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

/**
 * @author hfl
 * @email 690328661@qq.com
 * @date 2020-03-30 14:41:33
 */
@Data
public class CourseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id编号
	 */
	private Integer id;
	/**
	 * 培训机构
	 */
	private String org;
	/**
	 * 课程名字
	 */
	private String name;
	/**
	 * 百度盘链接
	 */
	private String url;
	/**
	 * 提取码
	 */
	private String code;
	/**
	 * 
	 */
	private Date updateTime;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 类别
	 */
	private Integer typeId;

}
