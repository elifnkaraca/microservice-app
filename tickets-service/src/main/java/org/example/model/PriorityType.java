package org.example.model;

import lombok.Getter;

@Getter
public enum PriorityType {

    URGENT("Acil"),
    LOW("Düşük"),
    HIGH("Yüsek Öncelikli");

    private String label;

    PriorityType(String label){
        this.label = label;
    }
}
