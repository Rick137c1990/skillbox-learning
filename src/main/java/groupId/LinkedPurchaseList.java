package groupId;

import groupId.keyIdClass.KeyLinkedPurchaseList;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "linkedpurchaselist")

public class LinkedPurchaseList {
    @EmbeddedId
    private KeyLinkedPurchaseList id;

    public LinkedPurchaseList() {
    }

    public KeyLinkedPurchaseList getId() {
        return id;
    }

    public void setId(KeyLinkedPurchaseList id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkedPurchaseList that = (LinkedPurchaseList) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "LinkedPurchaseList{" +
                "id=" + id +
                '}';
    }
}
