package com.example.data.database;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.data.database.entities.DbHabit;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class HabitsDAO_Impl implements HabitsDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DbHabit> __insertionAdapterOfDbHabit;

  private final EntityDeletionOrUpdateAdapter<DbHabit> __deletionAdapterOfDbHabit;

  private final EntityDeletionOrUpdateAdapter<DbHabit> __updateAdapterOfDbHabit;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public HabitsDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDbHabit = new EntityInsertionAdapter<DbHabit>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `habits` (`habit_id`,`name`,`description`,`priority`,`type`,`period`,`counter`,`int_color`,`date`,`uid`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DbHabit value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        stmt.bindLong(4, value.getPriority());
        stmt.bindLong(5, value.getType());
        stmt.bindLong(6, value.getPeriod());
        stmt.bindLong(7, value.getCounter());
        stmt.bindLong(8, value.getIntColor());
        stmt.bindLong(9, value.getDate());
        if (value.getUid() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getUid());
        }
      }
    };
    this.__deletionAdapterOfDbHabit = new EntityDeletionOrUpdateAdapter<DbHabit>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `habits` WHERE `habit_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DbHabit value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfDbHabit = new EntityDeletionOrUpdateAdapter<DbHabit>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `habits` SET `habit_id` = ?,`name` = ?,`description` = ?,`priority` = ?,`type` = ?,`period` = ?,`counter` = ?,`int_color` = ?,`date` = ?,`uid` = ? WHERE `habit_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DbHabit value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDescription());
        }
        stmt.bindLong(4, value.getPriority());
        stmt.bindLong(5, value.getType());
        stmt.bindLong(6, value.getPeriod());
        stmt.bindLong(7, value.getCounter());
        stmt.bindLong(8, value.getIntColor());
        stmt.bindLong(9, value.getDate());
        if (value.getUid() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getUid());
        }
        if (value.getId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindLong(11, value.getId());
        }
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM habits";
        return _query;
      }
    };
  }

  @Override
  public long insertHabit(final DbHabit habit) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfDbHabit.insertAndReturnId(habit);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteHabit(final DbHabit habit) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfDbHabit.handle(habit);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateHabit(final DbHabit habit) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfDbHabit.handle(habit);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clear() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClear.release(_stmt);
    }
  }

  @Override
  public Flow<List<DbHabit>> getAllHabits() {
    final String _sql = "SELECT * FROM habits";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"habits"}, new Callable<List<DbHabit>>() {
      @Override
      public List<DbHabit> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "habit_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfPeriod = CursorUtil.getColumnIndexOrThrow(_cursor, "period");
          final int _cursorIndexOfCounter = CursorUtil.getColumnIndexOrThrow(_cursor, "counter");
          final int _cursorIndexOfIntColor = CursorUtil.getColumnIndexOrThrow(_cursor, "int_color");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
          final List<DbHabit> _result = new ArrayList<DbHabit>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DbHabit _item;
            final Long _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getLong(_cursorIndexOfId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final int _tmpPriority;
            _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
            final int _tmpType;
            _tmpType = _cursor.getInt(_cursorIndexOfType);
            final int _tmpPeriod;
            _tmpPeriod = _cursor.getInt(_cursorIndexOfPeriod);
            final int _tmpCounter;
            _tmpCounter = _cursor.getInt(_cursorIndexOfCounter);
            final int _tmpIntColor;
            _tmpIntColor = _cursor.getInt(_cursorIndexOfIntColor);
            final long _tmpDate;
            _tmpDate = _cursor.getLong(_cursorIndexOfDate);
            final String _tmpUid;
            if (_cursor.isNull(_cursorIndexOfUid)) {
              _tmpUid = null;
            } else {
              _tmpUid = _cursor.getString(_cursorIndexOfUid);
            }
            _item = new DbHabit(_tmpId,_tmpName,_tmpDescription,_tmpPriority,_tmpType,_tmpPeriod,_tmpCounter,_tmpIntColor,_tmpDate,_tmpUid);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public DbHabit getHabitById(final long id) {
    final String _sql = "SELECT * FROM habits WHERE habit_id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "habit_id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfPriority = CursorUtil.getColumnIndexOrThrow(_cursor, "priority");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfPeriod = CursorUtil.getColumnIndexOrThrow(_cursor, "period");
      final int _cursorIndexOfCounter = CursorUtil.getColumnIndexOrThrow(_cursor, "counter");
      final int _cursorIndexOfIntColor = CursorUtil.getColumnIndexOrThrow(_cursor, "int_color");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfUid = CursorUtil.getColumnIndexOrThrow(_cursor, "uid");
      final DbHabit _result;
      if(_cursor.moveToFirst()) {
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final int _tmpPriority;
        _tmpPriority = _cursor.getInt(_cursorIndexOfPriority);
        final int _tmpType;
        _tmpType = _cursor.getInt(_cursorIndexOfType);
        final int _tmpPeriod;
        _tmpPeriod = _cursor.getInt(_cursorIndexOfPeriod);
        final int _tmpCounter;
        _tmpCounter = _cursor.getInt(_cursorIndexOfCounter);
        final int _tmpIntColor;
        _tmpIntColor = _cursor.getInt(_cursorIndexOfIntColor);
        final long _tmpDate;
        _tmpDate = _cursor.getLong(_cursorIndexOfDate);
        final String _tmpUid;
        if (_cursor.isNull(_cursorIndexOfUid)) {
          _tmpUid = null;
        } else {
          _tmpUid = _cursor.getString(_cursorIndexOfUid);
        }
        _result = new DbHabit(_tmpId,_tmpName,_tmpDescription,_tmpPriority,_tmpType,_tmpPeriod,_tmpCounter,_tmpIntColor,_tmpDate,_tmpUid);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
