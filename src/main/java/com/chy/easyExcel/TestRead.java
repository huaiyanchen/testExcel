package com.chy.easyExcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;

public class TestRead {
    public static void main(String[] args) {
        //实现excel读操作
        String filename = "src/main/resources/file/1.csv";
        ExcelReaderBuilder workBook = EasyExcel.read(filename, CommunicationPortDataDTO.class, new ExcelListener());
        ExcelReaderSheetBuilder sheet1 = workBook.sheet();
        sheet1.doRead();

        System.out.println("==============================");
        System.out.println(sheet1);

    }
}
