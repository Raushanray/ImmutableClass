package com.immutableclass.demo;
/*
1.in immutable class your class always should be final.\
2.fields/state is defined as  a final and private
3. implement parametrized constructors with public modifies with all fields
4.do not implement setter method -> to stop any to reset it..
 */

/*
here i am adding the instance of address class because every student have a address.
 */

final public class Student {
    final private int id;
    final private String studentName;
    final private Address address;

    public Student(int id, String studentName, Address address) {
        this.id = id;
        this.studentName = studentName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public Address getAddress() {
        return new Address(address.getCity(), address.getState());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", address=" + address +
                '}';
    }
}
