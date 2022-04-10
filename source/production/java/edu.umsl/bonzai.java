package edu.umsl;

class bonzai extends Plant {
    @Override
    public String toString() {
        String data = "Food: " + feed() + ", Reproduction: " + modeReproduction();
        return data;
    }
}
