package groupId;

import groupId.keyIdClass.SubscriptionKey;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "subscriptions")
public class Subscription {
    @EmbeddedId
    private SubscriptionKey id;
    @Column(name = "student_id", insertable = false, updatable = false)
    private int studentId;
    @Column(name = "course_id", insertable = false, updatable = false)
    private int courseId;
    @Column(name = "subscription_date")
    private LocalDateTime subscriptionDate;

    public Subscription() {
    }


    public LocalDateTime getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(LocalDateTime subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public SubscriptionKey getId() {
        return id;
    }

    public void setId(SubscriptionKey id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscription that = (Subscription) o;
        return studentId == that.studentId && courseId == that.courseId && Objects.equals(id, that.id) && Objects.equals(subscriptionDate, that.subscriptionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, studentId, courseId, subscriptionDate);
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", courseId=" + courseId +
                ", subscriptionDate=" + subscriptionDate +
                '}';
    }
}
