package com.example.assignement1.model;

public class ElementFactory {
   PeriodicTable periodicTable= new PeriodicTable();
    public IElement getModel()
    {
        return  periodicTable;
    }
}
