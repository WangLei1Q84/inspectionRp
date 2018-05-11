package com.wanglei.servceImpl;

import com.github.pagehelper.PageHelper;
import com.wanglei.dao.BaseMapper;
import com.wanglei.util.*;
import org.slf4j.Logger;import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by wangl on 2018/4/27.
 */
@Service
public abstract  class  BaseService {

    private static final Logger log = LoggerFactory.getLogger(BaseService.class);
    @Autowired
    private  BaseMapper mapper;

    public  Page findByPage(int pageNo, int pageSize,Object tableParams){
        Page page = new Page();
        String beanClassName =  tableParams.getClass().getName();
        String beanClassLocalName = tableParams.getClass().getSimpleName();
        String exampleClassName = beanClassName+"Example";
        String createCriteriaMethodName = "createCriteria";
        String  mapprName = beanClassLocalName+"Mapper";
        String countMethodName = "countByExample";
        String selectMethodName = "selectByExample";
        try {
            //通过ExampleName 获取Class 再获取Example对象
            Class<?> exampleclazz = Class.forName(exampleClassName);
            Object exampleObject =  exampleclazz.getConstructor().newInstance();
            //获取创建Criteria的方法
            Method getCriteriaMthod =   exampleclazz.getDeclaredMethod(createCriteriaMethodName);
            //执行创建Criteria的方法  并获取到Criteria
            Object  criteria =  getCriteriaMthod.invoke(exampleObject,null);
            Class<?> criteriaClass  =  criteria.getClass();
            //如果入参对象不为空
            if(tableParams != null){
                List<Field> fields = ReflectUtil.getNotNUllFields(tableParams);
                for(Field f: fields)
                {
                    String criteriaMthodName = "and"+ReflectUtil.upperCase(f.getName())+"Like";
                    Method m1 = criteriaClass.getMethod(criteriaMthodName,f.getType());
                    m1.invoke(criteria,"%"+f.get(tableParams)+"%");
                }
            }
            //通过mapperName 获取mapper对象
            Object mapperObject = WebConfig.getBean(StringUtil.lowerFirstCase(mapprName));
            Class<?>  mapperClass  = mapperObject.getClass();
            Method countMethod = mapperClass.getDeclaredMethod(countMethodName,exampleclazz);
            int total = (int) countMethod.invoke(mapperObject,exampleObject);
            PageHelper.startPage(pageNo, pageSize,true);
            Method selectMethod = mapperClass.getDeclaredMethod(selectMethodName,exampleclazz);
            List list = (List) selectMethod.invoke(mapperObject,exampleObject);
            page.setRecords(list);
            page.setTotalRecord(total);
        } catch (Exception e) {
            log.error(e.toString(),e);
            page = new Page(1,1,0);
            List ll = new ArrayList();
            page.setRecords(ll);
        }
        return  page;
    }


    public String getSequencesNumByClazz(Class modoleClass){
        String className = modoleClass.getSimpleName();
        String sequencesName = "seq_"+className+".nextval";
        Long num =  mapper.getSequenceNum(sequencesName);
        String DateStr = DateUtil.toDateString("yyyyMMdd");
        String id =  DateStr +  String.format("%024d",num);
        return id;

    }









}
