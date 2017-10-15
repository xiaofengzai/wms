package com.ens.domain.enums;


import com.ens.util.EnumMessage;

/**
 * Created by fengwen on 10/14/17.
 */
public enum RoleTypeEnum implements EnumMessage<Integer> {
    Admin(1,"管理员"),
    Customer(2,"客户会员");



    private Integer value;
    private String displayName;

    RoleTypeEnum(Integer value,String displayName) {
        this.value = value;
        this.displayName = displayName;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }
}
