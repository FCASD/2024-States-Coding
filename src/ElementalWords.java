import java.util.HashMap;
import java.util.ArrayList;

public class ElementalWords {
    public static final HashMap<String, String> elements = new HashMap<String, String>(); 
    public static boolean isElementsOK = false; 

    public static void instantiateElements() {
        if (!isElementsOK) {
            elements.put("Ca" , "Calcium");
            elements.put("Cf" , "Californium");
            elements.put("C" , "Carbon");
            elements.put("Ce" , "Cerium");
            elements.put("Cs" , "Cesium");
            elements.put("Cl" , "Chlorine");
            elements.put("Cr" , "Chromium");
            elements.put("Co" , "Cobalt");
            elements.put("Cn" , "Copernicium");
            elements.put("Cu" , "Copper");
            elements.put("Cm" , "Curium");
            elements.put("Ds" , "Darmstadtium");
            elements.put("Db" , "Dubnium");
            elements.put("Dy" , "Dysprosium");
            elements.put("Es" , "Einsteinium");
            elements.put("Er" , "Erbium");
            elements.put("Eu" , "Europium");
            elements.put("Fm" , "Fermium");
            elements.put("Fl" , "Flerovium");
            elements.put("F" , "Fluorine");
            elements.put("Fr" , "Francium");
            elements.put("Gd" , "Gadolinium");
            elements.put("Ga" , "Gallium");
            elements.put("Ge" , "Germanium");
            elements.put("Au" , "Gold");
            elements.put("Hf" , "Hafnium");
            elements.put("Hs" , "Hassium");
            elements.put("He" , "Helium");
            elements.put("Ho" , "Holmium");
            elements.put("H" , "Hydrogen");
            elements.put("In" , "Indium");
            elements.put("I" , "Iodine");
            elements.put("Ir" , "Iridium");
            elements.put("Fe" , "Iron");
            elements.put("Kr" , "Krypton");
            elements.put("La" , "Lanthanum");
            elements.put("Lr" , "Lawrencium");
            elements.put("Pb" , "Lead");
            elements.put("Li" , "Lithium");
            elements.put("Lv" , "Livermorium");
            elements.put("Lu" , "Lutetium");
            elements.put("Mg" , "Magnesium");
            elements.put("Mn" , "Manganese");
            elements.put("Mt" , "Meitnerium");
            elements.put("Md" , "Mendelevium");
            elements.put("Hg" , "Mercury");
            elements.put("Mo" , "Molybdenum");
            elements.put("Mc" , "Moscovium");
            elements.put("Nd" , "Neodymium");
            elements.put("Ne" , "Neon");
            elements.put("Np" , "Neptunium");
            elements.put("Ni" , "Nickel");
            elements.put("Nh" , "Nihonium");
            elements.put("Nb" , "Niobium");
            elements.put("N" , "Nitrogen");
            elements.put("No" , "Nobelium");
            elements.put("Og" , "Oganesson");
            elements.put("Os" , "Osmium");
            elements.put("O" , "Oxygen");
            elements.put("Pd" , "Palladium");
            elements.put("P" , "Phosphorus");
            elements.put("Pt" , "Platinum");
            elements.put("Pu" , "Plutonium");
            elements.put("Po" , "Polonium");
            elements.put("K" , "Potassium");
            elements.put("Pr" , "Praseodymium");
            elements.put("Pm" , "Promethium");
            elements.put("Pa" , "Protactinium");
            elements.put("Ra" , "Radium");
            elements.put("Rn" , "Radon");
            elements.put("Re" , "Rhenium");
            elements.put("Rh" , "Rhodium");
            elements.put("Rg" , "Roentgenium");
            elements.put("Rb" , "Rubidium");
            elements.put("Ru" , "Ruthenium");
            elements.put("Rf" , "Rutherfordium");
            elements.put("Sm" , "Samarium");
            elements.put("Sc" , "Scandium");
            elements.put("Sg" , "Seaborgium");
            elements.put("Se" , "Selenium");
            elements.put("Si" , "Silicon");
            elements.put("Ag" , "Silver");
            elements.put("Na" , "Sodium");
            elements.put("Sr" , "Strontium");
            elements.put("S" , "Sulfur");
            elements.put("Ta" , "Tantalum");
            elements.put("Tc" , "Technetium");
            elements.put("Te" , "Tellurium");
            elements.put("Ts" , "Tennessine");
            elements.put("Tb" , "Terbium");
            elements.put("Tl" , "Thallium");
            elements.put("Th" , "Thorium");
            elements.put("Tm" , "Thulium");
            elements.put("Sn" , "Tin");
            elements.put("Ti" , "Titanium");
            elements.put("W" , "Tungsten");
            elements.put("U" , "Uranium");
            elements.put("V" , "Vanadium");
            elements.put("Xe" , "Xenon");
            elements.put("Yb" , "Ytterbium");
            elements.put("Y" , "Yttrium");
            elements.put("Zn" , "Zinc");
            elements.put("Zr" , "Zirconium");
            isElementsOK = true; 
        }
    }

    /**
     * MAIN METHOD TO BE RUN
     */
    public static ArrayList<ArrayList<String>> elementalWords(String s) {
        instantiateElements(); 
        ArrayList<ArrayList<String>> solutions = new ArrayList<ArrayList<String>>(); 
        solutions.add(new ArrayList<String>()); 
        solutions.add(new ArrayList<String>()); 
        recursiveHelper(s, s.substring(0,1), solutions, 1, 0);
        recursiveHelper(s, s.substring(0,2), solutions, 2, 1);
        return solutions; 
    }


    public static ArrayList<ArrayList<String>> recursiveHelper(String s, String nextChar, ArrayList<ArrayList<String>> sols, int nextIdx, int solIdx) {
        if (nextIdx>=s.length()-1) {
            sols.get(solIdx-1).add(nextChar); 
            return sols; 
        }
        System.out.println(sols.size());
        
        String elem = elements.get(nextChar); 

        if (elem == null) {
            sols.remove(solIdx); 
            return sols; 
        }

        sols.get(solIdx).add(elem + " (" + nextChar+ ")");
        sols.add((ArrayList<String>)sols.get(solIdx).clone()); 
        recursiveHelper(s, s.substring(nextIdx+1, nextIdx+2), sols, nextIdx+1, sols.size()); 
        sols.add((ArrayList<String>)sols.get(solIdx).clone()); 
        if (!(nextIdx+2 >= s.length()))
            recursiveHelper(s, s.substring(nextIdx+1, nextIdx+3), sols, nextIdx+2, sols.size()); 
        return sols; 
    }

    public static void main(String[] args) {
        System.out.print(elementalWords("YEs")); 
    }
}
