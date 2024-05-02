package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 素材
 *
 * @author 
 * @email
 */
@TableName("sucai")
public class SucaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public SucaiEntity() {

	}

	public SucaiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 素材名称
     */
    @TableField(value = "sucai_name")

    private String sucaiName;


    /**
     * 素材照片
     */
    @TableField(value = "sucai_photo")

    private String sucaiPhoto;


    /**
     * 素材类型
     */
    @TableField(value = "sucai_types")

    private Integer sucaiTypes;


    /**
     * 素材文件
     */
    @TableField(value = "sucai_file")

    private String sucaiFile;


    /**
     * 点击次数
     */
    @TableField(value = "sucai_clicknum")

    private Integer sucaiClicknum;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 素材介绍
     */
    @TableField(value = "sucai_content")

    private String sucaiContent;


    /**
     * 逻辑删除
     */
    @TableField(value = "sucai_delete")

    private Integer sucaiDelete;


    /**
     * 上传时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：素材名称
	 */
    public String getSucaiName() {
        return sucaiName;
    }


    /**
	 * 获取：素材名称
	 */

    public void setSucaiName(String sucaiName) {
        this.sucaiName = sucaiName;
    }
    /**
	 * 设置：素材照片
	 */
    public String getSucaiPhoto() {
        return sucaiPhoto;
    }


    /**
	 * 获取：素材照片
	 */

    public void setSucaiPhoto(String sucaiPhoto) {
        this.sucaiPhoto = sucaiPhoto;
    }
    /**
	 * 设置：素材类型
	 */
    public Integer getSucaiTypes() {
        return sucaiTypes;
    }


    /**
	 * 获取：素材类型
	 */

    public void setSucaiTypes(Integer sucaiTypes) {
        this.sucaiTypes = sucaiTypes;
    }
    /**
	 * 设置：素材文件
	 */
    public String getSucaiFile() {
        return sucaiFile;
    }


    /**
	 * 获取：素材文件
	 */

    public void setSucaiFile(String sucaiFile) {
        this.sucaiFile = sucaiFile;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getSucaiClicknum() {
        return sucaiClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setSucaiClicknum(Integer sucaiClicknum) {
        this.sucaiClicknum = sucaiClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：素材介绍
	 */
    public String getSucaiContent() {
        return sucaiContent;
    }


    /**
	 * 获取：素材介绍
	 */

    public void setSucaiContent(String sucaiContent) {
        this.sucaiContent = sucaiContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getSucaiDelete() {
        return sucaiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setSucaiDelete(Integer sucaiDelete) {
        this.sucaiDelete = sucaiDelete;
    }
    /**
	 * 设置：上传时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：上传时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Sucai{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", sucaiName=" + sucaiName +
            ", sucaiPhoto=" + sucaiPhoto +
            ", sucaiTypes=" + sucaiTypes +
            ", sucaiFile=" + sucaiFile +
            ", sucaiClicknum=" + sucaiClicknum +
            ", shangxiaTypes=" + shangxiaTypes +
            ", sucaiContent=" + sucaiContent +
            ", sucaiDelete=" + sucaiDelete +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
