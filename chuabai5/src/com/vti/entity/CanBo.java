package com.vti.entity;

import java.util.Scanner;

public class CanBo {

    private String name;

    private int age;

    private String gender;

    private String address;

    public CanBo(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public void nhapCanBo(){
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Nhập họ tên: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Nhập tuổi: ");
//        int age = scanner.nextInt();
//
//        System.out.println("Nhập giới tính: ");
//        String gender = scanner.nextLine();
//
//        System.out.println("Nhập địa chỉ: ");
//        String address = scanner.nextLine();
//    }


    @Override
    public String toString() {
        return "CanBo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
