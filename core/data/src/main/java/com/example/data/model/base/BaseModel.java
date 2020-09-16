package com.example.data.model.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@MappedSuperclass
@JsonIgnoreProperties(
        value = {"id, deleted"}
)
public abstract class BaseModel {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "deleted", insertable = false, nullable = false,
            columnDefinition = "BIGINT(20) default '0'")
    @JsonIgnore
    private Long deleted;

    @Column(name = "delete_time")
    @JsonIgnore
    private LocalDateTime deleteTime;

    public BaseModel(Long id) {
        this.id = id;
    }
}
