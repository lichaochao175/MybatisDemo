package com.example.lcc.comm;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCodeEnum {

  SUCCESS(200,"成功"),
  ERROR(500,"失败"),
  BIZ_ERROR(501,"通用业务异常");

  /**
   * 编码
   */
  private final   Integer  code;
  /**
   * 编码信息
   */
  private  final String msg;


}
