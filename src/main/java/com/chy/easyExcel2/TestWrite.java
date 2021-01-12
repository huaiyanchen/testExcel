package com.chy.easyExcel2;

import com.alibaba.excel.EasyExcel;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class TestWrite {
    public static void main(String[] args) {
        List<PersonDTO> personDTOList = new ArrayList<>();

        PersonDTO personDTO = new PersonDTO();
        personDTO.setName("ccc");
        personDTO.setAge("12");
        personDTO.setSex("321");
        personDTOList.add(personDTO);

        String fileName = "src/main/resources/file/2.xlsx";
        EasyExcel.write(fileName, PersonDTO.class).sheet("pp")
                .doWrite(personDTOList);

    }


}
