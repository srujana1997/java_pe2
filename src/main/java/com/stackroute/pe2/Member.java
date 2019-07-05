package com.stackroute.pe2;

 public class Member {

        String name;
        int age;
        double salary;
//Membervariable class to initialize Member class variables

        public class Membervariable{

            Member member = new Member();

            public Member setMember(String name, int age, double salary)
            {
                member.name = name;
                member.age = age;
                member.salary = salary;
                return member;
            }

        }
    }

