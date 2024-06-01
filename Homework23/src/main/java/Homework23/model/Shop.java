package Homework23.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Shop {
    private Integer ID;

    public Shop(Integer ID) {
        this.ID = ID;
    }

    public Integer getID() {
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Shop shop = (Shop) o;
        return Objects.equals(ID, shop.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
