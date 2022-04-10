package edu.umsl;

class oneki extends Fungi {
    @Override
    public String toString() {
        String data = "Food: " + feed() + ", Reproduction: " + modeReproduction();
        return data;
    }
}