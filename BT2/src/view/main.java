package view;

import controller.RoomController;
import controller.PersonController;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RoomController roomController = new RoomController();
        PersonController personController = new PersonController();
        int n = 3;
        do {
            System.out.println();
            System.out.println("------Menu-------");
            System.out.println("1. Đăng kí nhận phòng");
            System.out.println("2. Hiển thị thông tin khách hàng");
            System.out.println("3. Khách trả phòng");
            System.out.println("0. Thoát");
            n = Integer.parseInt(scanner.nextLine());
            switch (n) {
                case 1:
                    roomController.addKT();
                    break;
                case 2:
                    roomController.showPS();
                    break;
                case 3:
                    System.out.println("Nhập số chứng minh thư: ");
                    int cmt = Integer.parseInt(scanner.nextLine());

                    roomController.traPhong(cmt);
                    break;
            }

        } while (n != 3);
    }

}
