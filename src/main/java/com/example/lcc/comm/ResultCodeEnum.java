package com.example.lcc.comm;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResultCodeEnum {

  SUCCESS(200,"成功"),
  ERROR(500,"失败"),
  BIZ_ERROR(501,"通用业务异常");

  private final   Integer  code;
  private  final String msg;


}
