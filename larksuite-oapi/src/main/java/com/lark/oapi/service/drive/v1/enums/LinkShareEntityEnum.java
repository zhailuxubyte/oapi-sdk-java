// Code generated by lark suite oapi sdk gen
package com.lark.oapi.service.drive.v1.enums;

// 生成枚举值
public enum LinkShareEntityEnum {
  TENANTREADABLE("tenant_readable"),
  TENANTEDITABLE("tenant_editable"),
  ANYONEREADABLE("anyone_readable"),
  ANYONEEDITABLE("anyone_editable"),
  CLOSED("closed"),
  ;
  private String value;

  LinkShareEntityEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }
}