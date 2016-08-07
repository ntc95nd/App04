package com.ntc.doctruyen.models;

/**
 * Created by Administrator on 07/08/2016.
 */
public class Truyen {
    private int idAnh;
    private String tenTruyen;

    public Truyen(int idAnh, String tenTruyen) {
        this.idAnh = idAnh;
        this.tenTruyen = tenTruyen;
    }

    public int getIdAnh() {
        return idAnh;
    }

    public String getTenTruyen() {
        return tenTruyen;
    }
}
