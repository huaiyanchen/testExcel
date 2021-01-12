package com.chy.easyExcel;

import lombok.Data;

@Data
public class CommunicationPortDataDTO {
    //通讯口ID
    private String communicationPortId;
    //通讯口
    private String communicationPort;
    //设备类型
    private String deviceType;
    //驱动名称
    private String driverName;
    //网关站号
    private String gateWayStation;
    //设备站号
    private String standNo;
    //连接方式
    private String connectionStation;
    //波特率
    private String baudRate;
    //停止位
    private String stopBit;
    //数据位
    private String dataBit;
    //校验位
    private String checkBit;
    //重试次数
    private String retryTimes;
    //等待超时
    private String waitTimeout;
    //接收超时
    private String receiveTimeout;
    //连读长度
    private String continuousReadLength;
    //通讯延迟时间
    private String communicationDelayTime;
    //重试超时
    private String retryTimeout;
    //端口
    private String port;
    //网络类型
    private String networkType;
    //使用广播地址
    private String useBroadcastAddress;
    //广播地址站号
    private String broadcastAddressStationNumber;
    //IP地址
    private String ipAddress;
    //创建时间
    private String createTime;
}
