package com.example.lcc.entity.po;


/**
 * @author Licc
 *   权限表
 * @date 2023/2/16 11:22 PM
 */
public class UserRole {
    private Long id;

    private Long roleId;

    private String roleName;

    private Long usrId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Long getUsrId() {
        return usrId;
    }

    public void setUsrId(Long usrId) {
        this.usrId = usrId;
    }
}