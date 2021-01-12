package com.chy.easyExcel2;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.builder.ExcelReaderSheetBuilder;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.chy.easyExcel.CommunicationPortDataDTO;
import com.chy.easyExcel.ExcelListener;

public class TestRead {
    public static void main(String[] args) {
        //实现excel读操作
        String filename = "src/main/resources/file/1.xlsx";
        ExcelReader excelReader = EasyExcel.read(filename).build();

        ExcelListener2 personListener = new ExcelListener2();
        ExcelListener2 studentListener = new ExcelListener2();

//        EasyExcel.read(filename, CommunicationPortDataDTO.class, new ExcelListener()).sheet().doRead();
        // ReadSheet readBoxServerSheet =
        //                    EasyExcel.readSheet(0).head(BoxServerConfig.class).registerReadListener(boxServerListener).build();
        //            ReadSheet readPlatformSheet =
        //                    EasyExcel.readSheet(1).head(PlatformConfig.class).registerReadListener(platformListener).build();

        ReadSheet readPersonSheet = EasyExcel.readSheet(0).head(PersonDTO.class).registerReadListener(personListener).build();
        ReadSheet readStudentSheet = EasyExcel.readSheet(1).head(StudentsDTO.class).registerReadListener(studentListener).build();
        excelReader.read(readPersonSheet, readStudentSheet);

        System.out.println("==============================");

    }
}
