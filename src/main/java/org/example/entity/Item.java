package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class Item {
    private Integer id;
    private Integer total;
    private Set<Cart> carts = new HashSet<>();

    public Item() {
    }

    public Item(Integer total) {
        this.total = total;
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

    public Set<Cart> getCarts() {
        return carts;
    }

    public void setCarts(Set<Cart> carts) {
        this.carts = carts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;

        Item item = (Item) o;

        if (getId() != null ? !getId().equals(item.getId()) : item.getId() != null) return false;
        if (getTotal() != null ? !getTotal().equals(item.getTotal()) : item.getTotal() != null) return false;
        return getCarts() != null ? getCarts().equals(item.getCarts()) : item.getCarts() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getTotal() != null ? getTotal().hashCode() : 0);
        result = 31 * result + (getCarts() != null ? getCarts().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Item{" +
               "id=" + id +
               ", total=" + total +
               ", carts=" + carts +
               '}';
    }
}
