package hu.webuni.commonlib.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.MDC;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

    @Column(updatable = false)
    private LocalDate creationDate;
    @Column(updatable = false)
    private LocalTime creationTime;
    @Column(updatable = false)
    private String creationUsername;
    private LocalDate lastModifiedDate;
    private LocalTime lastModifiedTime;
    private String lastModifiedUsername;

    public BaseEntity() {
    }

    public BaseEntity(
            LocalDate creationDate, LocalTime creationTime, String creationUsername, LocalDate
            lastModifiedDate, LocalTime lastModifiedTime, String lastModifiedUsername
    ) {
        this.creationDate = creationDate;
        this.creationTime = creationTime;
        this.creationUsername = creationUsername;
        this.lastModifiedDate = lastModifiedDate;
        this.lastModifiedTime = lastModifiedTime;
        this.lastModifiedUsername = lastModifiedUsername;
    }

    @PrePersist
    public void prePersist() {
        creationDate = LocalDate.now();
        creationTime = LocalTime.now();
        creationUsername = MDC.get("username");
    }

    @PreUpdate
    public void preUpdate() {
        lastModifiedDate = LocalDate.now();
        lastModifiedTime = LocalTime.now();
        lastModifiedUsername = MDC.get("username");
    }
}
