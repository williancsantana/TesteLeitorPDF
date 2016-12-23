package util.job;

import javax.ejb.Lock;

import javax.ejb.LockType;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * 
 * @author Willian Cardoso
 *
 */

@Singleton
@Lock(LockType.READ) // allows timers to execute in parallel
@Startup
public class TarefaAgendada {

	
	@Schedule(dayOfWeek = "*", second="0", minute="0", hour="8", 
			persistent = false)
	public void doWork(){
		//	A função executará no horário agendado o que
		//	for definido na função.
		// Passos a serem seguidos:
		// 1 - verificar se uma URL dada pelo usuário é valida
		// 2 - sendo a url válida, efetuar o download dos arquivos PDF
		// 3 - a definir
	}
}
