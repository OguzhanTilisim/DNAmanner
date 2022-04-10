package edu.umsl;

class avacado extends Plant {
    @Override
    public String toString() {
        String data = "Food: " + feed() + ", Reproduction: " + modeReproduction();
        return data;
    }
}