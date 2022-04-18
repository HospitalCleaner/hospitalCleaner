package com.example.hospitalcleaner.dozer;


import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.Arrays;

public class DozerApp {
     static DozerBeanMapper mapper = new DozerBeanMapper();

    public static void main(String[] args) {

        configureMapper("dozer.xml");

        DozerEntity dozerEntity = new DozerEntity("merve","çetin",26);
        DozerDto dozerDto = mapper.map(dozerEntity,DozerDto.class,"dozer_mapper");
        System.out.println(dozerDto.getName()+" "+dozerDto.getNickName());

    }

    public static void configureMapper(String... mappingFileUrls){
        mapper.setMappingFiles(Arrays.asList(mappingFileUrls));

    }





}
