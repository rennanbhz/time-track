package com.personalproject.timetrack.entities;

import com.personalproject.timetrack.enums.TypeEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column
    private String description;

    @Column
    private String localization;

    @Enumerated(EnumType.STRING)
    private TypeEnum type;

    @ManyToOne(fetch = FetchType.EAGER)
    private Employee employee;

}
