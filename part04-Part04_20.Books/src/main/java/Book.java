/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ensia
 */
public class Book {
    private String instanceTitle;
    private int instancePages;
    private int instanceYear;
    
    public Book(String parameterTitle, int parameterPage, int parameterYear){
        this.instanceTitle = parameterTitle;
        this.instancePages = parameterPage;
        this.instanceYear = parameterYear;
        
    }
    public  String getInstanceTitle(){
        return this.instanceTitle;
    }
    public  int getInstancePages(){
        return this.instancePages;
    }
    public int getInstanceYear(){
        return this.instanceYear;
    }
}
