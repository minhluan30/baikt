/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2;

/**
 *
 * @author ADMIN
 */
public class CauThu {
    private int soao;          
    private String hoten;       
    private int namsinh;        
    private int luongcung;  
    private double tienthuong;  
    private double tienphat;  

    public CauThu(int soao, String hoten, int namsinh, int luongcung, double tienthuong, double tienphat) {
        this.soao = soao;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.luongcung = luongcung;
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
    }

    public int getSoao() {
        return soao;
    }

    public void setSoao(int soao) {
        this.soao = soao;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }

    public int getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(int luongcung) {
        this.luongcung = luongcung;
    }

    public double getTienthuong() {
        return tienthuong;
    }

    public void setTienthuong(double tienthuong) {
        this.tienthuong = tienthuong;
    }

    public double getTienphat() {
        return tienphat;
    }

    public void setTienphat(double tienphat) {
        this.tienphat = tienphat;
    }

    @Override
    public String toString() {
        return "CauThu{" + "soao=" + soao + ", hoten=" + hoten + ", namsinh=" + namsinh + ", luongcung=" + luongcung + ", tienthuong=" + tienthuong + ", tienphat=" + tienphat + '}';
    }

    double tinhLuongThucLanh() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}