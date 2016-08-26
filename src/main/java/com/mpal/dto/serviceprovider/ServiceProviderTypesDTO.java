package com.mpal.dto.serviceprovider;

/**
 * Created by System1 on 8/16/2016.
 */
public class ServiceProviderTypesDTO {

    private  int id;
    private String type;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServiceProviderTypesDTO that = (ServiceProviderTypesDTO) o;

        if (id != that.id) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        return status != null ? status.equals(that.status) : that.status == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ServiceProviderTypesDTO{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
