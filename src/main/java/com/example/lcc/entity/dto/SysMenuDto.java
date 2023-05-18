package com.example.lcc.entity.dto;

import com.example.lcc.entity.comm.CommId;
import lombok.Data;


/**
 * @author Licc
 * @date 2023/1/12 7:42 AM
 */
@Data
public class SysMenuDto extends CommId {
    @Override
    public String toString() {
        return "SysMenuDto{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;
}