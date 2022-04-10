package edu.umsl;
class oneki extends Fungi {
    @Override
    public String toString() {
        String data = "Food: " + eatFood() + ", Reproduction: " + modeOfReproduction();
        return data;
    }
}