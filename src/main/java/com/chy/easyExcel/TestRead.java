package com.chy.easyExcel;

import com.alibaba.excel.EasyExcel;

public class TestRead {
    public static void main(String[] args) {

        //实现excel读操作
        String filename = "src/main/resources/file/1.csv";
        EasyExcel.read(filename,DemoDataDTO.class,new ExcelListener()).sheet().doRead();
    }
}
