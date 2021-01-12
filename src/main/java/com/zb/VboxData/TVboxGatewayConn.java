package com.zb.VboxData;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_vbox_gateway_conn
 * @author 
 */
@Data
public class TVboxGatewayConn implements Serializable {
    private Long id;

    /**
     * 网关编号
     */
    private Long gatewayId;

    /**
     * plc编号
     */
    private Long plcId;

    /**
     * plc开始编号
     */
    private Long plcStatNo;

    /**
     * 通讯口
     */
    private String port;

    /**
     * COM口类型
     */
    private String comtype;

    /**
     * 设备站号
     */
    private Integer boxStatNo;

    /**
     * 驱动名称
     */
    private String devType;

    /**
     * 设备型号
     */
    private String devModel;

    /**
     * 驱动
     */
    private String driver;

    /**
     * 等待超时
     */
    private Integer waitTimeout;

    /**
     * 重试超时
     */
    private Integer retryTimeout;

    /**
     * 连接方式 1-RS232 2-RS485 3-RS422
     */
    private String connectionMode;

    /**
     * 数据位
     */
    private Integer dataLength;

    /**
     * 网关站号
     */
    private Integer gatewayStationNumber;

    /**
     * 连接方式
     */
    private String doType;

    /**
     * 重复次数
     */
    private Integer retryTimes;

    /**
     * 接收超时
     */
    private Integer revTimeout;

    /**
     * 延迟时间
     */
    private Integer delayTime;

    /**
     * 波特率
     */
    private Integer baudrate;

    /**
     * 停止位
     */
    private String stopBit;

    /**
     * 校验位
     */
    private String checkBit;

    /**
     * 预留字段
     */
    private String netPort;

    /**
     * 预留字段
     */
    private String netType;

    /**
     * 预留字段
     */
    private String netIsbroadcast;

    /**
     * 预留字段
     */
    private String netBroadcastaddr;

    /**
     * 预留字段
     */
    private String netIpaddr;

    /**
     * 预留字段
     */
    private String freeTag;

    private Long createBy;

    private Date createDt;

    private Long updateBy;

    private Date updateDt;

    private static final long serialVersionUID = 1L;
}