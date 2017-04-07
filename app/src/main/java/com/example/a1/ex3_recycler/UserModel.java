package com.example.a1.ex3_recycler;

import java.util.ArrayList;
import java.util.List;


public class UserModel {


    public static List<User> getUsers() {
        List<User> temp = new ArrayList<>();
        temp.add(new User("홍길동", "02-111-1111", 25, "http://lostsaga-image.cdn.lostsaga.com/2014_grand/class/illust/thum_char_view_n_064.jpg"));
        temp.add(new User("짱구", "02-111-222", 21, "http://cfile28.uf.tistory.com/image/274BC338559E609C23EE52"));
        temp.add(new User("라이언", "02-111-3333", 11, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT-dqh3x4svZo-NQR3MP1WleBcwz4zM6qHC5smGDvtXDf3SKUp6"));
        temp.add(new User("이디야", "02-111-4444", 12, "http://cfile2.uf.tistory.com/image/2106753553F1511D1199EE"));
        temp.add(new User("깃허브", "02-111-5555", 14, "https://assets-cdn.github.com/images/modules/open_graph/github-octocat.png"));


        return temp;
    }




    public static class User {
        private String name;
        private String phone;
        private int age;
        private String image;

        public User(String name, String phone, int age, String image) {
            this.name = name;
            this.phone = phone;
            this.age = age;
            this.image = image;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public int getAge() {
            return age;
        }

        public String getImage() {
            return image;
        }
    }
}