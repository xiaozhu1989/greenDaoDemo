package com.zzb.greendaodemo.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "WORK_LOG_BEAN".
*/
public class WorkLogBeanDao extends AbstractDao<WorkLogBean, Long> {

    public static final String TABLENAME = "WORK_LOG_BEAN";

    /**
     * Properties of entity WorkLogBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property TimeLong = new Property(1, Long.class, "timeLong", false, "TIMELONG");
        public final static Property TimeStr = new Property(2, String.class, "timeStr", false, "TIMESTR");
        public final static Property Description = new Property(3, String.class, "description", false, "DESCRIPTION");
    }


    public WorkLogBeanDao(DaoConfig config) {
        super(config);
    }
    
    public WorkLogBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"WORK_LOG_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT UNIQUE ," + // 0: id
                "\"TIMELONG\" INTEGER," + // 1: timeLong
                "\"TIMESTR\" TEXT," + // 2: timeStr
                "\"DESCRIPTION\" TEXT);"); // 3: description
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"WORK_LOG_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, WorkLogBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long timeLong = entity.getTimeLong();
        if (timeLong != null) {
            stmt.bindLong(2, timeLong);
        }
 
        String timeStr = entity.getTimeStr();
        if (timeStr != null) {
            stmt.bindString(3, timeStr);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(4, description);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, WorkLogBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long timeLong = entity.getTimeLong();
        if (timeLong != null) {
            stmt.bindLong(2, timeLong);
        }
 
        String timeStr = entity.getTimeStr();
        if (timeStr != null) {
            stmt.bindString(3, timeStr);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(4, description);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public WorkLogBean readEntity(Cursor cursor, int offset) {
        WorkLogBean entity = new WorkLogBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // timeLong
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // timeStr
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // description
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, WorkLogBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTimeLong(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setTimeStr(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDescription(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(WorkLogBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(WorkLogBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(WorkLogBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}