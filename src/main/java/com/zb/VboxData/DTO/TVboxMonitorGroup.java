package com.zb.VboxData.DTO;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * t_vbox_monitor_group
 * @author 
 */
@Data
public class TVboxMonitorGroup implements Serializable {
    private Long id;

    /**
     * 网关id
     */
    private Long gatewayId;

    /**
     * 分组编号
     */
    private Long groupId;

    /**
     * 分组名称
     */
    private String groupName;

    /**
     * 触发类型 1-变化采集
     */
    private String triggerType;

    /**
     * 配置模板编号
     */
    private Integer configId;

    private String hisCycle;

    private Integer plcId;

    private String addrType;

    private String addrStatNo;

    private String floatPoint;

    private String dataId;

    private String isFree;

    private Long createBy;

    private Date createDt;

    private Long updateBy;

    private Date updateDt;

    private static final long serialVersionUID = 1L;
}