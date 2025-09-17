package groupId;



import groupId.keyIdClass.PurchaselistKey;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Objects;
@Entity
@Table(name="purchaselist")

public class PurchaseList {
    @EmbeddedId
    private PurchaselistKey id;
    @Column(name="student_name", insertable = false, updatable = false)
    private String studentName;
    @Column(name="course_name", insertable = false, updatable = false)
    private String courseName;
    @Column(name="price")
    private int price;
    @Column(name="subscription_date")
    private LocalDateTime subscriptionDate;

    public PurchaseList() {
    }

    public PurchaselistKey getId() {
        return id;
    }

    public void setId(PurchaselistKey id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(LocalDateTime subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseList that = (PurchaseList) o;
        return price == that.price && Objects.equals(id, that.id) && Objects.equals(studentName, that.studentName) && Objects.equals(courseName, that.courseName) && Objects.equals(subscriptionDate, that.subscriptionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, studentName, courseName, price, subscriptionDate);
    }

    @Override
    public String toString() {
        return "PurchaseList{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", price=" + price +
                ", subscriptionDate=" + subscriptionDate +
                '}';
    }
}
