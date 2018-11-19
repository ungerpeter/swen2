## SWEN2 - User-Stories



**Administrator**

------

<Prio>							Münzbestand überwachen					<Story Points>

Als Administrator möchte ich den Münzbestand überwachen, um zu wissen, wie voll das Münzfach einer Parkuhr ist.

<Risiko>																	<Story Points> (PS)

------



**Parkplatzbenutzer**

------

<Prio>							Fahrzeug parkieren							<Story Points>

Als Parkplatzbenutzer möchte ich einen gültigen Geldbetrag einwerfen, um mein Fahrzeug für einen Zeitraum parkiert zu haben.

<Risiko>																	<Story Points> (PS)

Rückseite: Angenommen die Parkplatznummer wurde erfolgreich geprüft, wenn ich den Münzbetrag einwerfe, dann sehe ich die bezahlte Parkzeit. Angenommen ich werfe nicht vorgesehene Münzen ein, wenn ich zum Zahlen aufgefordert werde, dann erhalte ich die soeben eingeworfenen Münzen wieder zurück. Angenommen ich werfe zu viel Geld ein, wenn ich den Parkplatz bezahle, dann erhalte ich den Restbetrag wieder.

------



------

<Prio>							Vorhandene Parkzeit kontrollieren				<Story Points>

Als Parkplatzbenutzer möchte ich sehen, wie lange mein Parkplatz noch gedeckt ist, um zu wissen, wann ich spätestens wieder losfahren muss..

<Risiko>																	<Story Points> (PS)

Rückseite: Angenommen der Parkplatz ist besetzt, wenn ich die Zeit abfragen will, dann sehe ich die verbleibende bezahlte Zeit.

------



------

<Prio>							Ausgabe des Zahlungsbelegs					<Story Points>

Als Parkplatzbenutzer möchte ich einen Zahlungsbeleg erhalten, d.h. eine schriftliche Bestätigung in der Hand zu haben.

<Risiko>																	<Story Points> (PS)

Rückseite: Angenommen ich erhalte den Zahlungsbeleg, nachdem ich die Zahlung durchführte, dann sehe ich das Datum, denPreis (inkl. und exkl. Mehrwertsteuer) und die bezahlte Zeit.

------



**Wartungspersonal**

------

<Prio>							Liste der Parkplätze erhalten					<Story Points>

Als Wartungspersonal möchte ich eine Liste aller Parkplätze inkl. bezahlte Zeit sehen, um einen schnellen Überblick über die Auslastung der Parkplätze zu erhalten.

<Risiko>																	<Story Points> (PS)

Rückseite: Angenommen ich tippe die Kombination 4321 ein, wenn ich die Parkuhr bediene, dann sehe ich eine Übersicht aller Parkplätze der Parkplatznummer nach sortiert mit aktuellem Datum und der bezahlten Parkzeit. Angenommen die bezahlte Parkzeit wurde überschritten, wenn ich die Übersicht abfrage, dann soll die überschrittene Zeit angezeigt werden.

------



------

<Prio>							Münzbestand einstellen						<Story Points>

Als Wartungspersonal möchte ich den Münzbestand einstellen, um die Parkuhr zurücksetzen zu können.

<Risiko>																	<Story Points> (PS)

Rückseite: Angenommen ich tippe die Kombination 4545 in die Parkuhr ein, wenn ich sie bediene, dann kann ich neue Münzbestände eingeben. Angenommen ich möchte einen Bestand über 100 einstellen, wenn ich die Münzbestände bestimme, dann wird eine Fehlermeldung angezeigt. Angenommen ich beende den Ablauf, wenn ich die Münzbestände einstelle, dann sehe ich eine Übersicht der Gesamtbeträge pro Münztyp.

------



------

<Prio>							Transaktionslog anzeigen						<Story Points>

Als Wartungspersonal möchte ich ein Log aller Transaktionen einer Parkuhr sehen können, damit ich die Auslastung der Uhr prüfen kann.

<Risiko>																	<Story Points> (PS)

Rückseite: Angenommen ich tippe die Kombination 1234 in die Parkuhr ein, wenn ich sie bediene, dann sehe ich das Transaction Log der Parkuhr. Angenommen das Log wird angezeigt, wenn ich die Kombination eingebe, dann sehe ich für jeden Zahlung den bezahlten Betrag, den betroffenen Parkplatz, welche Münzen verwendet wurden, die bezahlte Parkzeit und den aktuellen Zeitpunkt.

------



------

<Prio>							Informationsübersicht						<Story Points>

Als Wartungspersonal möchte ich eine Übersicht aller wichtiger Informationen (Gesamtbetrag pro Münzeinheit, die Tabelle der Parkzeitdefinitionen, ein Test der Zeitberechnung und die Transaktionsanzeige) sehen, damit ich die Konfiguration der Parkuhr prüfen kann.

<Risiko>																	<Story Points> (PS)

Rückseite: Angenommen ich tippe die Kombination 9876 in die Parkuhr ein, wenn ich die Parkuhr bediene, dann wird die Übersicht aller wichtiger Informationen angezeigt.

------



------

<Prio>							Parkuhr testen								<Story Points>

Als Wartungspersonal möchte ich die Parkuhr testen können, um die Funktionalität der Parkuhr zu gewährleisten.

<Risiko>																	<Story Points> (PS)

Rückseite: Angenommen ich tippe die Kombination 8888 in die Parkuhr ein, wenn ich die Parkuhr bediene, dann wird der Test gestartet, welcher einen Münzanfangsbestand, das Parkieren und die Zeitberechnung simuliert..

------





**Vertiefungsfragen**

- Welche Probleme würden Sie erwarten, wenn Sie Requirements ausschliesslich über einen Fragebogen ermitteln würden?
  - Missverständnisse können von beiden Parteien nicht sofort geklärt werden und der Prozess wird somit in die Länge gezogen. Auf zusätzliche Anforderungen, die nicht durch den Fragebogen erhoben werden, können oftmals nur mühsam eingegangen werden. 
- Formulieren Sie folgende Fragen so um, dass sie offen und kontextfrei sind. 
  - Glaubst Du, dass der User ein Passwort eingeben sollte?
    - Ist ein Passwort notwendig?
  - Soll das System automatisch die Arbeit des Users alle 15 Minuten speichern?
    -  Soll in einem regelmässigen Abstand automatisch gespeichert werden?
  - Kann ein User die Datenbankeinträge welche durch einen anderen User gemacht wurden sehen?
    - Sind Eingaben von anderen Parteien einsehbar?
- Warum ist es am besten offene und kontextfreie Fragen in einem Fragebogen zu stellen
  - Damit man sich auf das wesentliche konzentriert und nicht die Antwort bereits in eine Richtung steuert.