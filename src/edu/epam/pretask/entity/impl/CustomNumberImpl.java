package edu.epam.pretask.entity.impl;

import edu.epam.pretask.entity.CustomNumber;

public class CustomNumberImpl implements CustomNumber {
    private double value;

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return (int) (31 + value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        return ((CustomNumberImpl) obj).getValue() == this.getValue();
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
