package com.zb.VboxData.DTO;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_vbox_monitor
 * @author 
 */
@Data
public class TVboxMonitor implements Serializable {
    private Long id;

    /**
     * 通讯口编号
     */
    private Long plcId;

    /**
     * 设备id
     */
    private String deviceId;

    /**
     * 分组id
     */
    private Long groupId;

    /**
     * 采集点编号
     */
    private Long collectId;

    /**
     * 采集点名称
     */
    private String collectName;

    /**
     * 配置模板编号
     */
    private String configId;

    /**
     * 地址类型 1-位地址 2-字地址
     */
    private String addrType;

    /**
     * 寄存器类型 0-0 1-1 2-2 3-3 4-4 5-HDX
     */
    private String rid;

    /**
     * 字段名（存入时序库对应的字段名）
     */
    private String fieldName;

    /**
     * 寄存器地址
     */
    private Integer addr;

    /**
     * 权限 1-只读 2-只写 3-读写
     */
    private String cfgRole;

    /**
     * 站号
     */
    private Integer addrStatNo;

    /**
     * 描述
     */
    private String describe;

    /**
     * 单位
     */
    private String extUnit;

    /**
     * 数据格式1-16位无符号十进制数 -预留字段
     */
    private String digitBinary;

    /**
     * 状态
     */
    private Integer state;

    /**
     * 整数位,小数位(两个值合并逗号隔开)
     */
    private String digitCount;

    /**
     * 最小值,最大值(两个值合并逗号隔开)
     */
    private String digitLimit;

    /**
     * 主编号范围: 0-999999
     */
    private String dataLimit;

    /**
     * 设备型号/类型
     */
    private String devModel;

    /**
     * 死区设置
     */
    private Integer deadSet;

    /**
     * 预留字段
     */
    private String dataId;

    private String batch;

    /**
     * 预留字段
     */
    private String increase;

    /**
     * 预留字段
     */
    private String freeId;

    /**
     * 预留字段
     */
    private String isfree;

    /**
     * 预留字段
     */
    private String parent;

    /**
     * 预留字段
     */
    private String stringPoint;

    /**
     * 预留字段
     */
    private String modbusUnicod;

    private String floatPoint;

    /**
     * 预留字段
     */
    private String parentValue;

    /**
     * 数据处理表达式
     */
    private String handleScript;

    /**
     * 预留字段
     */
    private String customConfig;

    private Date createDt;

    private Long createBy;

    private Date updateDt;

    private Long updateBy;

    private static final long serialVersionUID = 1L;
}