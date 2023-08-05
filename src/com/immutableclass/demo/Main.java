package com.immutableclass.demo;

/*
i am creating Student class object and then initializes fields and print it..
here can change student data because my fields are final and here setter method is not implement of this fields..
 */
/*
Advantage:-
1. Thread safty is the immutable objects are  Thread safe  :-imaImagine the normal mutable objects now if there is a mutable
object in a multi-threaded environment then different threads can access that particular object in a same time,
imagine one thread is reading the data from an object and one thread is writing the data to the object so,
 maybe there is a chance of data inconsistency because if someone is writing something while the other thread
  is  reading maybe the data inside the object will be changed but is the object is immutable then obviously
   we can guarantee that once the object is constructed obviously the data inside the object will not be changed
    that's the advantage right so even though 10 threads are accessing the same immutable object we can be assured
     that no that thread can not hamper the data that we got inside that object because that object is immutable
      so once the object is getting created these threads can not change the data inside that particular object..

 2. immutable key is used in HashMap..
 */


public class Main {
    public static void main(String[] args) {

        Address hoemAddress = new Address("bengaluru", "karnatka", "India");
        System.out.println("Address of object :" + hoemAddress.hashCode());
        Student student = new Student(1, "Raushan", hoemAddress);

        System.out.println(student);
/*
here my address class is mutable and my student class is immutable.
means here i will change the address of student.
 */
        Address address = student.getAddress();
        System.out.println("Address object : " + address.hashCode());
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