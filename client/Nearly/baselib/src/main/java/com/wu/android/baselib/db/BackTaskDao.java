package com.wu.android.baselib.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.wu.android.baselib.model.BackTask;


/**
 * Created by Nowy on 2015/12/31.
 */
public class BackTaskDao {
    private FPDBOpenHelper dbHelper = null;
    public BackTaskDao(Context context){
        dbHelper = FPDBOpenHelper.getInstance(context);
    }



    public void addTask(BackTask task){
        SQLiteDatabase sqLiteDatabase =dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put( FPDB.BackTask.COLUMN_OWNER,task.getOwner());
        contentValues.put( FPDB.BackTask.COLUMN_PATH,task.getPath());
        contentValues.put( FPDB.BackTask.COLUMN_STATE,task.getState());
        task.setId(sqLiteDatabase.insert( FPDB.BackTask.TABLE_NAME,null,contentValues));
    }


    public void updateTask(BackTask task){
        SQLiteDatabase dbBase =dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(FPDB.BackTask.COLUMN_OWNER,task.getOwner());
        contentValues.put(FPDB.BackTask.COLUMN_PATH,task.getPath());
        contentValues.put(FPDB.BackTask.COLUMN_STATE,task.getState());

        String whereClause =  FPDB.BackTask.COLUMN_ID + "=?";
        String[] whereArgs = new String[] { task.getId() + "" };

        dbBase.update( FPDB.BackTask.TABLE_NAME, contentValues, whereClause, whereArgs);

    }


    public void updateTask(long id,int state){
        SQLiteDatabase dbBase =dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put( FPDB.BackTask.COLUMN_STATE,state);

        String whereClause =  FPDB.BackTask.COLUMN_ID + "=?";
        String[] whereArgs = new String[] { id + "" };

        dbBase.update( FPDB.BackTask.TABLE_NAME,contentValues,whereClause,whereArgs);

    }


    public Cursor query(String owner){
        SQLiteDatabase dbBase =dbHelper.getReadableDatabase();
        String sql = "select * from " +  FPDB.BackTask.TABLE_NAME + " where "
                +  FPDB.BackTask.COLUMN_OWNER + "=?";
        return dbBase.rawQuery(sql,new String[]{ owner });
    }


    public Cursor query(String owner,int state){
        SQLiteDatabase dbBase =dbHelper.getReadableDatabase();
        String sql = "select * from " +  FPDB.BackTask.TABLE_NAME + " where "
                +  FPDB.BackTask.COLUMN_OWNER + "=? and "
                + FPDB.BackTask.COLUMN_STATE + "=?";
        return dbBase.rawQuery(sql,new String[]{ owner ,state+"" });
    }
}
