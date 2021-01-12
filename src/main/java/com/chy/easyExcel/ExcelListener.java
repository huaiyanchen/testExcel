package com.chy.easyExcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.Map;

public class ExcelListener extends AnalysisEventListener<DemoDataDTO> {
    //一行一行读取excel内容
    @Override
    public void invoke(DemoDataDTO demoDataDTO, AnalysisContext analysisContext) {
        System.out.println("****"+demoDataDTO);
    }
    //读取表头内容
    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        System.out.println("表头："+headMap);
    }

    //读取完成之后
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }


}
