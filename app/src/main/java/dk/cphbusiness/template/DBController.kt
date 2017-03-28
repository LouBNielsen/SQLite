package dk.cphbusiness.template

import android.app.Activity
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import org.jetbrains.anko.db.ManagedSQLiteOpenHelper
import javax.net.ssl.ManagerFactoryParameters

class DBController(var context: Context = App.instance) : ManagedSQLiteOpenHelper(context, DBController.DB_NAME, null, DBController.DB_VERSION){

    companion object {
        val DB_NAME = "TESTDB"
        val DB_VERSION = 1
        val instance by lazy {
            DBController()
        }
    }

    override fun onCreate(db: SQLiteDatabase?) {
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
    }

    override fun onDowngrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
    }

    fun query(db: SQLiteDatabase){
        db.execSQL("CREATE TABLE IF NOT EXISTS products (" +
                "productID INTEGER PRIMARY KET NOT NULL)")
    }

}

