package com.atguigu.mbg.bean;

import javax.persistence.*;

@Table(name = "`tbl_emp`")
public class Employee {
    /**
     * 主键id
     */
    @Id
    @Column(name = "`emp_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer empId;

    @Column(name = "`emp_name`")
    private String empName;

    /**
     * 性别
     */
    @Column(name = "`gender`")
    private String gender;

    /**
     * 邮箱
     */
    @Column(name = "`email`")
    private String email;

    @Column(name = "`d_id`")
    private Integer dId;

    /**
     * 获取主键id
     *
     * @return emp_id - 主键id
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * 设置主键id
     *
     * @param empId 主键id
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * @return emp_name
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * @param empName
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * @return d_id
     */
    public Integer getdId() {
        return dId;
    }

    /**
     * @param dId
     */
    public void setdId(Integer dId) {
        this.dId = dId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", dId=" + dId +
                '}';
    }
}