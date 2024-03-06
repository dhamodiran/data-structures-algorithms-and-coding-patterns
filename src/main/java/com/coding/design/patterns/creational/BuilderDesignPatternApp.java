package com.coding.design.patterns.creational;

public class BuilderDesignPatternApp {

    public static void main(String[] args) {

        User user = new User.UserBuilder("Dhamo").setAge(30).setAddress("Bangalore").setPhone("123456789").build();
        System.out.println(user);
        User user1 = new User.UserBuilder("Dhamo1").setAge(30).build();
        System.out.println(user1);

    }
}

class User{
    private final String name;
    private final String address;
    private final Integer age;
    private final String phone;

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        address = userBuilder.address;
        this.age = userBuilder.age;
        this.phone = userBuilder.phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class UserBuilder{
        private final String name;
        private String address;
        private Integer age;
        private String phone;

        public UserBuilder(String name) {
            this.name = name;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }
    }
}
