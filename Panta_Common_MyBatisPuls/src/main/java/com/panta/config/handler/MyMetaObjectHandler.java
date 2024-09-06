package com.panta.config.handler;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;

public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        // 获取Mapper接口的Class对象
        Class<?> mapperInterface = metaObject.getOriginalObject().getClass();
        // 获取表名
        String tableName = getTableName(mapperInterface);
        if(tableName.equals("panta_link")){
            this.strictInsertFill(metaObject, "name", String.class, "测试");
        }

    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject, "updateTime", Date.class, new Date());
    }

    private String getTableName(Class<?> mapperInterface) {
        // 通常表名是通过注解来定义的，例如@TableName，你需要根据你的项目中的具体注解来获取
        // 这里只是一个示例，实际情况需要根据你的项目来编写
        // 假设你的项目中使用了@TableName注解
        if (mapperInterface.isAnnotationPresent(TableName.class)) {
            TableName tableNameAnnotation = mapperInterface.getAnnotation(TableName.class);
            return tableNameAnnotation.value();
        }
        return null;
    }
}