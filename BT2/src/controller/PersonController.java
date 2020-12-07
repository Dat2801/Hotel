package controller;

import model.Person;

import java.util.Scanner;

public class PersonController {
    Scanner scanner = new Scanner(System.in);

    public Person khachThue() {
        Person person = new Person();
        System.out.println("Nhập tên khách thuê: ");
        String tenKT = scanner.nextLine();
        person.setHoTen(tenKT);

        System.out.println("Nhập ngày sinh khách thuê: ");
        int ngaySinh = Integer.parseInt(scanner.nextLine());
        person.setNgaySinh(ngaySinh);

        System.out.println("Nhập số chứng minh thư khánh thuê: ");
        int cmt = Integer.parseInt(scanner.nextLine());
        person.setSoCMT(cmt);

        return person;
    }
}
