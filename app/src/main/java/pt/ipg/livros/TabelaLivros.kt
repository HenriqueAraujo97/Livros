package pt.ipg.livros

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class TabelaLivros(db: SQLiteDatabase) {
    private val db: SQLiteDatabase = db

    fun cria() {
        db.execSQL("CREATE TABLE " + NOME_TABLEA+ "(" + BaseColumns._ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " +
                CAMPO_TITULO + " TEXT NOT NULL, " +
                CAMPO_AUTOR + " TEXT NOT NULL, " +
                CAMPO_ID_CATEGORIA + " INTEGER NOT NULL, FOREIGN KEY( " +
                CAMPO_ID_CATEGORIA + ") REFERENCES " +
                TabelaCategorias.NOME_TABELA +
                ") ")
    }

    companion object{
        const val NOME_TABLEA = "livros"
        const val  CAMPO_TITULO = "titulo"
        const val CAMPO_AUTOR = "autor"
        const val CAMPO_ID_CATEGORIA = "id_categoria"
    }
}