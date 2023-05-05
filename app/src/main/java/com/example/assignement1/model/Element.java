package com.example.assignement1.model;

public class Element {
    private String name;
    private int atomicNum;
    private String symbol;
    private double atomicMass;
    private String chemicalGroup;

    public Element(String name, int atomicNum, String symbol, double atomicMass, String chemicalGroup) {
        this.name = name;
        this.atomicNum = atomicNum;
        this.symbol = symbol;
        this.atomicMass = atomicMass;
        this.chemicalGroup = chemicalGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtomicNum() {
        return atomicNum;
    }

    public void setAtomicNum(int atomicNum) {
        this.atomicNum = atomicNum;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getAtomicMass() {
        return atomicMass;
    }

    public void setAtomicMass(double atomicMass) {
        this.atomicMass = atomicMass;
    }

    public String getChemicalGroup() {
        return chemicalGroup;
    }

    public void setChemicalGroup(String chemicalGroup) {
        this.chemicalGroup = chemicalGroup;
    }
}
