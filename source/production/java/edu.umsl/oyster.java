package edu.umsl;
class oyster extends Fungi {
    @Override
    public String toString() {
        String data = "Food: " +eatFood() + ", Reproduction: " +modeOfReproduction();
        return data;
    }
}