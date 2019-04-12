package smktelkom_mlg.sch.id.myapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static  final String DATABASE_NAME = "data.db";
    private static final int DATABASE_VERSION = 1;

//    Constructor dari class DataHelper
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

//    Method oCreate berfungsi untuk membuat database
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table biodata(no integer primary key, nama text null, tgl text null, jk text null, alamat text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO biodata (no, nama, tgl, jk, alamat) VALUES ('1', 'Finda Nofitri Andiyah', '2001-11-22', 'Perempuan','Malang');";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {

    }
}

