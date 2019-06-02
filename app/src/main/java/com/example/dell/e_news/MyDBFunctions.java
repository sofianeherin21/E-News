package com.example.dell.e_news;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Dell on 2/6/2017.
 */

public class MyDBFunctions extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION=1;
    private static final String DATABSE_NAME = "mydb.db";
    private static final String TABLE_NAME = "mytab";

    private static final String TAB_ID = "id";
    private static final String TAB_NAME = "name";
    private static final String TAB_EMAIL = "email";
    private static final String TAB_OCC = "occupation";
    private static final String TAB_LOC = "location";
    private static final String TAB_BDAY = "bday";
    private static final String TAB_Pass = "password";

    String CREATE_USER_TABLE="CREATE TABLE "+ TABLE_NAME +"("
            + TAB_ID +" INTEGER PRIMARY KEY not null,"
            + TAB_NAME +" TEXT not null, "
            + TAB_EMAIL +" TEXT not null, "
            + TAB_Pass +" TEXT not null, "
            + TAB_OCC +" TEXT not null, "
            + TAB_LOC +" TEXT not null, "
            + TAB_BDAY +" TEXT not null "+")";

    MyDBFunctions(Context c){
        super(c, DATABSE_NAME, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String s = "CREATE TABLE "+CREATE_USER_TABLE;
        db.execSQL(s);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    // ---- ---- adding data to database --- -----

    void addingDataToTable(DataTemp dt){

        SQLiteDatabase sqd  = this.getWritableDatabase();
        String query="SELECT * FROM "+TABLE_NAME;
        Cursor cursor=sqd.rawQuery(query,null);
        int count =cursor.getCount();


        ContentValues cv = new ContentValues();
        cv.put(TAB_ID, count);
        cv.put(TAB_NAME, dt.getName());
        cv.put(TAB_EMAIL,dt.getEmail());
        cv.put(TAB_LOC,dt.getLocation());
        cv.put(TAB_OCC,dt.getOcc());
        cv.put(TAB_BDAY,dt.getBday());
        cv.put(TAB_Pass, dt.getPass());



        sqd.insert(TABLE_NAME, null, cv);
        sqd.close();

    }


    // --- ---- showing data ------ ----

    String[] my_data() {

        SQLiteDatabase sq = this.getReadableDatabase();

        String q = "SELECT * FROM "+TABLE_NAME;

        Cursor c = sq.rawQuery(q, null);

        String[] recvied_data = new String[c.getCount()];

        c.moveToFirst();

        if(c.moveToFirst()){
            int counter = 0 ;
            do {
                recvied_data[counter] = c.getString(c.getColumnIndex(TAB_NAME+"")) +"\nPass: "+
                        c.getString(c.getColumnIndex(TAB_Pass+""));
                counter = counter+1;

            } while(c.moveToNext());

        }

        return recvied_data;
    }


    String fetch_pass(String id) {

        SQLiteDatabase sq = this.getReadableDatabase();

        String q = "SELECT "+TAB_Pass+" FROM "+TABLE_NAME+" WHERE "+TAB_NAME+" = "+id;

        Cursor c = sq.rawQuery(q, null);
        String s = "";

        c.moveToFirst();

        if(c.moveToFirst()) {
            s = c.getString(c.getColumnIndex(TAB_Pass+""));
        }

        return s;

    }
    String searchPassword(String username)
    {
        SQLiteDatabase db =this.getReadableDatabase();

        String query = "SELECT * FROM "+TABLE_NAME;

        Cursor cursor = db.rawQuery(query,null);

        String pass = "not found";


        cursor.moveToFirst();
        while(!cursor.isLast())
        {
            String duserName = cursor.getString(1);
            if(username.equals(duserName))
            {
                pass = cursor.getString(3);
                return pass;
            }
            cursor.moveToNext();

        }
        return pass;
    }


    int update_birthday(int id, String bday) {

        SQLiteDatabase sq = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(TAB_BDAY, bday);

        return sq.update(TABLE_NAME, cv, TAB_ID+" = ? ", new String[]{id+""});

    }


    int delete_bday(String bday){

        SQLiteDatabase s = this.getWritableDatabase();

        return s.delete(TABLE_NAME, TAB_BDAY+" = ?", new String[] {bday});

    }


}
