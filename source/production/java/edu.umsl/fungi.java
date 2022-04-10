package edu.umsl;

class Fungi extends creature implements Reproduction {

    @Override
    public String feed() {
        return "external digestion with hyphae)";
    }

    @Override
    public String modeReproduction() {
        return "Spores";
    }

}
