import java.time.LocalDate;
import java.util.Locale;


public class Reading {
    private Integer serialNumber;
    private Double readingValue;
    private LocalDate timestamp;

    public Reading(Integer serialNumber, Double readingValue, LocalDate timestamp){
        this.serialNumber=serialNumber;
        this.readingValue=readingValue;
        this.timestamp=timestamp;
    }
    public LocalDate getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }
    public Double getReadingValue() {
        return readingValue;
    }
    public Integer getSerialNumber() {
        return serialNumber;
    }
    public void setReadingValue(Double readingValue) {
        this.readingValue = readingValue;
    }
    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

}
