package com.example.boasvindas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AvaliarSQLHelper extends SQLiteOpenHelper{
	
	
	private static final String Nome_BD = "teste";	
	private static final int Ver_BD = 1;
	
	public static final String TB_AVALIACAO = "avaliar";
	public static final String NOME_AVALIADOR = "nome";
	public static final String TITULO_TRABALHO = "titulo";
	public static final String NOTA = "nota";
	public static final String COMENTATIO = "Comentatio";
	public static final String ID = "id";
	
	public AvaliarSQLHelper(Context ctx) {
		super(ctx, Nome_BD, null, Ver_BD);
	}
	
	public void onCreate(SQLiteDatabase bd) {
		bd.execSQL(
				" CREATE TABLE " + TB_AVALIACAO 
				+ " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " 
				+  NOME_AVALIADOR + " TEXT NOT NULL + "+ TITULO_TRABALHO + 
				" TEXT NOT NULL + "+ NOTA + " INTEGER PRIMARY KEY AUTOINCREMENT+"
				+ COMENTATIO + " TEXT NOT NULL + ");
		
	}

	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
	}

	public SQLiteDatabase getWritableDatabase() {
		
		return null;
	}

}
