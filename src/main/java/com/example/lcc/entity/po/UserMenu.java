package com.example.lcc.entity.po;


/**
 * @author Licc
 *   菜单表
 * @date 2023/2/16 11:22 PM
 */
public class UserMenu {
    private Long id;

    private String menuName;

    private Integer parentId;

    private Integer level;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}