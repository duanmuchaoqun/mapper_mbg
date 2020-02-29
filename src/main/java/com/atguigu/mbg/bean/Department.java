package com.atguigu.mbg.bean;

import javax.persistence.*;

@Table(name = "`tbl_dept`")
public class Department {
    /**
     * 主键
     */
    @Id
    @Column(name = "`dept_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer deptId;

    @Column(name = "`dept_name`")
    private String deptName;

    /**
     * 获取主键
     *
     * @return dept_id - 主键
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * 设置主键
     *
     * @param deptId 主键
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * @return dept_name
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }
}