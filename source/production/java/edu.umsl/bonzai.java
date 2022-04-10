package edu.umsl;
class bonzai extends Plant {
    @Override
    public String toString() {
        String data = "Food: " + eatFood() + ", Reproduction: " + modeOfReproduction();
        return data;
    }
}
