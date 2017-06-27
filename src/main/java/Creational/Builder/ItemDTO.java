package Creational.Builder;

import jdk.nashorn.internal.ir.annotations.Immutable;

import java.io.Serializable;

/**
 * Created by marek on 27.06.2017.
 */
@Immutable
public class ItemDTO implements Serializable {

    private final static long serialVersionUID = 1L;

    private final String name;

    private final String color;

    private final Size size;

    private final int amount;

    private ItemDTO(Builder itemBuilder){
        this.name = itemBuilder.name;
        this.color = itemBuilder.color;
        this.size = itemBuilder.size;
        this.amount = itemBuilder.amount;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public int getAmount() {
        return amount;
    }

    public static class Builder {

        private String name;

        private String color;

        private Size size;

        private int amount;

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withColor(String color) {
            this.color = color;
            return this;
        }
        public Builder withSize(Size size) {
            this.size = size;
            return this;
        }

        public Builder withAmount(int amount) {
            this.amount = amount;
            return this;
        }

        public ItemDTO build() {
            return new ItemDTO(this);
        }

    }
}
