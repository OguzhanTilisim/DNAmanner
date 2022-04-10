package edu.umsl;

class avacado extends Plant {
    @Override
    public String toString() {
        String data = "Food: " + eatFood() + ", Reproduction: " + modeOfReproduction();
        return data;
    }
}