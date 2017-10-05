package org.itsimulator.germes.app.model.entity.model.geography;

import org.itsimulator.germes.app.model.entity.model.base.AbstractEntity;
import org.itsimulator.germes.app.model.entity.model.transport.TransportType;

public class Station extends AbstractEntity {

    private City city;

    private Address address;

    private String phone;

    private Coordinate coordinate;

    private TransportType transportType;

    public Station() {
    }

    /**
     * You shouldn't create station object directly. Use {@link City}
     * functionality instead
     *
     * @param city
     * @param transportType
     */
    public Station(City city, TransportType transportType) {
        this.city = city;
        this.transportType = transportType;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    //TODO:  Добавить match, equals, hashcode

}
