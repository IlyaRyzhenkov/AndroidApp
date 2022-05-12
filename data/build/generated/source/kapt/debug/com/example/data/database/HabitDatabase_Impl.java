package com.example.data.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class HabitDatabase_Impl extends HabitDatabase {
  private volatile HabitsDAO _habitsDAO;

  private volatile HabitsCompletionDAO _habitsCompletionDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(4) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `habits` (`habit_id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `priority` INTEGER NOT NULL, `type` INTEGER NOT NULL, `period` INTEGER NOT NULL, `counter` INTEGER NOT NULL, `int_color` INTEGER NOT NULL, `date` INTEGER NOT NULL, `uid` TEXT)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_habits_uid` ON `habits` (`uid`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `habits_completion` (`completion_id` INTEGER PRIMARY KEY AUTOINCREMENT, `habit_id` INTEGER, `date` INTEGER NOT NULL DEFAULT 0, `habit_uid` TEXT, FOREIGN KEY(`habit_id`) REFERENCES `habits`(`habit_id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_habits_completion_habit_id_date` ON `habits_completion` (`habit_id`, `date`)");
        _db.execSQL("CREATE INDEX IF NOT EXISTS `index_habits_completion_habit_uid_date` ON `habits_completion` (`habit_uid`, `date`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2de64de86fbbeccc3cb1e8d4fad23136')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `habits`");
        _db.execSQL("DROP TABLE IF EXISTS `habits_completion`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        _db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsHabits = new HashMap<String, TableInfo.Column>(10);
        _columnsHabits.put("habit_id", new TableInfo.Column("habit_id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHabits.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHabits.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHabits.put("priority", new TableInfo.Column("priority", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHabits.put("type", new TableInfo.Column("type", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHabits.put("period", new TableInfo.Column("period", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHabits.put("counter", new TableInfo.Column("counter", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHabits.put("int_color", new TableInfo.Column("int_color", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHabits.put("date", new TableInfo.Column("date", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHabits.put("uid", new TableInfo.Column("uid", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHabits = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHabits = new HashSet<TableInfo.Index>(1);
        _indicesHabits.add(new TableInfo.Index("index_habits_uid", false, Arrays.asList("uid"), Arrays.asList("ASC")));
        final TableInfo _infoHabits = new TableInfo("habits", _columnsHabits, _foreignKeysHabits, _indicesHabits);
        final TableInfo _existingHabits = TableInfo.read(_db, "habits");
        if (! _infoHabits.equals(_existingHabits)) {
          return new RoomOpenHelper.ValidationResult(false, "habits(com.example.data.database.entities.DbHabit).\n"
                  + " Expected:\n" + _infoHabits + "\n"
                  + " Found:\n" + _existingHabits);
        }
        final HashMap<String, TableInfo.Column> _columnsHabitsCompletion = new HashMap<String, TableInfo.Column>(4);
        _columnsHabitsCompletion.put("completion_id", new TableInfo.Column("completion_id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHabitsCompletion.put("habit_id", new TableInfo.Column("habit_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHabitsCompletion.put("date", new TableInfo.Column("date", "INTEGER", true, 0, "0", TableInfo.CREATED_FROM_ENTITY));
        _columnsHabitsCompletion.put("habit_uid", new TableInfo.Column("habit_uid", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHabitsCompletion = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysHabitsCompletion.add(new TableInfo.ForeignKey("habits", "CASCADE", "CASCADE",Arrays.asList("habit_id"), Arrays.asList("habit_id")));
        final HashSet<TableInfo.Index> _indicesHabitsCompletion = new HashSet<TableInfo.Index>(2);
        _indicesHabitsCompletion.add(new TableInfo.Index("index_habits_completion_habit_id_date", false, Arrays.asList("habit_id","date"), Arrays.asList("ASC","ASC")));
        _indicesHabitsCompletion.add(new TableInfo.Index("index_habits_completion_habit_uid_date", false, Arrays.asList("habit_uid","date"), Arrays.asList("ASC","ASC")));
        final TableInfo _infoHabitsCompletion = new TableInfo("habits_completion", _columnsHabitsCompletion, _foreignKeysHabitsCompletion, _indicesHabitsCompletion);
        final TableInfo _existingHabitsCompletion = TableInfo.read(_db, "habits_completion");
        if (! _infoHabitsCompletion.equals(_existingHabitsCompletion)) {
          return new RoomOpenHelper.ValidationResult(false, "habits_completion(com.example.data.database.entities.DbHabitCompletion).\n"
                  + " Expected:\n" + _infoHabitsCompletion + "\n"
                  + " Found:\n" + _existingHabitsCompletion);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "2de64de86fbbeccc3cb1e8d4fad23136", "c3b400047cace9231028504a6e31427d");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "habits","habits_completion");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `habits`");
      _db.execSQL("DELETE FROM `habits_completion`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(HabitsDAO.class, HabitsDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(HabitsCompletionDAO.class, HabitsCompletionDAO_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public HabitsDAO habitsDAO() {
    if (_habitsDAO != null) {
      return _habitsDAO;
    } else {
      synchronized(this) {
        if(_habitsDAO == null) {
          _habitsDAO = new HabitsDAO_Impl(this);
        }
        return _habitsDAO;
      }
    }
  }

  @Override
  public HabitsCompletionDAO habitsCompletionDAO() {
    if (_habitsCompletionDAO != null) {
      return _habitsCompletionDAO;
    } else {
      synchronized(this) {
        if(_habitsCompletionDAO == null) {
          _habitsCompletionDAO = new HabitsCompletionDAO_Impl(this);
        }
        return _habitsCompletionDAO;
      }
    }
  }
}
