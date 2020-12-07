package model;

public class Person {
    private String hoTen;
    private int ngaySinh;
    private int soCMT;

    public Person() {
    }

    public Person(String hoTen, int ngaySinh, int soCMT) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soCMT = soCMT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getSoCMT() {
        return soCMT;
    }

    public void setSoCMT(int soCMT) {
        this.soCMT = soCMT;
    }

    @Override
    public String toString() {
        return "Thông tin người thuê (" +
                "Họ Tên: " + hoTen + '\'' +
                ", ngày sinh: " + ngaySinh +
                ", số chứng minh thư: " + soCMT +
                ')';
    }
}
