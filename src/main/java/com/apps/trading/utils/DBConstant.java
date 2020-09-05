package com.apps.trading.utils;

public class DBConstant {
    private DBConstant() {
    }


    //global
    public static final String TIMESTAMP_COL_DEF = "timestamp with time zone";
    public static final String CREATED_AT = "created_at";
    public static final String CREATED_BY = "created_by";
    public static final String UPDATED_AT = "updated_at";
    public static final String UPDATED_BY = "updated_by";
    public static final String ID_GEN = "idgen";
    public static final String USE_ID_OR_GENERATE_PACKAGE = "com.apps.trading.models.UseIdOrGenerate";
    public static final String ONE = "1";
    public static final String NAME = "name";

    //Sequence names
    public static final String SEQUENCE_NAME = "sequence_name";
    public static final String SEQ_PRIVATE = "seq_private";
    public static final String SEQ_ACCOUNT_TRANSACTION = "seq_account_transaction";
    public static final String SEQ_APP = "seq_app";
    public static final String INITIAL_VALUE = "initial_value";
    public static final String INCREMENT_SIZE = "increment_size";
    public static final String OPTIMIZER = "optimizer";
    public static final String POOLED_LO = "pooled-lo";

    //Account Group table
    public static final String ACCOUNT_GROUPS = "account_groups";
    public static final String ACCOUNT = "account";
    public static final String ACCOUNT_TYPE = "account_type";
}
