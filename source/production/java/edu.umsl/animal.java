package edu.umsl;

class Animal extends creature implements Reproduction {
    @Override
    public String feed() {
        return "ingestion";
    }
    @Override
    public String modeReproduction() {
        return "Sexual Reproduction";
    }

}
