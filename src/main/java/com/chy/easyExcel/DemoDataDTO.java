package com.chy.easyExcel;

import lombok.Data;

@Data
public class DemoDataDTO {

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





}
