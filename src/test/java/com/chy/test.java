//package com.chy;
//
//import com.alibaba.excel.EasyExcel;
//import com.alibaba.excel.ExcelReader;
//import com.alibaba.excel.read.metadata.ReadSheet;
//import com.chy.easyExcel.ExcelListener;
//import com.chy.easyExcel.TestFileUtil;
//import org.junit.Test;
//
//import java.io.File;
//
//public class test {
//
//    @Test
//    public void repeatedRead() {
//        String fileName = TestFileUtil.getPath() + "demo" + File.separator + "demo.xlsx";
//        // 读取全部sheet
//        // 这里需要注意 DemoDataListener的doAfterAllAnalysed 会在每个sheet读取完毕后调用一次。然后所有sheet都会往同一个DemoDataListener里面写
//        EasyExcel.read(fileName, DemoData.class, new ExcelListener()).doReadAll();
//        // 读取部分sheet
//        fileName = TestFileUtil.getPath() + "demo" + File.separator + "demo.xlsx";
//        ExcelReader excelReader = EasyExcel.read(fileName).build();
//        // 这里为了简单 所以注册了 同样的head 和Listener 自己使用功能必须不同的Listener
//        ReadSheet readSheet1 =
//                EasyExcel.readSheet(0).head(DemoData.class).registerReadListener(new DemoDataListener()).build();
//        ReadSheet readSheet2 =
//                EasyExcel.readSheet(1).head(DemoData.class).registerReadListener(new DemoDataListener()).build();
//        // 这里注意 一定要把sheet1 sheet2 一起传进去，不然有个问题就是03版的excel 会读取多次，浪费性能
//        excelReader.read(readSheet1, readSheet2);
//        // 这里千万别忘记关闭，读的时候会创建临时文件，到时磁盘会崩的
//        excelReader.finish();
//    }
//
//}
