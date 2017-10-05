package org.itsimulator.germes.app.model.entity.model.geography;

import org.itsimulator.germes.app.model.entity.model.base.AbstractEntity;

public class Address extends AbstractEntity{


    private String zipCode;

    private String street;

    private String houseNo;

    /**
     * (Optional) Номер квартиры
     * Адрес — это класс, который может использоваться по всему приложению,
     * например, и для указания адреса клиента или организации,
     * где номер квартиры (или офиса) необходим.
     */
    private String apartment;


    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}
