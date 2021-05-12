package pt.ipg.livros

import android.content.Context
import android.database.DatabaseErrorHandler
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class BdLivrosOpenHelper(context: Context?) : SQLiteOpenHelper(context, NOME_BASE_DADOS, null, VERSAO_BASE_DADOS) {
    override fun onCreate(p0: SQLiteDatabase?) {

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

    }

    companion object{
        const val NOME_BASE_DADOS = "Livros.db"
        const val VERSAO_BASE_DADOS = 1
    }

}