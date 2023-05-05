package com.example.assignement1.model;

import java.util.ArrayList;
import java.util.List;

public class PeriodicTable implements IElement {
    private ArrayList<Element> elements=new ArrayList<>();
    public PeriodicTable()
    {
        elements.add(new Element("Hydrogen", 1, "H", 1.008, "Nonmetal"));
        elements.add(new Element("Helium", 2, "He", 4.003, "Noble Gas"));
        elements.add(new Element("Lithium", 3, "Li", 6.941, "Alkali Metal"));
        elements.add(new Element("Beryllium", 4, "Be", 9.012, "Alkaline Earth Metal"));
        elements.add(new Element("Boron", 5, "B", 10.81, "Metalloid"));
        elements.add(new Element("Carbon", 6, "C", 12.01, "Nonmetal"));
        elements.add(new Element("Nitrogen", 7, "N", 14.01, "Nonmetal"));
        elements.add(new Element("Oxygen", 8, "O", 16.00, "Nonmetal"));
        elements.add(new Element("Fluorine", 9, "F", 19.00, "Halogen"));
        elements.add(new Element("Neon", 10, "Ne", 20.18, "Noble Gas"));
        elements.add(new Element("Sodium", 11, "Na", 22.99, "Alkali Metal"));
        elements.add(new Element("Magnesium", 12, "Mg", 24.31, "Alkaline Earth Metal"));
        elements.add(new Element("Aluminum", 13, "Al", 26.98, "Post-Transition Metal"));
        elements.add(new Element("Silicon", 14, "Si", 28.09, "Metalloid"));
        elements.add(new Element("Phosphorus", 15, "P", 30.97, "Nonmetal"));
        elements.add(new Element("Sulfur", 16, "S", 32.06, "Nonmetal"));
        elements.add(new Element("Chlorine", 17, "Cl", 35.45, "Halogen"));
        elements.add(new Element("Argon", 18, "Ar", 39.95, "Noble Gas"));
        elements.add(new Element("Potassium", 19, "K", 39.10, "Alkali Metal"));
        elements.add(new Element("Calcium", 20, "Ca", 40.08, "Alkaline Earth Metal"));
        elements.add(new Element("Scandium", 21, "Sc", 44.96, "Transition Metal"));
        elements.add(new Element("Titanium", 22, "Ti", 47.87, "Transition Metal"));
        elements.add(new Element("Vanadium", 23, "V", 50.94, "Transition Metal"));
        elements.add(new Element("Chromium", 24, "Cr", 52.00, "Transition Metal"));
        elements.add(new Element("Manganese", 25, "Mn", 54.94, "Transition Metal"));
        elements.add(new Element("Iron", 26, "Fe", 55.85, "Transition Metal"));
        elements.add(new Element("Cobalt", 27, "Co", 58.93, "Transition Metal"));
        elements.add(new Element("Nickel", 28, "Ni", 58.69, "Transition Metal"));
        elements.add(new Element("Copper", 29, "Cu", 63.55, "Transition Metal"));
        elements.add(new Element("Zinc", 30, "Zn", 65.38, "Transition Metal"));
        elements.add(new Element("Gallium", 31, "Ga", 69.723, "Post-transition metal"));
        elements.add(new Element("Germanium", 32, "Ge", 72.630, "Metalloid"));
        elements.add(new Element("Arsenic", 33, "As", 74.9216, "Metalloid"));
        elements.add(new Element("Selenium", 34, "Se", 78.960, "Nonmetal"));
        elements.add(new Element("Bromine", 35, "Br", 79.904, "Halogen"));
        elements.add(new Element("Krypton", 36, "Kr", 83.798, "Noble gas"));
        elements.add(new Element("Rubidium", 37, "Rb", 85.4678, "Alkali metal"));
        elements.add(new Element("Strontium", 38, "Sr", 87.62, "Alkaline earth metal"));
        elements.add(new Element("Yttrium", 39, "Y", 88.90584, "Transition metal"));
        elements.add(new Element("Zirconium", 40, "Zr", 91.224, "Transition metal"));
        elements.add(new Element("Niobium", 41, "Nb", 92.90637, "Transition metal"));
        elements.add(new Element("Molybdenum", 42, "Mo", 95.95, "Transition metal"));
        elements.add(new Element("Technetium", 43, "Tc", 98, "Transition metal"));
        elements.add(new Element("Ruthenium", 44, "Ru", 101.07, "Transition metal"));
        elements.add(new Element("Rhodium", 45, "Rh", 102.90550, "Transition metal"));
        elements.add(new Element("Palladium", 46, "Pd", 106.42, "Transition metal"));
        elements.add(new Element("Silver", 47, "Ag", 107.8682, "Transition metal"));
        elements.add(new Element("Cadmium", 48, "Cd", 112.411, "Transition metal"));
        elements.add(new Element("Indium", 49, "In", 114.818, "Post-transition metal"));
        elements.add(new Element("Tin", 50, "Sn", 118.710, "Post-transition metal"));
        elements.add(new Element("Antimony", 51, "Sb", 121.760, "Metalloid"));
        elements.add(new Element("Tellurium", 52, "Te", 127.60, "Metalloid"));
        elements.add(new Element("Iodine", 53, "I", 126.90447, "Halogen"));
        elements.add(new Element("Xenon", 54, "Xe", 131.293, "Noble gas"));
        elements.add(new Element("Cesium", 55, "Cs", 132.90545196, "Alkali metal"));
        elements.add(new Element("Barium", 56, "Ba", 137.327, "Alkaline earth metal"));
        elements.add(new Element("Lanthanum", 57, "La", 138.90547, "Lanthanide"));
        elements.add(new Element("Cerium", 58, "Ce", 140.116, "Lanthanide"));
        elements.add(new Element("Praseodymium", 59, "Pr", 140.90766, "Lanthanide"));
        elements.add(new Element("Neodymium", 60, "Nd", 144.24, "Lanthanoid"));
        elements.add(new Element("Promethium", 61, "Pm", 145.0, "Lanthanoid"));
        elements.add(new Element("Samarium", 62, "Sm", 150.36, "Lanthanoid"));
        elements.add(new Element("Europium", 63, "Eu", 151.96, "Lanthanoid"));
        elements.add(new Element("Gadolinium", 64, "Gd", 157.25, "Lanthanoid"));
        elements.add(new Element("Terbium", 65, "Tb", 158.93, "Lanthanoid"));
        elements.add(new Element("Dysprosium", 66, "Dy", 162.50, "Lanthanoid"));
        elements.add(new Element("Holmium", 67, "Ho", 164.93, "Lanthanoid"));
        elements.add(new Element("Erbium", 68, "Er", 167.26, "Lanthanoid"));
        elements.add(new Element("Thulium", 69, "Tm", 168.93, "Lanthanoid"));
        elements.add(new Element("Ytterbium", 70, "Yb", 173.05, "Lanthanoid"));
        elements.add(new Element("Lutetium", 71, "Lu", 175.0, "Lanthanoid"));
        elements.add(new Element("Hafnium", 72, "Hf", 178.49, "Transition metal"));
        elements.add(new Element("Tantalum", 73, "Ta", 180.95, "Transition metal"));
        elements.add(new Element("Tungsten", 74, "W", 183.84, "Transition metal"));
        elements.add(new Element("Rhenium", 75, "Re", 186.207, "Transition metal"));
        elements.add(new Element("Osmium", 76, "Os", 190.23, "Transition metal"));
        elements.add(new Element("Iridium", 77, "Ir", 192.217, "Transition metal"));
        elements.add(new Element("Platinum", 78, "Pt", 195.084, "Transition metal"));
        elements.add(new Element("Gold", 79, "Au", 196.967, "Transition metal"));
        elements.add(new Element("Mercury", 80, "Hg", 200.592, "Transition metal"));
        elements.add(new Element("Thallium", 81, "Tl", 204.38, "Post-transition metal"));
        elements.add(new Element("Lead", 82, "Pb", 207.2, "Post-transition metal"));
        elements.add(new Element("Bismuth", 83, "Bi", 208.98, "Post-transition metal"));
        elements.add(new Element("Polonium", 84, "Po", 209.0, "Metalloid"));
        elements.add(new Element("Astatine", 85, "At", 210.0, "Halogen"));
        elements.add(new Element("Radon", 86, "Rn", 222.0, "Noble gas"));
        elements.add(new Element("Francium", 87, "Fr", 223.0, "Alkali metal"));
        elements.add(new Element("Radium", 88, "Ra", 226.0, "Alkaline earth metal"));
        elements.add(new Element("Actinium", 89, "Ac", 227.0, "Actinide"));
        elements.add(new Element("Thorium", 90, "Th", 232.038, "Actinide"));
        elements.add(new Element("Protactinium", 91, "Pa", 231.036, "Actinide"));
        elements.add(new Element("Uranium", 92, "U", 238.029, "Actinide"));
        elements.add(new Element("Neptunium", 93, "Np", 237.0, "Actinide"));
        elements.add(new Element("Plutonium", 94, "Pu", 244.0, "Actinide"));
        elements.add(new Element("Americium", 95, "Am", 243.0, "Actinide"));
        elements.add(new Element("Curium", 96, "Cm", 247.0, "Actinide"));
        elements.add(new Element("Berkelium", 97, "Bk", 247.0, "Actinide"));
        elements.add(new Element("Californium", 98, "Cf", 251.0, "Actinide"));
        elements.add(new Element("Einsteinium", 99, "Es", 252.0, "Actinide"));
        elements.add(new Element("Fermium", 100, "Fm", 257.0, "Actinide"));
        elements.add(new Element("Mendelevium", 101, "Md", 258.0, "Actinide"));
        elements.add(new Element("Nobelium", 102, "No", 259.0, "Actinide"));
        elements.add(new Element("Lawrencium", 103, "Lr", 262.0, "Transition metal"));
        elements.add(new Element("Rutherfordium", 104, "Rf", 267.00, "Transition Metal"));
        elements.add(new Element("Dubnium", 105, "Db", 270.00, "Transition Metal"));
        elements.add(new Element("Seaborgium", 106, "Sg", 271.00, "Transition Metal"));
        elements.add(new Element("Bohrium", 107, "Bh", 270.00, "Transition Metal"));
        elements.add(new Element("Hassium", 108, "Hs", 277.00, "Transition Metal"));
        elements.add(new Element("Meitnerium", 109, "Mt", 278.00, "Unknown Chemical Properties"));
        elements.add(new Element("Darmstadtium", 110, "Ds", 281.00, "Unknown Chemical Properties"));
        elements.add(new Element("Roentgenium", 111, "Rg", 280.00, "Unknown Chemical Properties"));
        elements.add(new Element("Copernicium", 112, "Cn", 285.00, "Unknown Chemical Properties"));
        elements.add(new Element("Nihonium", 113, "Nh", 284.00, "Unknown Chemical Properties"));
        elements.add(new Element("Flerovium", 114, "Fl", 289.00, "Post-Transition Metal"));
        elements.add(new Element("Moscovium", 115, "Mc", 288.00, "Unknown Chemical Properties"));
        elements.add(new Element("Livermorium", 116, "Lv", 293.00, "Post-Transition Metal"));
        elements.add(new Element("Tennessine", 117, "Ts", 294.00, "Unknown Chemical Properties"));
        elements.add(new Element("Oganesson", 118, "Og", 294.00, "Unknown Chemical Properties"));
    }
    public List<Element> getName(String name)
    {
        ArrayList<Element> names=new ArrayList<>();
        for (Element e:elements) {
            if(e.getName().equals(name)) {
                names.add(e);
            }
        }
        return names;
    }
    public List<Element> getAtomicNumber(int num)
    {
        ArrayList<Element> nums=new ArrayList<>();
        for (Element e:elements) {
            if(e.getAtomicNum()==num) {
                nums.add(e);
            }
        }
        return nums;
    }
    public List<Element> getSymbol(String Sym)
    {
        ArrayList<Element> Symbols=new ArrayList<>();
        for (Element e:elements) {
            if(e.getSymbol().equals(Sym)) {
                Symbols.add(e);
            }
        }
        return Symbols;
    }
    public List<Element> getAtomicMass(double AtomicMass)
    {
        ArrayList<Element> AtomicNums=new ArrayList<>();
        for (Element e:elements) {
            if(e.getAtomicMass()==AtomicMass) {
                AtomicNums.add(e);
            }
        }
        return AtomicNums;
    }
    public List<Element> getGroup(String Group)
    {
        ArrayList<Element> ChemicalGroup=new ArrayList<>();
        for (Element e:elements) {
            if(e.getName().equals(Group)) {
                ChemicalGroup.add(e);
            }
        }
        return ChemicalGroup;
    }


}
