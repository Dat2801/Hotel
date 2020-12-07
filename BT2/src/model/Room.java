package model;

public class Room {
    public enum Loaiphong{
        Cao_Cấp, Bình_Dân
    }
    private int id;
    private int soNgayTro;
    private Loaiphong loaiPhongTro;
    private double giaPhong;
    private Person person;

    public Room() {
    }

    public Room(int id, int soNgayTro, Loaiphong loaiPhongTro, double giaPhong) {
        this.id = id;
        this.soNgayTro = soNgayTro;
        this.loaiPhongTro = loaiPhongTro;
        this.giaPhong = giaPhong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoNgayTro() {
        return soNgayTro;
    }

    public void setSoNgayTro(int soNgayTro) {
        this.soNgayTro = soNgayTro;
    }

    public Loaiphong isLoaiPhongTro() {
        return loaiPhongTro;
    }

    public void setLoaiPhongTro(Loaiphong loaiPhongTro) {
        this.loaiPhongTro = loaiPhongTro;
    }

    public double getGiaPhong() {
        return giaPhong ;
    }

    public void setGiaPhong(double giaPhong) {
        this.giaPhong = giaPhong;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "- Thông tin phòng (" +
                "Số phòng: " + id + "\n" +
                "số ngày trọ: " + soNgayTro + "\n"+
                " loại phòng: " + loaiPhongTro.toString() + "\n"+
                " giá phòng: " + giaPhong +
                 "\n" + person.toString() +
                ')';
    }
}
