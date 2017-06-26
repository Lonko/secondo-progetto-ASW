# Secondo Progetto ASW
Secondo progetto per il corso di Architetture di Sistemi Software

### Istruzioni

Questa applicazione è accessibile al link http://swarm.inf.uniroma3.it:9004/.

Le possibili operazioni che si possono effettuare sul servizio principale sono due:

* /s/\<attore>/\<film> : restituisce informazioni (casuali) sull'\<attore> (numero di film in cui ha recitato) ed il personaggio (sempre casuale) interpretato in quel \<film> 
* /s/\<attore> : restituisce informazioni (casuali) sull'\<attore> (numero di film in cui ha recitato) ed il film (casuale) per il quale è più famoso

Anche sul servizio S1 sono possibili due operazioni: 

* /s1/\<attore>/\<film> : restituisce il personaggio (casuale) interpretato in quel \<film> dall'\<attore>
* /s1/\<attore> : restituisce il film (casuale) per il quale l'\<attore> è più famoso

Sul servizio S2 si può effettuare un'operazione: 

* /s2/\<attore> : restituisce il numero di film in cui l'\<attore> ha recitato

### Testing

Per effettuare dei test realistici (e quindi con stampe non casuali) si possono utilizzare i seguenti valori:

* attore = "Johnny Depp" (ed eventualmente film = "Pirati dei Caraibi")
* attore = "Leonardo di Caprio" (ed eventualmente film = "Titanic")

Nella home sono presenti i link per testare i servizi con riferimento al secondo caso (Leonardo di Caprio).
