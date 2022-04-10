package edu.umsl;

class Plant extends creature implements Reproduction {
    @Override
    public String feed() {
        return "sunlight (aka photosynthesis)";
    }
    @Override
    public String modeReproduction() {
        return "Seeds";
    }

}
