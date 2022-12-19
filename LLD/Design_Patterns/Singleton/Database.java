package org.sahil.LLD.Design_Patterns.Singleton;

//Singleton is a creational design pattern, which ensures that only one object of its kind exists and provides a single point of access to it for any other code.

public class Database {

    // local variable of class type
    //This is Lazy Initialization instance will be initialized when required
    private static Database instance;

    //eager initialization : initialized when class is called for first time
    //private static Database instance = new Database();

    //Step 1: Make a default constructor private
    private Database(){

    }


    //Step 2: Create a static getInstance() method for return Database object
    public static Database getInstance(){
        //Double-checked locking used in multithreading environment
        if(instance==null) {
            synchronized(Database.class){
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return Database.instance;
    }
}
