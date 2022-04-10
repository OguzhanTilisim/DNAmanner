package edu.umsl;

class oyster extends Fungi {
    @Override
    public String toString() {
        String data = "Food: " +feed() + ", Reproduction: " +modeReproduction();
        return data;
    }
}