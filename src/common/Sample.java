package common;

import java.time.LocalDate;

public class Sample {

    private int sampleNumber;
    private String sampleName;
    private LocalDate sampleDate;

    public Sample(int sampleNumber, String sampleName, LocalDate sampleDate) {
        this.sampleNumber = sampleNumber;
        this.sampleName = sampleName;
        this.sampleDate = sampleDate;
    }

    public int getSampleNumber() {
        return sampleNumber;
    }

    public void setSampleNumber(int sampleNumber) {
        this.sampleNumber = sampleNumber;
    }

    public String getSampleName() {
        return sampleName;
    }

    public void setSampleName(String sampleName) {
        this.sampleName = sampleName;
    }

    public LocalDate getSampleDate() {
        return sampleDate;
    }

    public void setSampleDate(LocalDate sampleDate) {
        this.sampleDate = sampleDate;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "sampleNumber=" + sampleNumber +
                ", sampleName='" + sampleName + '\'' +
                ", sampleDate=" + sampleDate +
                '}';
    }
}
