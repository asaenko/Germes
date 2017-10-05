package org.itsimulator.germes.app.model.entity.model.base;

import org.itsimulator.germes.app.model.entity.model.person.Account;

import java.time.LocalDateTime;

public class AbstractEntity {
    public static final String FIELD_CREATED_AT = "createdAt";
    /**
     * Уникальный идентификатор объекта
     */
    private int id;

    /**
     * Время создания сущности
     */
    private LocalDateTime createdAt;

    /**
     * Время последней модификации
     */
    private LocalDateTime modifiedAt;

    /**
     * Личность кто создал объект
     */
    private Account createdBy;

    /**
     * Последний кто модифицировал объект
     */
    private Account modifiedBy;

    private int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDateTime modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public Account getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Account createdBy) {
        this.createdBy = createdBy;
    }

    public Account getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Account modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractEntity that = (AbstractEntity) o;

        if (getId() != that.getId()) return false;
        if (getCreatedAt() != null ? !getCreatedAt().equals(that.getCreatedAt()) : that.getCreatedAt() != null)
            return false;
        if (getModifiedAt() != null ? !getModifiedAt().equals(that.getModifiedAt()) : that.getModifiedAt() != null)
            return false;
        if (getCreatedBy() != null ? !getCreatedBy().equals(that.getCreatedBy()) : that.getCreatedBy() != null)
            return false;
        return getModifiedBy() != null ? getModifiedBy().equals(that.getModifiedBy()) : that.getModifiedBy() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getCreatedAt() != null ? getCreatedAt().hashCode() : 0);
        result = 31 * result + (getModifiedAt() != null ? getModifiedAt().hashCode() : 0);
        result = 31 * result + (getCreatedBy() != null ? getCreatedBy().hashCode() : 0);
        result = 31 * result + (getModifiedBy() != null ? getModifiedBy().hashCode() : 0);
        return result;
    }
}
