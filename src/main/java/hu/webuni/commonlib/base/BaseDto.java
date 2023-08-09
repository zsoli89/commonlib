package hu.webuni.commonlib.base;

import java.time.LocalDate;
import java.time.LocalTime;

public class BaseDto {

    private LocalDate creationDate;
    private LocalTime creationTime;
    private String creationUsername;
    private LocalDate lastModifiedDate;
    private LocalTime lastModifiedTime;
    private String lastModifiedUsername;

    public BaseDto() {
    }

    public BaseDto(
            LocalDate creationDate, LocalTime creationTime, String creationUsername, LocalDate lastModifiedDate,
                   LocalTime lastModifiedTime, String lastModifiedUsername
    ) {
        this.creationDate = creationDate;
        this.creationTime = creationTime;
        this.creationUsername = creationUsername;
        this.lastModifiedDate = lastModifiedDate;
        this.lastModifiedTime = lastModifiedTime;
        this.lastModifiedUsername = lastModifiedUsername;
    }

}
