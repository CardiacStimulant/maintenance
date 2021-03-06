package com.maintenance.constant;

/**
 * 操作类型枚举类
 */
public enum OperationLogOperationTypeEnum {
    ADD("add", "新增"),
    UPDATE("update", "修改"),
    DELETE("delete", "删除");

    private String key;

    private String value;

    private OperationLogOperationTypeEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name();
    }

    public String getValue() {
        return this.value;
    }

}

