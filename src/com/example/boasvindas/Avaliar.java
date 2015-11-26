package com.example.boasvindas;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class Avaliar extends AvaliarSQLHelper {

	private static final String TB_AVALIACAO = "tb_avaliador";
	private static final String NOME_AVALIADOR = "nome";
	private AvaliarSQLHelper helper;
	
	public Avaliar(Context ctx) {
		super(ctx);
	}	

	public void AvaliarSQLHelper(Context ctx) {

		helper = new AvaliarSQLHelper(ctx);
	}

	public void inserir(Avaliar avaliar) {

		SQLiteDatabase bd = helper.getWritableDatabase();

		ContentValues valor = new ContentValues();

		valor.put(Avaliar.NOME_AVALIADOR, avaliar.getNome());

		bd.insert(Avaliar.TB_AVALIACAO, null, valor);

		bd.close();

	}

	private String getNome() {
		return null;
	}

}
