/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package springconstructor3;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Aiswarya
 */
class Question {
    private int id;
    private String name;
    private List<String> answers;

    public Question() {
        System.out.println("Default constructor");
    }
    public Question(int id, String name, List<String> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }
public void displayInfo()
{
    System.out.println(id+"  "+name);
    System.out.println("Answers are ");
    Iterator<String> itr=answers.iterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }
}
    
    
    

}
