package com.company;

public final class Me extends Mam {
    private String modelOfphone;

    public Me(String name, int dog, int age, double rost, String modelOfphone) {
        super(name, dog, age, rost);
        this.modelOfphone = modelOfphone;
    }

    public String getModelOfphone() {
        return modelOfphone;
    }

    @Override
    public void legenda(int r) {
        super.legenda(r);
    }
}
