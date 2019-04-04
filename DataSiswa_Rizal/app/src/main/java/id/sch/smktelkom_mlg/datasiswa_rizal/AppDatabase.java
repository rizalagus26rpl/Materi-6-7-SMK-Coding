package id.sch.smktelkom_mlg.datasiswa_rizal;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {SiswaModel.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract SiswaDao userDao();
}
