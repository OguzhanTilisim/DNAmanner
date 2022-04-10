package edu.umsl;

class cat extends Animal {
    @Override
    public String toString() {
        String data = "Food: " + feed() + ", Reproduction: " + modeReproduction();
        return data;
    }
}
