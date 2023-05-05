package com.example.assignement1.model;

import java.util.List;

public interface IElement {
    public List<Element> getName(String name);
    public List<Element> getAtomicNumber(int num);
    public List<Element> getSymbol(String Sym);
    public List<Element> getAtomicMass(double AtomicMass);
    public List<Element> getGroup(String Group);
}
