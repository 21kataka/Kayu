/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Education Unlmited
 */
public class Person {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getShoesize() {
        return shoesize;
    }

    public void setShoesize(int shoesize) {
        this.shoesize = shoesize;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isIsastudent() {
        return isastudent;
    }

    /**
     * @param args the command line arguments
     */
    public void setIsastudent(boolean isastudent) {
        this.isastudent = isastudent;
    }

       int age;
       int shoesize;
       String phonenumber;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
       String firstname;
       String lastname;
       boolean isastudent;
        
    public Person(String first, String last, String phone) {
        firstname=first;
        lastname=last;
        phonenumber=phone;
    }
    }
