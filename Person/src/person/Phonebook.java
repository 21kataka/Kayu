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
public class Phonebook {
    Person[] pb;
    int length;
    
    public Phonebook() {
        length=0;
        pb = new Person[100];
    }
    public void Addperson(Person p) {
        pb[length++]=p;
    }
    public void printEntries() {
        for (int i = 0; i < length; i++){
            System.out.println(pb[i].getFirstname() + " " +pb[i].getLastname() + " " +pb[i].getPhonenumber());
            
            
        }
    }
}
