package com.pb.lyhtaj.hw7;

public enum Size {

    XXS("детский размер","(евро:32)"),
    XS("подростковый размер","(евро:34)"),
    S("взрослый размер","(евро:36)"),
    M("взрослый размер","(евро:38)"),
    L("взрослый размер","(евро:40)");

    private String description;
    private String euroSize;

    Size(String description, String euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    @Override
    public String toString() {
        return " " +
                " " + description +
                " " + euroSize +
                " ";
    }

    public String getDescription() {
        return description;
    }

    public String getEuroSize() {
        return euroSize;
    }
}
