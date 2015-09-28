package dao;

import vo.Word;

public interface DictionaryDAO {

	public Word findBySpanish(Word spWord);
	public Word findByEnglish(Word engWord);
	
}
