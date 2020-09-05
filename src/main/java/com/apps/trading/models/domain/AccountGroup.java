package com.apps.trading.models.domain;

import com.apps.trading.utils.DBConstant;
import com.apps.trading.utils.ValidationConstant;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = DBConstant.ACCOUNT_GROUPS)
@GenericGenerator(
        name = DBConstant.ID_GEN,
        strategy = DBConstant.USE_ID_OR_GENERATE_PACKAGE,
        parameters = {
                @org.hibernate.annotations.Parameter(name = DBConstant.SEQUENCE_NAME, value = DBConstant.SEQ_APP),
                @org.hibernate.annotations.Parameter(name = DBConstant.INITIAL_VALUE, value = DBConstant.ONE),
                @org.hibernate.annotations.Parameter(name = DBConstant.INCREMENT_SIZE, value = DBConstant.ONE),
                @org.hibernate.annotations.Parameter(name = DBConstant.OPTIMIZER, value = DBConstant.POOLED_LO)
        }
)
public class AccountGroup extends AbstractModel {
    @Column(name = DBConstant.NAME, length = ValidationConstant.NAME)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
