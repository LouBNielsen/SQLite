package dk.cphbusiness.template

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.amitshekhar.DebugDB
import kotlinx.android.synthetic.main.activity_sqlite.*
import org.jetbrains.anko.toast

class SQLite : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sqlite)

        buttonSQLite.setOnClickListener {
            funSQLite()
        }
    }

    fun funSQLite(){
        toast("hejsa")

        Log.d("DebugDatabase", "DebugDatabaseAdress" + DebugDB.getAddressLog())

        val DBCtrl : DBController = DBController.instance
        val DB = DBCtrl.getWritableDatabase()
        DBCtrl.query(DB)
    }
}
