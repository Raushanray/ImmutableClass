package com.immutableclass.demo;

/*
i am creating Student class object and then initializes fields and print it..
here can change student data because my fields are final and here setter method is not implement of this fields..
 */

public class Main {
    public static void main(String[] args) {

        Address hoemAddress = new Address("bengaluru", "karnatka");
        Student student = new Student(1, "Raushan", hoemAddress);

        System.out.println(student);
/*
here my address class is mutable and my student class is immutable.
means here i will change the address of student.
 */
        Address address = student.getAddress();
        address.setCity("Madhubani");
        address.setState("Bihar");
        System.out.println(student);

        /*
        now output:-
        Student{id=1, studentName='Raushan', address= Address{city='bengaluru', state='karnatka'}}
         Student{id=1, studentName='Raushan', address= Address{city='Madhubani', state='Bihar'}}
        */
        /*
        this is break the immutable class properties.
         */
        /*
        now  return new Address(address.getCity(), address.getState()); of the student class and
        now no one can break immutable class properties and now my student class is 100% immutable class now no one
        can alter my student class..
         */

         /*
        now output:-
        Student{id=1, studentName='Raushan', address= Address{city='bengaluru', state='karnatka'}}
         Student{id=1, studentName='Raushan', address= Address{city='bengaluru', state='karnatka'}}
        */

    }
}