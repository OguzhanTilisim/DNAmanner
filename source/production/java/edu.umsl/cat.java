package edu.umsl;

class cat extends Animal {
    @Override
    public String toString() {
        String data = "Food: " + eatFood() + ", Reproduction: " + modeOfReproduction();
        return data;
    }
}
