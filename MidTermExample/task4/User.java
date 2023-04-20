public class User {
    private Double OIB;
    private String name;
    private String surname;
    private ServiceType serviceType;

    public User(Double OIB, String name, String surname, ServiceType serviceType){
        this.OIB=OIB;
        this.name=name;
        this.surname=surname;
        this.serviceType=serviceType;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }
    public Double getOIB() {
        return OIB;
    }
    public ServiceType getServiceType() {
        return serviceType;
    }
    public void setOIB(Double OIB) {
        this.OIB = OIB;
    }
    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }
}
