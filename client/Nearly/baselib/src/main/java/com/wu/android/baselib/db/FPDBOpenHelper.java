package com.wu.android.baselib.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by Nowy on 2015/12/31.
 */
public class FPDBOpenHelper extends SQLiteOpenHelper {

    private static FPDBOpenHelper instance = null;
    public FPDBOpenHelper(Context context){
        super(context, FPDB.NAME, null,  FPDB.VERSION);
    }


    private synchronized static void syncInit(Context context){
        if(null == instance){
            instance = new  FPDBOpenHelper(context);
        }

    }

    public static  FPDBOpenHelper getInstance(Context context){
        if(null == instance){
            syncInit(context);
        }

        return instance;
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(FPDB.BackTask.SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
