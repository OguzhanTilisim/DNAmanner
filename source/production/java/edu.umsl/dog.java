package edu.umsl;
class dog extends Animal {
    @Override
    public String toString() {
        String data = "Food: " + eatFood() + ", Reproduction: " + modeOfReproduction();
        return data;
    }
}
