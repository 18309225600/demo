package com.example.demo.domain.entity;

import javax.persistence.*;

public class Ts {
    @Id
    private Integer id;

    @Column(name = "serial_no")
    private String serialNo;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return serial_no
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * @param serialNo
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }
}