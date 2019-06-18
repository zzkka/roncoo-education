package com.roncoo.education.user.service.common.resq;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 讲师信息-审核分页信息
 *
 * @author wujing
 */
@Data
@Accessors(chain = true)
public class LecturerAuditPageRESQ implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 主键
	 */
	@ApiModelProperty(value = "主键")
	@JsonSerialize(using = ToStringSerializer.class)
	private Long id;
	/**
	 * 状态(1:正常，0:禁用)
	 */
	@ApiModelProperty(value = "状态(1:正常，0:禁用)")
	private Integer statusId;
	/**
	 * 排序
	 */
	@ApiModelProperty(value = "排序")
	private Integer sort;
	/**
	 * 审核状态(0:待审核,1:审核通过,2:审核不通过)
	 */
	@ApiModelProperty(value = "审核状态(0:待审核,1:审核通过,2:审核不通过)")
	private Integer auditStatus;
	/**
	 * 审核意见
	 */
	@ApiModelProperty(value = "审核意见")
	private String auditOpinion;
	/**
	 * 讲师编号
	 */
	@ApiModelProperty(value = "讲师编号")
	@JsonSerialize(using = ToStringSerializer.class)
	private Long lecturerUserNo;
	/**
	 * 讲师名称
	 */
	@ApiModelProperty(value = "讲师名称")
	private String lecturerName;
	/**
	 * 电话
	 */
	@ApiModelProperty(value = "电话")
	private String lecturerMobile;
	/**
	 * 邮箱
	 */
	@ApiModelProperty(value = "邮箱")
	private String lecturerEmail;
	/**
	 * 讲师分成比例
	 */
	@ApiModelProperty(value = "讲师分成比例")
	private BigDecimal lecturerProportion;

}