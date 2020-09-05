package com.apps.trading.models.domain;

import com.apps.trading.utils.DBConstant;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;

@MappedSuperclass
public class AbstractModel implements Serializable {
    private static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = DBConstant.ID_GEN)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = DBConstant.CREATED_AT, columnDefinition = DBConstant.TIMESTAMP_COL_DEF)
    private Calendar createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = DBConstant.UPDATED_AT, columnDefinition = DBConstant.TIMESTAMP_COL_DEF)
    private Calendar updatedAt;

    @Column(name = DBConstant.CREATED_BY)
    private Long createdBy;

    @Column(name = DBConstant.UPDATED_BY)
    private Long updatedBy;


    @PreUpdate
    @PrePersist
    public void updateTime() {
        if (null == createdAt) {
            this.createdAt = Calendar.getInstance();
            try {
                // code to update createdAt
            } catch (Exception ne) {
                this.createdBy = null;
            }
        }
        try {
            // code to update updatedBy
        } catch (Exception ne) {
            this.updatedBy = null;
        }
        this.updatedAt = Calendar.getInstance();
    }

}
