package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class Cart {
    private Integer id;
    private Integer total;
    private String name;
    private Set<Item> items = new HashSet<>();

    public Cart() {
    }

    public Cart(Integer total, String name) {
        this.total = total;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cart)) return false;

        Cart cart = (Cart) o;

        if (getId() != null ? !getId().equals(cart.getId()) : cart.getId() != null) return false;
        if (getTotal() != null ? !getTotal().equals(cart.getTotal()) : cart.getTotal() != null) return false;
        if (getName() != null ? !getName().equals(cart.getName()) : cart.getName() != null) return false;
        return getItems() != null ? getItems().equals(cart.getItems()) : cart.getItems() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getTotal() != null ? getTotal().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getItems() != null ? getItems().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cart{" +
               "id=" + id +
               ", total=" + total +
               ", name='" + name + '\'' +
               ", items=" + items +
               '}';
    }
}
