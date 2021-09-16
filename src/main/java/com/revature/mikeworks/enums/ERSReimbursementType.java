package com.revature.mikeworks.enums;

public enum ERSReimbursementType {
    LODGING, TRAVEL, FOOD, OTHER;

    public static ERSReimbursementType fromInt(Integer input) {
        switch(input) {
            case (1) -> {
                return LODGING;
            }
            case (2) -> {
                return TRAVEL;
            }
            case (3) -> {
                return FOOD;
            }
            default -> {
                return OTHER;
            }
        }
    }

    public static int toInt(ERSReimbursementType input) {
        switch (input) {
            case LODGING -> {
                return 1;
            }
            case TRAVEL -> {
                return 2;
            }
            case FOOD -> {
                return 3;
            }
            default -> {
                return 0;
            }
        }
    }
}
