package org.example.beans;

public class ThingOne {
    ThingTwo thingTwo;
    ThingThree thingThree;

    public ThingOne(ThingTwo thingTwo, ThingThree thingThree) {
        this.thingTwo = thingTwo;
        this.thingThree = thingThree;
    }

    @Override
    public String toString() {
        return "ThingOne{" +
                "thingTwo=" + thingTwo +
                ", thingThree=" + thingThree +
                '}';
    }
}
