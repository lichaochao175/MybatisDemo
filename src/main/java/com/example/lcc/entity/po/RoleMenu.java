package com.example.lcc.entity.po;


/**
 * @author Licc
 *   权限菜单中间表
 * @date 2023/2/16 11:22 PM
 */

public class RoleMenu {
    private Long id;

    private Integer roleId;

    private Integer menuId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }
}