package controller;

import model.Person;
import model.Room;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomController {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Room> rooms = new ArrayList<>();

    public void addKT() {
        Room room = new Room();
        PersonController personController = new PersonController();
        room.setPerson(personController.khachThue());

        System.out.println("Số ngày thuê: ");
        int snt = Integer.parseInt(scanner.nextLine());
        room.setSoNgayTro(snt);

        System.out.println("Loại phòng thuê: ");
        System.out.println("1. Loại A");
        System.out.println("2. Loại B");
        int choiceLoaiPhong = Integer.parseInt(scanner.nextLine());
        switch (choiceLoaiPhong) {
            case 1:
                room.setLoaiPhongTro(Room.Loaiphong.Cao_Cấp);
                break;
            case 2:
                room.setLoaiPhongTro(Room.Loaiphong.Bình_Dân);
        }

        System.out.println("Giá phòng thuê: ");
        double gpt = scanner.nextFloat();
        room.setGiaPhong(gpt);

        rooms.add(room);
    }

    public void showPS() {
        for (Room room : rooms) {
            System.out.println(room.toString());
        }
    }

    public Room searchCMT(int cmt) {

        for (Room room : rooms) {
            if (cmt == room.getPerson().getSoCMT()) {
                return room;
            }
        }
        return null;
    }

        public void traPhong(int cmt){
            System.out.println(searchCMT(cmt).getPerson());
            System.out.println("Số tiền: " + searchCMT(cmt).getGiaPhong() * searchCMT(cmt).getSoNgayTro());
        }
    }

