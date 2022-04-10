package edu.umsl;

class dog extends Animal {
    @Override
    public String toString() {
        String data = "Food: " + feed() + ", Reproduction: " + modeReproduction();
        return data;
    }
}
