package com.bignerdranch.testphilosophyjava.homecontrol.parallelExecution.synchronizing.restaurant;

public class Meal {
    private final int orderNum;
    public Meal(int orderNum){this.orderNum = orderNum;}
    public String toString(){return "Meal "+orderNum;}
}
