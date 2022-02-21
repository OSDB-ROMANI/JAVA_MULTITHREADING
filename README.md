# JAVA_MULTITHREADING
<h2>INTRODUZIONE - Processo e Thead</h2>
<h3>PROCESSO</h3>
<li>E' l'esecuzione di un software al quale il SO assegna una porzione di memoria (RAM) e un id univoco per poterlo gestire.</li>
<li>Lo spazio di memoria non è condiviso.</li>
<li>Non può interagire direttamente col altri processi.</li>
<h3>THREAD</h3>
<li>Detto processo "leggero".</li>
<li>E' generato durante l'esecuzione di un programma.</li>
<li>E' un sotto processo.</li>
<li>Gestito dal JVM come se fosse un processo indipendente dai processo o altri sotto processi.</li>
<li>Scopo: dividere il processo in piccole parti (thread) ognuna con uno scopo preciso per occuparsi di un compito specifico.</li>
<li>Condividono lo spazio di memoria (RAM) del processo.</li>
<li>Hanno un id univoco per essere gestiti.</li>
<h2>CICLO DI VITA DI UN THREAD</h2>
Elenco stati del thread:
<ol>
  <li>start</li>
  <li>pronto</li>
  <li>esecuzione</li>
  <li>sospeso</li>
  <li>in attesa</li>
  <li>bloccato</li>
  <li>terminato</li>
</ol>
<li>Dallo stato di start (1) un thread può andare in pronto (2) con lo start()</li>
<li>Dallo stato di pronto (2) un thread può andare in esecuzione (3)</li>
<li>Dallo stato in esecuzione (3) un thread può andare in:
  <ul>
    <li>pronto (2) quando scaduto;</li>
    <li>sospeso (4) con una sleep();</li>
    <li>in attesa (5) con un wait();</li>
    <li>bloccato (6) con una richiesta di I/O;</li>
    <li>terminato (7) quando finisce il suo compito;</li>
  </ul>
</li>
<li>Dallo stato in sospeso (4) un thread può andare in pronto (2)</li>
<li>Dallo stato in attesa (5) un thread può andare in pronto (2) con una notify()</li>
<li>Dallo stato di bloccato (6) un thread può andare in pronto (2) quando termina la richiesta di I/O</li>
<li>Dallo stato terminato (7) un thread viene "cancellato"</li>
</hr>
<h1>IMPLENTAZIONE IN JAVA</h1>
I thread in Java si possono implementare in due modi:
<li>Estendendo la classe Thread</li>
<li>Implementado la classe Runnable</li>
<h2>extends Thread</h2>
<li>@override del metodo run(): contiene tutte le istruzione che deve svolgere il thread</li>
<li>nel main devo creare un oggetto della classe invocare il metodo start</li>
Esempio MultiThread
<h2>implements Runnable</h2>
<li>@override del metodo run(): contiene tutte le istruzione che deve svolgere il thread</li>
<li>nel main si crea un oggetto della classe ma va utilizzato per creare il thread dalla classe Thread e poi utilizzare il metodo start()</li>
Si utilizza Runnable quando abbiamo bisogno di estendere la classe.
Esempio MultiRunnable

<h2>INDIPENDENZA</h2>
Gli esempio mostrano il concetto dell'indipendenza dei sotto processi, cioè il primo a essere lanciato non è detto che termini per primo (dipende dalla gestione della CPU) e se un thread termina per un errore o altro motivo gli altri proseguono col loro compito.
<h3>La concorranza verrà trattata in un altro post</h3>
