/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello;

/**
 *
 * @author bacha
 */
public class PartTimeStudent extends Student {
    private int numOfCourse;

    public int getNumOfCourse() {
        return numOfCourse;
    }

    public void setNumOfCourse(int numOfCourse) {
        this.numOfCourse = numOfCourse;
    }

    public PartTimeStudent(int numOfCourse, String sID, String sName) {
        super(sID, sName);
        this.numOfCourse = numOfCourse;
    }
    
}
