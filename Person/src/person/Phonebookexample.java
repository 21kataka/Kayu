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
public class Phonebookexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p1 = new Person("Spongebob,", "Squarepants,", "111111111");
        Person p2 = new Person("Patrick,", "Star,", "000000000");
        Person p3 = new Person("Gary,", "Lobster,", "123643248");
        Person p4 = new Person("Sandy,", "Cheeks,", "423281421");
        Person p6 = new Person("Squidward,", "Tentacles,", "829418242");
        Person p7 = new Person("Mermaid,", "Man,", "726395847");
        Person p8 = new Person("Barnacle,", "Boy,", "928493742");
        Phonebook pb = new Phonebook();
        pb.Addperson(p1);
        pb.Addperson(p2);
        pb.Addperson(p3);
        pb.Addperson(p4);        
        pb.Addperson(p6);
        pb.Addperson(p7);
        pb.Addperson(p8);
        pb.printEntries();
    }
    
}
