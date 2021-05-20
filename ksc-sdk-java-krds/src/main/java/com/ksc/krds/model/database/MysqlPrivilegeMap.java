package com.ksc.krds.model.database;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MysqlPrivilegeMap {

    private final static String CREATE = "CREATE";
    private final static String DROP = "DROP";
    private final static String GRANTOPTION = "GRANT OPTION";
    private final static String REFERENCES = "REFERENCES";
    private final static String ALTER = "ALTER";
    private final static String DELETE = "DELETE";
    private final static String INDEX = "INDEX";
    private final static String INSERT = "INSERT";
    private final static String SELECT = "SELECT";
    private final static String UPDATE = "UPDATE";
    private final static String CREATEVIEW = "CREATE VIEW";
    private final static String SHOWVIEW = "SHOW VIEW";
    private final static String ALTERROUTINE = "ALTER ROUTINE";
    private final static String CREATEROUTINE = "CREATE ROUTINE";
    private final static String EXECUTE = "EXECUTE";
    private final static String FILE = "FILE";
    private final static String CREATETEMPORARYTABLES = "CREATE TEMPORARY TABLES";
    private final static String LOCKTABLES = "LOCK TABLES";
    private final static String CREATEUSER = "CREATE USER";
    private final static String PROCESS = "PROCESS";
    private final static String RELOAD = "RELOAD";
    private final static String REPLICATIONCLIENT = "REPLICATION CLIENT";
    private final static String REPLICATIONSLAVE = "REPLICATION SLAVE";
    private final static String SHOWDATABASES = "SHOW DATABASES";
    private final static String SHUTDOWN = "SHUTDOWN";
    private final static String SUPER = "SUPER";
    private final static String EVENT = "EVENT";
    private final static String TRIGGER = "TRIGGER";

    public static Set<String> readOnlyPrivSet = new HashSet<String>(Arrays.asList(
            SELECT,
            LOCKTABLES,
            SHOWVIEW));

    public static Set<String> readWritePrivSet = new HashSet<String>(Arrays.asList(
            SELECT,
            INSERT,
            UPDATE,
            DELETE,
            CREATE,
            DROP,
            REFERENCES,
            INDEX,
            ALTER,
            CREATETEMPORARYTABLES,
            LOCKTABLES,
            EXECUTE,
            CREATEVIEW,
            SHOWVIEW,
            CREATEROUTINE,
            ALTERROUTINE,
            EVENT,
            TRIGGER
    ));

    public static Set<String> ddlOnlyPrivSet = new HashSet<String>(Arrays.asList(
            CREATE,
            DROP,
            INDEX,
            ALTER,
            CREATETEMPORARYTABLES,
            LOCKTABLES,
            CREATEVIEW,
            SHOWVIEW,
            CREATEROUTINE,
            ALTERROUTINE
    ));

    public static Set<String> dmlOnlyPrivSet = new HashSet<String>(Arrays.asList(
            SELECT,
            INSERT,
            UPDATE,
            DELETE,
            CREATETEMPORARYTABLES,
            LOCKTABLES,
            EXECUTE,
            SHOWVIEW,
            EVENT,
            TRIGGER
    ));

    public static FrontPrivilege getFrontPrivilege(Set privSet){
        if (privSet == null ) return null;

        //must not change the order
        if (privSet.containsAll(readWritePrivSet)){
            return FrontPrivilege.ReadWrite;
        } else if (privSet.containsAll(dmlOnlyPrivSet)){
            return FrontPrivilege.DMLOnly;
        } else if (privSet.containsAll(ddlOnlyPrivSet)){
            return FrontPrivilege.DDLOnly;
        } else if (privSet.containsAll(readOnlyPrivSet)){
            return FrontPrivilege.ReadOnly;
        }
        return FrontPrivilege.UnKnown;
    }

    public enum FrontPrivilege{
        ReadOnly(readOnlyPrivSet),
        ReadWrite(readWritePrivSet),
        DDLOnly(ddlOnlyPrivSet),
        DMLOnly(dmlOnlyPrivSet),
        UnKnown(null);
        public Set privSet;
        FrontPrivilege(Set privSet){
            this.privSet = privSet;
        }
    }

}
