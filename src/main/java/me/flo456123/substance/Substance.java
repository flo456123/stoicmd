package me.flo456123.substance;

import me.flo456123.substance.reactants.Reactant;

public class Substance {
    private double   nMoles;
    private Reactant reactant;
    private double   mass;
    private Unit     unit;

    /**
     * Substance stores a reactant along with its mass, unit, and moles
     * @param n number of moles
     * @param r the reactant of the substance
     * @param unit what unit the substance is
     */
    public Substance(double n, Reactant r, Unit unit) {
        setnMoles(n);
        setReactant(r);
        setMass();
        setUnit(unit);
    }

    public double getMoles() {
        return nMoles;
    }

    private void setnMoles(double n) {
        if (n < 0) {
            throw new SubstanceException("invalid number of moles - moles cannot be negative");
        }

        nMoles = n;
    }

    public Reactant getReactant() {
        return reactant;
    }

    private void setReactant(Reactant reactant) {
        this.reactant = reactant;
    }

    public double getMass() {
        return mass;
    }

    private void setMass() {
        // the conversion factor method gives me the atomic mass
        // of the element, so i can use it here even though it
        // doesnt make sense
        mass = getReactant().getConversionFactor(Unit.GRAMS);
    }

    public Unit getUnit() {
        return unit;
    }

    private void setUnit(Unit unit) {
        this.unit = unit;
    }

}